package com.example.parser.interpreter;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EvaluatorLogger {

    private static Logger logger = null;

    public static Logger getLogger() {
        if (logger == null) {
            logger = Logger.getLogger("EvaluatorLogger");
            logger.setLevel(Level.ALL);
            try {
                FileHandler fileHandler = new FileHandler("EvaluatorLogs.log", true);
                fileHandler.setFormatter(new SimpleFormatter());
                logger.addHandler(fileHandler);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Error creating log file", e);
            }
        }
        return logger;
    }
}

