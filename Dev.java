public class Dev implements Receptor1 {
	private Dev() {}
	private static Dev instancia;
	public static Dev obterInstancia() {
		if(instancia == null) {
			instancia = new Dev();
		}
		return instancia;
	}
	public void execute(int idUsuario, int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerDev(idUsuario,idLivro);
	};
}