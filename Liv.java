

public class Liv implements Receptor2 {
	public void execute(int id){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerLiv();
	};
}