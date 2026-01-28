package com.thienbao.net;

import java.net.URI;
import java.net.URL;

public class UrlExample {

    public static void main(String[] args) throws Exception {
        URL url = new URI("https://test-host:8080/java/test-path.html?query=test-query#test-ref").toURL();

        log(url);
    }

    public static void log(URL url) {
        System.out.println("URL: " + url);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("File name: " + url.getFile());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Authority: " + url.getAuthority());
        System.out.println("Path: " + url.getPath());
        System.out.println("Ref: " + url.getRef());
        System.out.println("Default port: " + url.getDefaultPort());
    }

}