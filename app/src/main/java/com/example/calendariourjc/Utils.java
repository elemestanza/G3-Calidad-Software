package com.example.calendariourjc;

public class Utils {

    public boolean checkDescription(String description){
        return !description.contains("@") && !description.contains("ñ");
    }
}
