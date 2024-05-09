package com.glue;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by duongnapham on 3/2/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
                    glue = "com/glue",
                    monochrome = true,
                    dryRun = false,
                    plugin = {"pretty", "junit:results/test-output.xml", "json:results/test-output.json", "html:results/test-output.html"}
                )
public class RunTest {
}
