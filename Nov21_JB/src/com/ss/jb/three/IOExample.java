package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOExample {

	public static void main(String[] args) {
		readFromFileBuf();
	}

	synchronized public static void readFromFileNoBuf() { //method sync
		InputStream is = null;
		try {
			synchronized (is) { // block
				is = new FileInputStream("resources/in/input.txt"); // rel path
				is = new FileInputStream("C:\\Users\\ppradhan\\git\\nov21java\\Nov21_JB\\resources\\in\\input.txt"); // rel
																														// path
				int data = is.read();
				while (data != -1) {
					data = is.read();
					System.out.println(data);
				}
			}
//			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void readFromFileBuf() {
		try (BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\ppradhan\\git\\nov21java\\Nov21_JB\\resources\\in\\input.txt"))) {
			writeToFileStream(br.readLine());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToFileStream(String data) {
		try (OutputStream output = new FileOutputStream("resources/in/output.txt")) {
			output.write(data.getBytes());
			writeUsingFile(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeUsingFile(String data) throws IOException {
		Files.write(Paths.get("resources/in/output_a.txt"), data.getBytes());
	}

}
