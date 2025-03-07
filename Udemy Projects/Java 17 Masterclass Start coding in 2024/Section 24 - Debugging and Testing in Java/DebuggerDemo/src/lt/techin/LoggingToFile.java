package lt.techin;


interface ILogger {
    public void logInformation(String logInfo);
}

class Logger implements ILogger {
    public void logInformation(String logInfo) {
        System.out.println(logInfo);
    }
}

class LoggingToFileA {
    private ILogger logger;

    public LoggingToFileA(ILogger logger) {
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
