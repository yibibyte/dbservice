package ru.db.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
        private static final Logger log = LoggerFactory.getLogger(LoggerDemo.class);

        public void logMessage() {
            log.info("Это лог сообщение!");
        }
    }