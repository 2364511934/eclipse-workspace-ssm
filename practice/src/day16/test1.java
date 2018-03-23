package day16;

import java.util.stream.IntStream;

public class test1 {

	public static void main(String[] args) {
		IntStream stream = IntStream.builder().add(20).build();
		stream.max();
	}

}
