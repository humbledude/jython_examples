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

    private static final String PYTHON = "python";

    ScriptEngine engine;

    public JythonWay() {
        engine = new ScriptEngineManager().getEngineByName(PYTHON);
    }

    public void run(String scriptPath) throws FileNotFoundException, ScriptException {

        ScriptContext context = new SimpleScriptContext();
        StringWriter writer = new StringWriter();
        context.setWriter(writer);

        engine.eval(new FileReader(scriptPath), context);
        System.out.println(writer.toString());
    }


}
