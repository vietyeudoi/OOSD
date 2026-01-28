package LapTrinhSocket.Multicast;

import java.net.*;

public class MulticastSender {

    public static final String GROUP_ADDRESS = "230.0.0.1";
    public static final int PORT = 8888;

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName(GROUP_ADDRESS);

            MulticastSocket socket = new MulticastSocket();

            // 🔥 BẮT BUỘC trên Windows
            NetworkInterface ni = NetworkInterface.getByInetAddress(
                    InetAddress.getLocalHost()
            );
            socket.setNetworkInterface(ni);

            long counter = 0;
            while (true) {
                String msg = "Sent message No. " + counter++;
                DatagramPacket packet = new DatagramPacket(
                        msg.getBytes(),
                        msg.length(),
                        group,
                        PORT
                );

                socket.send(packet);
                System.out.println("Server sent: " + msg);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
