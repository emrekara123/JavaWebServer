import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;


public class ClientHandler implements Runnable {


    private final Socket clientSocket;


    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }


    @Override
    public void run() {
        try (

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                OutputStream out = clientSocket.getOutputStream()
        ) {

            String requestLine = in.readLine();
            System.out.println("İstek alındı: " + requestLine);


            String htmlContent = HtmlGenerator.getHomePageHtml();

            // 2. HTTP Yanıt Başlıkları
            String httpHeader = "HTTP/1.1 200 OK\r\n"
                    + "Content-Type: text/html; charset=UTF-8\r\n"
                    + "Content-Length: " + htmlContent.getBytes("UTF-8").length + "\r\n"
                    + "\r\n";


            out.write(httpHeader.getBytes("UTF-8"));
            out.write(htmlContent.getBytes("UTF-8"));
            out.flush();

        } catch (Exception e) {
            System.err.println("İstemci işlenirken hata oluştu: " + e.getMessage());
        } finally {
            System.out.println("İstemci bağlantısı kapatıldı: " + clientSocket.getInetAddress().getHostAddress());

        }
    }
}