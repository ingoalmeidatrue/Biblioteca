public class Res implements Receptor {
	public void execute(){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerRes();
	};
}