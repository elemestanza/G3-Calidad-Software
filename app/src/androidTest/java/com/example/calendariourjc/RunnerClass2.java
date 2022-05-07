package com.example.calendariourjc;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "com/example/calendariourjc/Features/HU2.feature",
        glue = "com/example/calendariourjc/TestModificar.java",
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "html:build/cucumber-html-report"}
)

public class RunnerClass2 {

}