package com.example.friendshipneverends.Entity;

import java.util.Scanner;

public class Protocol {
    private String method;
    private String sourceEmail;
    private String sourceHost;
    private String destinationEmail;
    private String destinationHost;
    private String version;

    public Protocol(String request) {
        Scanner s = new Scanner(request);
        this.method = s.next();
        this.sourceEmail = s.next();
        this.sourceHost = s.next();
        this.destinationEmail = s.next();
        this.destinationHost = s.next();
        this.version = s.nextLine();
    }

    @Override
    public String toString() {
        return method + '\'' +
                " " + sourceEmail +
                " " + sourceHost +
                " '" + destinationEmail +
                " " + destinationHost +
                " " + version + "\r\n";
    }

    public String getMethod() {
        return method;
    }

    public String getSourceEmail() {
        return sourceEmail;
    }

    public String getSourceHost() {
        return sourceHost;
    }

    public String getDestinationEmail() {
        return destinationEmail;
    }

    public String getDestinationHost() {
        return destinationHost;
    }

    public String getVersion() {
        return version;
    }
}
