package io.file;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		// 在当前目录下新建一个文件：myfile.txt
		File file = new File("./test.txt");
		// 输出文件是否存在
		System.out.println("是否存在:"+file.exists());

		// 如果文件已经存在，则输出文件已存在
		// 如果文件不存在，则创建该文件
		if (file.exists()) {
			System.out.println("该文件已存在！");
		} else {
			file.createNewFile();
			System.out.println("文件创建完毕！");
		}

	}
}
