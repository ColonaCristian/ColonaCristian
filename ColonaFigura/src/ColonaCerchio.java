public class ColonaCerchio {
	private int raggio;
	/*1*/
	public ColonaCerchio(int r) {
		raggio=r;
	}
/*1*/
	public int getRaggio() {
		return raggio;
	}
 /*1 */
	public void setRaggio(int raggio) {
		this.raggio = raggio;
	}
	public String toString() {
		String s="Dati Cerchio"+"\n";
		s+="raggio"+raggio;
		return s;
	}
	public static void main(String[] args) {
		ColonaCerchio c=new ColonaCerchio(3);
}}