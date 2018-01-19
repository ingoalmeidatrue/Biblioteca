public class Dev implements Receptor1 {
	public void execute(int idUsuario, int idLivro){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerDev(idUsuario,idLivro);
	};
}