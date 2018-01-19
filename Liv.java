public class Liv implements Receptor {
	public void execute(){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerLiv();
	};
}