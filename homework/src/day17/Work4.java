package day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work4 {

	public static void main(String[] args) throws IOException {
		try (FileWriter fw = new FileWriter("d:/copyfile.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				FileReader fr = new FileReader("d:/file.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line = null;

			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("¿½±´³É¹¦!!!");
		/*
		 * bw.close(); br.close();
		 */

	}

}
