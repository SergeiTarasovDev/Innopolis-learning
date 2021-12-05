package com.learning;

public class Logger {
    private static final Logger instance;

    static {
        instance = new Logger();
    }

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    private String lastMessage;

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    /**
     * print message to the console
     * @param message
     */
    public void log(String message) {
        this.lastMessage = message;
        System.out.println(message);
    }

}
