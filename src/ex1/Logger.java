package ex1;

import java.time.LocalDateTime;

// Общий класс для логирования (устраняем дублирование)
public class Logger {
    public static void logError(String context, Exception e) {
        String errorTime = LocalDateTime.now().toString();
        System.out.println("[ERROR][" + errorTime + "] Ошибка в " + context + ": " + e.getMessage());
    }
}
