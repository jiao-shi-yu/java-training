package io.stream.fileStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 使用文件输入流读取文件
 * @author yuyu
 *
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("fos.dat");
		/**
		 * fos.dat: 0000000100000010
		 * 			^^^^^^^^
		 * d: 00000000 00000000 00000000 00000001   = 1
		 */
		int d = fis.read();
		System.out.println(d);
		/**
		 * fos.dat: 0000000100000010
		 * 			        ^^^^^^^^
		 * d: 00000000 00000000 00000000 00000010   = 2
		 */
		d = fis.read();
		System.out.println(d);
		/**
		 * fos.dat: 0000000100000010
		 * 							^^^^^^^^
		 * d: 11111111 11111111 11111111 11111111  = -1
		 */
		d = fis.read();   // -1, 表示文件末尾
		System.out.println(d);
	}
}
