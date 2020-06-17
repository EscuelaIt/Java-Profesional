package es.com.escuela_it.main.clase2.exceptions;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class SampleAsynchronicFileReader {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("c:\\data\\test-write.txt");
		
		AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);

		ByteBuffer buffer = ByteBuffer.allocate(10);
		long position = 0;

		Future<Integer> operation = fileChannel.read(buffer, position);

		while (!operation.isDone())
			;

		buffer.flip();
		byte[] data = new byte[buffer.limit()];
		buffer.get(data);
		System.out.println(new String(data));
		buffer.clear();

	}

}
