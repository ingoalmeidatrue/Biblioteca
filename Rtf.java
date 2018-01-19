public class Rtf implements Receptor2 {
	private Rtf() {}
	private static Rtf instancia;
	public static Rtf obterInstancia() {
		if(instancia == null) {
			instancia = new Rtf();
		}
		return instancia;
	}
	public void execute(int id){
		
	};
}