
public class Liv implements Receptor2 {
	private Liv() {}
	private static Liv instancia;
	public static Liv obterInstancia() {
		if(instancia == null) {
			instancia = new Liv();
		}
		return instancia;
	}
	public void execute(int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerLiv(idLivro);
	};
}