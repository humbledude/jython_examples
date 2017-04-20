package com.humbledude;

import javax.script.ScriptException;
import java.io.FileNotFoundException;

/**
 * Created by keunhui.park on 2017. 4. 20..
 */
public class App {

    public static void main(String args[]) throws FileNotFoundException, ScriptException {

        JythonWay jythonWay = new JythonWay("src/main/python/HelloWorld.py");
        jythonWay.run();

    }
}
