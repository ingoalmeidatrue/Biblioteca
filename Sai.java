
public class Sai implements Receptor2 {
	public void execute(int id){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerSai();
	};
}