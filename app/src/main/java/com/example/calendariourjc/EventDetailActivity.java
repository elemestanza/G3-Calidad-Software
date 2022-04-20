package com.example.calendariourjc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.calendariourjc.model.DateEvent;

import java.util.HashMap;
import java.util.Map;

public class EventDetailActivity<activity_event_detail> extends AppCompatActivity {

    Button addCommentBtn;
    static Button BotonSalida;
    TextView titleView;
    TextView dateView;
    static TextView descriptionView;
    LinearLayout commentsview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);

        int id = (int) getInfo("id");
        String title = (String) getInfo("title");
        String date = (String) getInfo("date");
        String description = (String) getInfo("description");
        BotonSalida = (Button) findViewById(R.id.boton_salir);

        createViews(title, date, description);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        HashMap<Integer, String> comments = new HashMap<>(DateEvent.getAllComments(id, sharedPrefs));
        showComments(comments, id, sharedPrefs);

        createAddCommentButton(id, title, date, description);

        BotonSalida.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(EventDetailActivity.this,MainActivity.class);
                setContentView(R.layout.activity_event_detail);
                startActivity(intent);
                finish();
            }
        });
    }

    private void createViews(String title, String date, String description){
        titleView = findViewById(R.id.event_title);
        dateView = findViewById(R.id.event_date);
        descriptionView = findViewById(R.id.event_description);
        commentsview = findViewById(R.id.comments_view);

        titleView.setText(title);
        dateView.setText("Fecha: " + date);
        descriptionView.setText("Descripción:\n\n" + description);
    }

    private Object getInfo(String key){
        Intent intent = getIntent();
        if(key.equals("id")){
            return intent.getIntExtra(key, 0);
        } else {
            return intent.getStringExtra(key);
        }
    }

    private void showComments(HashMap<Integer, String> comments, int id, SharedPreferences sharedPrefs){
        for (Map.Entry<Integer, String> comment: comments.entrySet()) {
            LinearLayout layout = new LinearLayout(this);
            layout.setOrientation(LinearLayout.VERTICAL);

            TextView commentText = new TextView(this);
            commentText.setText(comment.getValue());

            Button deleteBtn = new Button(this);
            deleteBtn.setText("Borrar comentario");

            deleteBtn.setOnClickListener(view -> {
                commentsview.removeView(layout);
                DateEvent.deleteComment(id, comment.getKey(), sharedPrefs);
            });

            layout.addView(commentText);
            layout.addView(deleteBtn);

            commentsview.addView(layout);
        }
    }

    private void createAddCommentButton(int id, String title, String date, String description){
        addCommentBtn = findViewById(R.id.add_comment_btn);

        addCommentBtn.setOnClickListener(view -> {
            Intent addComment = new Intent(EventDetailActivity.this, CommentActivity.class);
            addComment.putExtra("id", id)
                    .putExtra("title", title)
                    .putExtra("date", date)
                    .putExtra("description", description);
            EventDetailActivity.this.startActivity(addComment);
        });
    }
}