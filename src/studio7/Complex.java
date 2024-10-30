package studio7;

public class Complex {
	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		this.imaginary = imaginary;
		this.real = real;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public static Complex add(Complex a, Complex b) {
		int newReal = a.getReal() + b.getReal();
        int newImaginary = a.getImaginary() + b.getImaginary();
        return new Complex(newReal, newImaginary);
	}
	public static Complex multi(Complex a, Complex b) {
		int newReal = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        int newImaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new Complex(newReal, newImaginary);
	}
	public String toString() {
		if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
	}
	
	public static void main(String[] args) {
		Complex a = new Complex(3,8);
		Complex b = new Complex(2,6);
		System.out.println(add(a,b));
		System.out.println(multi(a,b));
	}
}
