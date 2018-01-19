public class Dev implements Receptor {
	public void execute(){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerDev();
	};
}