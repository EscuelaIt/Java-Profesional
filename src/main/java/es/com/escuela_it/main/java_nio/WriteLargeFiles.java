package es.com.escuela_it.main.java_nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class WriteLargeFiles {

	public static void saveFile(String path) throws IOException {

		String file = path;
		
		try (RandomAccessFile writer = new RandomAccessFile(file, "rw"); 
				FileChannel channel = writer.getChannel()) {

			ByteBuffer buff = ByteBuffer.wrap("Hello world".getBytes());

			channel.write(buff);

		}

	}

}
