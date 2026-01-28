package LapTrinhSocket.Multicast;

import java.net.*;

public class MulticastReceiver {

    public static final byte[] BUFFER = new byte[4096];

    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName(MulticastSender.GROUP_ADDRESS);

            MulticastSocket socket = new MulticastSocket(MulticastSender.PORT);

            NetworkInterface ni = NetworkInterface.getByInetAddress(
                    InetAddress.getLocalHost()
            );

            socket.joinGroup(new InetSocketAddress(group, MulticastSender.PORT), ni);

            while (true) {
                DatagramPacket packet = new DatagramPacket(BUFFER, BUFFER.length);
                socket.receive(packet);
                String msg = new String(packet.getData(), 0, packet.getLength());
                System.out.println("From " + packet.getAddress() + " : " + msg);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
