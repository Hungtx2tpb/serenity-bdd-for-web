package bb.utils;

import net.serenitybdd.model.SerenitySystemProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil {

    private static final Logger logger = LoggerFactory.getLogger(LoggerUtil.class);
    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logDebug(String message) {
        logger.debug(message);
    }

    public static void logWarn(String message) {
        logger.warn(message);
    }

    public static void logError(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    public static void logError(String message) {
        logger.error(message);
    }

    public static void initializeAndLogTime() {
        long startTime = System.nanoTime();
        // SerenitySystemProperties.getProperties() sẽ buộc Serenity đọc file serenity.conf
        SerenitySystemProperties.getProperties();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // Chuyển đổi từ nano giây sang mili giây
        System.out.println("Thời gian load file serenity.conf: {} ms" + duration);
    }
}
