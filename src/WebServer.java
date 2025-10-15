import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;


public class WebServer {

    public static void main(String[] args) {
        int port = 1989;

        try {

            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Sunucu " + port + " portunda başlatıldı. Tarayıcıdan http://localhost:1989 adresine gidiniz.");


            while (true) {
                try {

                    Socket clientSocket = serverSocket.accept();
                    System.out.println("Yeni bir istemci bağlandı: " + clientSocket.getInetAddress().getHostAddress());


                    ClientHandler clientHandler = new ClientHandler(clientSocket);


                    new Thread(clientHandler).start();

                } catch (IOException e) {
                    System.err.println("İstemci bağlantısı kabul edilirken hata oluştu: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.err.println("Sunucu " + port + " portunda başlatılamadı: " + e.getMessage());
            e.printStackTrace();
        }
    }
}