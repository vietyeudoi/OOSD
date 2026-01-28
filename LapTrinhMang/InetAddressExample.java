package com.thienbao.net;

import java.net.InetAddress;

public class InetAddressExample {

    public static void main(String[] args) throws Exception {
        InetAddress inetAddress;

        inetAddress = InetAddress.getLocalHost();
        System.out.println("\nHost Name: " + inetAddress.getHostName());
        System.out.println("IP Address: " + inetAddress.getHostAddress());

        inetAddress = InetAddress.getByName("qnu.edu.vn");
        System.out.println("\nHost Name: " + inetAddress.getHostName());
        System.out.println("IP Address: " + inetAddress.getHostAddress());

        System.out.println("\nAll address of QNU: ");
        InetAddress[] inetAddresses = InetAddress.getAllByName("qnu.edu.vn");

        for (InetAddress item : inetAddresses) {
            System.out.println(item);
        }
    }

}