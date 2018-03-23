package day17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Work1 {

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("D:/hello.java"); BufferedReader br = new BufferedReader(fr);) {
			String strLine = null;
			while ((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * fr.close(); br.close();
		 */

	}

}
