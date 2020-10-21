package com.day5.session1;

import java.io.*;

public class ReadTheFile {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(new File("data.txt")));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("file is not found!");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		finally {
			try {
				if(br!=null)
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
