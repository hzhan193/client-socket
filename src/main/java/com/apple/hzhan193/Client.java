package com.apple.hzhan193;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class Client
{
    public static void main( String[] args ) {
        String host = "127.0.0.1";
        int port = 8000;
        try {
            Socket socket = new Socket(host, port);
            System.out.println("connecting to server...");

            String message = "this is the message sent from client";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(message.getBytes("UTF-8"));
            outputStream.close();
            socket.close();
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
