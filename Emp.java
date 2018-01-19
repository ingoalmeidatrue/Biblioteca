public class Emp implements Receptor {
	public void execute(){
		facadeBiblioteca facade;
		facade=facadeBiblioteca.obterInstancia();
		facade.fazerEmp();
	};
}
