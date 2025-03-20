package ru.db.annotations;

import lombok.extern.slf4j.Slf4j;

/**
 * @Slf4j
 * Добавляет логгер в класс (требуется зависимость SLF4J)
 */
@Slf4j
public class LoggerLombok {
    public void logMessage() {
        log.info("Это лог сообщение!");
    }
}