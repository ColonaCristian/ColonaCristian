
public class ColonaFigura {
	private float base1, base2, altezza, lato;
	private int raggio;

	public ColonaFigura(float b1, float b2, float h, int r, float l) {
		base1 = b1;
		base2 = b2;
		altezza = h;
		raggio = r;
		lato = l;
	}

	public float ColonaAreaQuadrato(float b1, float b2) {
		float r;
		r = b1 * b2;
		System.out.println("L'area del quadrato è: "+r);
		return r;
	}

	public float ColonaAreaTrapezio(float b1, float b2, float h) {
		float r;
		r = (b1 * b2) * h;
		System.out.println("L'area del trapezio è: "+r);
		return r;
	}

	public double ColonaAreaCerchio(int r) {
		double a;
		double s;
		double p = 3.14;
		a = (r * r);
		s = a * p;
		System.out.println("L'area del Cerchio è: "+s);
		return s;
	}

	public float ColonaPerimetroQuadrato(float b1) {
		float s;
		s = b1*4;
		System.out.println("Il perimetro del quadrato è: "+s);
		return s;
	}

	public float ColonaPerimetroTrapezio(float b1, float b2, float h, float l) {
		float r;
		r = b1 + b2 + h + 2l;
		System.out.println("Il perimetro del trapezio è: "+r);
		return r;
	}

	public double ColonaPerimetroCerchio(int r) {
		double p = 3.14;
		double s, t;
		s = (2 * p);
		t = s * r;
		System.out.println("Il perimetro del cerchio è: "+t);
		return t;
	}

	public String toString() {
		String s = "DATI: " + "\n";
		s += "Base1 :" + base1 + "\n" + "base2 :" + base2 + "\n" + "altezza :" + altezza + "\n" + "lato obliquo: "
				+ lato + "\n" + "raggio: " + raggio;
		return s;
	}

	public static void main(String[] args) {
		ColonaFigura f=new ColonaFigura(3,4,2,4,5);
		System.out.println(f);
		f.ColonaAreaQuadrato(2, 2);
		f.ColonaPerimetroQuadrato(3);
		
		
		
	}

}
