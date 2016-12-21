package SerenityCucumberMainPackage;

import cucumber.api.CucumberOptions;

import cucumber.api.java.gl.E;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

/**
 * Created by dhinesh.dillum on 20/12/16.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/main/resources",
        plugin = {
                "pretty", "html:target/cucumber-html-reports",
                "json:target/cucumber.json"},
        tags = "@Test")

public class taskRunnerTest {


    public void test() {
        System.out.println(" test ");
    }

    public static void run(Class testClass) {
        JUnitCore jUnitCore = new JUnitCore();
        jUnitCore.run(new Computer(), testClass);
    }

}
