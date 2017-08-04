package io.sopra.pox3.serveur;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			ServerSocket socketserver = new ServerSocket(9090);
			System.out.println("Serveur créé\nEn attente de connexion...\n");
			Socket communicationAvecClient = socketserver.accept();
			System.out.println("Connexion établie\n");

			InputStream is2 = communicationAvecClient.getInputStream();
			// ObjectInputStream ois2 = new ObjectInputStream(is2);

			while (true) {
				int d = is2.read();
				if (d == -1)
					break;
				System.out.print((char) (d & 0xff));
			}

			/*
			 * InputStream is = communicationAvecClient.getInputStream();
			 * ObjectInputStream ois = new ObjectInputStream(is); int a =
			 * ois.readInt(); int b = ois.readInt(); System.out.println(a);
			 * System.out.println(b);
			 * 
			 * OutputStream os = communicationAvecClient.getOutputStream();
			 * ObjectOutputStream oos = new ObjectOutputStream(os);
			 * 
			 * oos.writeInt(a + b); oos.flush();
			 * 
			 * 
			 * 
			 * ois.close(); is.close(); oos.close(); os.close();
			 */
			communicationAvecClient.close();
			System.out.println("Connexion terminée\n");

			socketserver.close();
			System.out.println("Serveur fermé\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
