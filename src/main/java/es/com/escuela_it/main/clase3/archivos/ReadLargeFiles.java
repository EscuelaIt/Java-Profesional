package es.com.escuela_it.main.clase3.archivos;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadLargeFiles {

	public static void main(String[] args) throws IOException {

		try (RandomAccessFile reader = new RandomAccessFile("/opt/archivo.txt", "r");
				FileChannel channel = reader.getChannel();
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			int bufferSize = 1024;
			if (bufferSize > channel.size()) {
				bufferSize = (int) channel.size();
			}
			ByteBuffer buff = ByteBuffer.allocate(bufferSize);

			while (channel.read(buff) > 0) {
				out.write(buff.array(), 0, buff.position());
				buff.clear();
			}

			String fileContent = new String(out.toByteArray());
			
			System.out.println(fileContent);

		}
	}

}
