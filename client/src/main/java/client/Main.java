package client;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClientApp clientApp = new ClientApp("127.0.0.1", 8100);
        clientApp.connect();
    }
}
