package lt.techin;

class Logger {
    public void logInformation(String logInfo) {
        System.out.println(logInfo);
    }
}

class LoggingToFileA {
    private Logger logger;

    public LoggingToFileA(Logger logger) {
        this.logger = logger;
    }

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
