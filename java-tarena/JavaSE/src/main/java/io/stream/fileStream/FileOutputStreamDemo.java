package io.stream.fileStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输出流示例
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("./fos.dat");

		// 00000000 00000000 00000000 00000001
		fos.write(1); // fos.dat: 00000001
		fos.write(2); // fos.dat: 0000000100000010
		System.out.println("写出完毕!");
		fos.close();

	}
}
