package lt.techin;


interface ILogger {
    void logInformation(String logInfo);
}

class Logger implements ILogger {
    public void logInformation(String logInfo) {
        System.out.println(logInfo);
    }
}

record LoggingToFileA(ILogger logger) {

    public void logging() {
        logger.logInformation("A B C");
    }
}

class LoggingToFile {

    public static void main(String[] args) {

        LoggingToFileA fileLogger = new LoggingToFileA(new Logger());
        fileLogger.logging();

        Logger logger = new Logger();
        logger.logInformation("a-b-c");

    }
}
