package b2c.dojo.stream;

import java.util.stream.Stream;

public class Ex {

	public static void main(String[] args) {
		
		
		long c = Stream.of("A", "B")
		.flatMap(s -> Stream.of(1, 2))
		.count();
		
		System.out.println(c);
	}
}
