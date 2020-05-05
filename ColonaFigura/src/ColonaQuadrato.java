
public class ColonaQuadrato {
	private float base1, base2;
	public ColonaQuadrato(float b1,float b2) {
		base1 = b1;
		base2 = b2;
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
	public String toString() {
		String s="Dati quadrato"+"\n";
		s+="lato1 :"+base1+"lato2 :"+base2;
		return s;
	}

	public static void main(String[] args) {
		ColonaQuadrato q=new ColonaQuadrato(2,2);
	}

}
