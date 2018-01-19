public class Emp implements Receptor1 {
	private Emp() {}
	private static Emp instancia;
	public static Emp obterInstancia() {
		if(instancia == null) {
			instancia = new Emp();
		}
		return instancia;
	}
	public void execute(int idUsuario, int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerEmp(idUsuario, idLivro);
	};
}
