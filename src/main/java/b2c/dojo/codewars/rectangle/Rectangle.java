package b2c.dojo.codewars.rectangle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
/**
 * from https://www.codewars.com/kata/58b22dc7a5d5def60300002a
 *
 */
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle {

	private int sho;
	private int lon;

	public Rectangle(int a, int b) {
		this.lon = (a > b) ? a : b;
		this.sho = (a > b) ? b : a;
	}

	public static void main(String[] args) {
		//rectIntoRects(13, 5);
		rectIntoRects(4, 3);
	}

	public static List<String> rectIntoRects(int lngth, int wdth) {

		List<Integer> squares = new Rectangle(lngth, wdth).decompose();
		squares.sort(Integer::compareTo);
		System.out.println(squares);

		//Collection<Rectangle> result = new HashSet<Rectangle>();
		Collection<Rectangle> result = new ArrayList<>();

		Integer a = squares.get(0);
		new Rectangle(a, a).compose(listExcept(squares, a), result);
		
//		Set<Integer> dsq = new HashSet<Integer>(squares);
//		for (Integer a : dsq) {
//			new Rectangle(a, a).compose(listExcept(squares, a), result);
//		}

		List<String> x = result.stream().filter(Rectangle::isTrueRect).map(Rectangle::toString).collect(Collectors.toList());
		System.out.println(x);
		return x;
	}

	private static ArrayList<Integer> listExcept(List<Integer> l, Integer i) {
		ArrayList<Integer> rem = new ArrayList<Integer>(l);
		rem.remove(i);
		return rem;
	}

	private void compose(ArrayList<Integer> squares, Collection<Rectangle> result) {
		System.out.println(this + " + " + squares);
		result.add(this);
		if (squares.contains(sho)) {
			new Rectangle(sho, lon + sho).compose(listExcept(squares, sho), result);
		}
		else if (squares.contains(lon)) {
			new Rectangle(lon, sho + lon).compose(listExcept(squares, lon), result);
		}

	}

	private List<Integer> decompose() {
		List<Integer> squares = new ArrayList<Integer>();
		squares.add(sho);
		if (isTrueRect()) {
			squares.addAll(new Rectangle(lon - sho, sho).decompose());
		}
		return squares;
	}

	public boolean isTrueRect() {
		return sho != lon;
	}

	@Override
	public String toString() {
		return String.format("(%d*%d)", lon, sho);
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle) obj;
		return sho == r.sho && lon == r.lon;
	}
	
	@Override
	public int hashCode() {
		return sho*lon;
	}
}