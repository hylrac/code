package io.sopra.pox3.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		String host="localhost";
		int port=9090;
		try {
			Socket socket = new Socket(host, port);
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeInt(34);
			oos.writeInt(45);
			oos.flush();
			
			
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			int c = ois.readInt();
			System.out.println(c);
			
			oos.close();
			os.close();
			ois.close();
			is.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
