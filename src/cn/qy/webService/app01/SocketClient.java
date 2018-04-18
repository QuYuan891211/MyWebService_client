package cn.qy.webService.app01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception{
        String sendData = "adnskglejgioiuagasdgxaa";
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(sendData.getBytes());

        InputStream inputStream = socket.getInputStream();
        int len = -1;
        byte[] buffer = new byte[2];
        String data = "";
        while ((len = inputStream.read(buffer))!= -1){
            data += new String(buffer,0,len);
        }
        System.out.println(data);
    }
}
