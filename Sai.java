public class Sai implements Receptor {
	public void execute(){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerSai();
	};
}