package com.humbledude;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;

import java.io.IOException;

/**
 * Created by keunhui.park on 2017. 4. 20..
 *
 * http://d2.naver.com/helloworld/1113548
 */
public class ProcessWay {

    private static final String PYTHON = "python";

    private DefaultExecutor executor;

    public ProcessWay() {
        executor = new DefaultExecutor();
    }

    public void run(String scriptPath) throws IOException {
        CommandLine commandLine = CommandLine.parse(PYTHON).addArgument(scriptPath);
        executor.execute(commandLine);
    }
}
