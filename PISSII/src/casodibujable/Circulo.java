package casodibujable;

public class Circulo extends Geometria {
	static int numCirculos = 0;
	public static final double PI = 3.14159265358979323846;
	private double x;
	private double y;
	private double r;

	public Circulo(double x, double y, double r) {
		this.setX(x);
		this.setY(y);
		this.setR(r);
		numCirculos++;
	}

	public Circulo(double r) {
		this(0.0, 0.0, r);
	}

	public Circulo(Circulo c) {
		this(c.getX(), c.getY(), c.getR());
	}

	public Circulo() {
		this(0.0, 0.0, 1.0);
	}

	public double perimetro() {
		return 2.0 * PI * getR();
	}

	public double area() {
		return PI * getR() * getR();
	}

	// m�todo de objeto para comparar c�rculos
	public Circulo elMayor(Circulo c) {
		if (this.getR() >= c.getR())
			return this;
		else
			return c;
	}

	// m�todo de clase para comparar c�rculos
	public static Circulo elMayor(Circulo c, Circulo d) {
		if (c.getR() >= d.getR())
			return c;
		else
			return d;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}