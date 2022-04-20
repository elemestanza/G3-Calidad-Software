package com.example.calendariourjc;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "com/example/calendariourjc/Features/HU1.feature",
        glue = "com/example/calendariourjc/TestBotonSalida.java",
        plugin = {"pretty",
                "html:target/cucumber",
                "json:target/cucumber.json",
                "html:build/cucumber-html-report"}
)

public class RunnerClass1 {

}
