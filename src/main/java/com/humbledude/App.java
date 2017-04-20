package com.humbledude;

import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by keunhui.park on 2017. 4. 20..
 */
public class App {

    public static void main(String args[]) throws IOException, ScriptException {

        String scriptPath = "src/main/python/HelloWorld.py";

        JythonWay jythonWay = new JythonWay();
        jythonWay.run(scriptPath);

        ProcessWay processWay = new ProcessWay();
        processWay.run(scriptPath);

    }
}
