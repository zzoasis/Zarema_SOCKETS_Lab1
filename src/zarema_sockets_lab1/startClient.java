package zarema_sockets_lab1;

import java.io.IOException;

public class startClient {

    public static void main(String[] args) throws IOException {
        MyClient client = new MyClient();
        client.start(args);
        //client.stop();
    }
}
