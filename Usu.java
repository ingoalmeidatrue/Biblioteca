public class Usu implements Receptor2 {
	private Usu() {}
	private static Usu instancia;
	public static Usu obterInstancia() {
		if(instancia == null) {
			instancia = new Usu();
		}
		return instancia;
	}
	public void execute(int id){
		
	};
}