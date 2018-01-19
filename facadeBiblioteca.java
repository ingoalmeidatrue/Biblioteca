
public class facadeBiblioteca {
	private facadeBiblioteca() {}
	private static facadeBiblioteca instancia;
	public static facadeBiblioteca obterInstancia() {
		if(instancia == null) {
			instancia = new facadeBiblioteca();
		}
		return instancia;
	}
}
