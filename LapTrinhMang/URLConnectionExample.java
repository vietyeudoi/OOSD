package com.thienbao.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExample {

    public static void main(String[] args) throws Exception {
        URL url = new URI("https://qnu.edu.vn").toURL();
        URLConnection urlConnection = url.openConnection();

        log(urlConnection);
    }

    public static void log(URLConnection urlConnection) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
        System.out.println(sb);
    }

}