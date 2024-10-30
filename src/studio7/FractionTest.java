package studio7;

public class FractionTest {
public static int gcd(int p, int q) {
		
		// FIXME compute the gcd of p and q using recursion
	if (p%q==0) {
		return q;
	}
		return gcd(q,p%q);	
}
	public static Fraction samplize(Fraction a) {
		int num = a.getNumerator();
		int den = a.getDenominator();
		int gcd = gcd(num,den);
		return new Fraction(num/gcd,den/gcd);	
		
	}
	
	public static String add(Fraction a, Fraction b) {
		int addnumerator = a.getNumerator() * b.getDenominator() + b.getNumerator() * a.getDenominator();
		int adddenominator = a.getDenominator() * b.getDenominator();
		Fraction added = new Fraction(addnumerator, adddenominator);
		added = samplize(added);
		return added.toString();
	}
	
	public static String multiply(Fraction a, Fraction b) {
		int multinumerator = a.getNumerator() * b.getNumerator();
		int multidenominator = a.getDenominator() * b.getDenominator();
		Fraction multied = new Fraction(multinumerator, multidenominator);
		multied = samplize(multied);
		return multied.toString();
	}
	public static String reciprocal(Fraction a) {
		Fraction rec = new Fraction(a.getDenominator(), a.getNumerator());
		rec = samplize(rec);
		return rec.toString();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction a = new Fraction(5,10);
		Fraction b = new Fraction(2,3);
		System.out.println("Samplify fraction a: " + samplize(a).toString());
		System.out.println("Add fraction a to b: " + add(a,b));
		System.out.println("Multiply fraction a to b: " + multiply(a,b));
		System.out.println("Reciprocal fraction a: " + reciprocal(a));
		

	}

}
