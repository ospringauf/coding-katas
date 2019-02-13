package b2c.dojo.cleancode;

/**
 * from https://github.com/mseknibilel/CleanCode-Katas/blob/master/dotNet/NamingAndCommenting/Calculator.cs
 * 
 * The supermarket wants to calculate product discounts. The rules are the following:
 * 
 * 	If 2 or less products are bought then no discount is offered.
 * 	If 3 or up to 10 products are bought then for every 3 products offer one for free.
 * 	If over 11 products are bought then apply 50% off the total price.
 */
public class NamingAndCommenting {

	public static void main(String[] args) {
		System.out.println("your discount is " + calc(Integer.parseInt(args[0]), Double.parseDouble(args[1])));
	}
	
	
	/**
	 * 
	 * @param nb
	 * @param p
	 * @return
	 */
    public static double calc(int nb, double p)
    {
        //No discount below 3 articles
        if (nb < 3)
        {
            return 0;
        }
        //Below 10, 3 for 2
        if (nb < 11)
        {
            int t = nb / 3;                
            return t * p;
        }
        //50 percent off for rest
        return nb * p / 2;
}
}
