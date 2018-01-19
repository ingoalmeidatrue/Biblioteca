public class Res implements Receptor1 {
	private Res() {}
	private static Res instancia;
	public static Res obterInstancia() {
		if(instancia == null) {
			instancia = new Res();
		}
		return instancia;
	}
	public void execute(int idUsuario,int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerRes();
	};
}