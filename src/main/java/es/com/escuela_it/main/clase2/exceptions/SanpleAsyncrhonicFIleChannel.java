package es.com.escuela_it.main.clase2.exceptions;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class SanpleAsyncrhonicFIleChannel {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("c:\\data\\test-write.txt");

		if (!Files.exists(path)) {

			Files.createFile(path);
		
		}

		AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE);

		
		//Simulando alto nivel de contenido
		StringBuilder str = new StringBuilder();
		for (int i=0;i<100000;i++)
		str.append("asdfadfs asdfafdsafds  adfsadfsafsdfadsfsda asdfafdsfasdafds asdfafdsfasdafds asdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafdsasdfafdsfasdafds");
		byte[] contentBytes = str.toString().getBytes();
		
		ByteBuffer buffer = ByteBuffer.allocate(contentBytes.length);
		long position = 0;
		
		buffer.put(contentBytes);
		buffer.flip();

		Future<Integer> operation = fileChannel.write(buffer, position);
		buffer.clear();
		
		
		
		System.out.println("ejecutando otra cosa " + operation.isDone());
		System.out.println("mi programa sigue " + operation.isDone());

		while (!operation.isDone()) {
			System.out.println("ejecutando otra cosa");
		}

		System.out.println("Write done");

	}

}
