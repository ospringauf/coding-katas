package b2c.dojo.codewars;

// https://www.codewars.com/kata/rotate-for-a-max
public class RotMax 
{
	
	
    public static void main( String[] args )
    {
    	System.out.println("-->" + rot(56_789, 10_000));
        System.out.println("-->" + maxRot(56_789));
        System.out.println("-->" + maxRot(38_458_215));
    }

	public static long maxRot(long n) {
		long max = n;
		long i = 1;
		
		// next higher power of 10 (56_789 --> 100_000)
		while (i<n) i *= 10;
		
		while (i > 100) {
			n = (n/i)*i + rot(n%i, i/10); // keep 0, 1, 2 ... leading digits, rotate the rest
			max = (n > max) ? n : max;
			i /= 10;
		}

		return max;
	}

	/**
	 * rotate to base b (n/b is the first digit of n)
	 */
	private static long rot(long n, long b) {
		return 10 * (n % b) + (n / b);
	}

}
