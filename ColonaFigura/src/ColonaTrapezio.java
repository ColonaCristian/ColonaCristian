
public class ColonaTrapezio {
	private float base1, base2, altezza, lato;
	public ColonaTrapezio(float b1,float b2,float h,float l) {
		base1 = b1;
		base2 = b2;
		altezza = h;
		lato = l;
	}
	
	public float getBase1() {
		return base1;
	}

	public void setBase1(float base1) {
		this.base1 = base1;
	}

	public float getBase2() {
		return base2;
	}

	public void setBase2(float base2) {
		this.base2 = base2;
	}

	public float getAltezza() {
		return altezza;
	}

	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}

	public float getLato() {
		return lato;
	}

	public void setLato(float lato) {
		this.lato = lato;
	}
	public String toString() {
		String s="Dati trapezio"+"\n";
		s+="lato1 :"+base1+"lato2 :"+base2+"altezza: "+altezza;
		return s;
	}
	public static void main(String[] args) {
		ColonaTrapezio t=new ColonaTrapezio(1,2,3,4);

	}

}
