public class Obs implements Receptor1 {
	private Obs() {}
	private static Obs instancia;
	public static Obs obterInstancia() {
		if(instancia == null) {
			instancia = new Obs();
		}
		return instancia;
	}
	public void execute(int idUsuario,int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerObs(idUsuario, idLivro);
	};
}