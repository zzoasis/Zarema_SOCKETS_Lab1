package zarema_sockets_lab1;

import java.io.IOException;

public class startServer {

    public static void main(String[] args) throws IOException {
        MyServer server = new MyServer();
        server.start();
    }
}