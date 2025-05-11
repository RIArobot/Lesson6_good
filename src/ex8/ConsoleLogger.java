package ex8;

class ConsoleLogger implements ILogger {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
