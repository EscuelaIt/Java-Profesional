package es.com.escuela_it.main.clase3.archivos;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

		serverSocketChannel.socket().bind(new InetSocketAddress(9999));
		serverSocketChannel.configureBlocking(false);

		while (true) {
		
			SocketChannel socketChannel = serverSocketChannel.accept();

			if (socketChannel != null) {

				System.out.println("se conecto");
				
			}
		}

	}

}
