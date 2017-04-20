package com.humbledude;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringWriter;

/**
 * Created by keunhui.park on 2017. 4. 20..
 *
 * http://stackoverflow.com/questions/10097491/call-and-receive-output-from-python-script-in-java
 */
public class JythonWay {

    private String scriptPath;

    public JythonWay(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public void run() throws FileNotFoundException, ScriptException {

        StringWriter writer = new StringWriter();
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptContext context = new SimpleScriptContext();

        context.setWriter(writer);
        ScriptEngine engine = manager.getEngineByName("python");
        engine.eval(new FileReader(scriptPath), context);

        System.out.println(writer.toString());
    }


}
