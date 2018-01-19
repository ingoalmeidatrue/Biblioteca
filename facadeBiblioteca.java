import java.util.ArrayList;

public class facadeBiblioteca {
	public ArrayList<Users> Usuarios;
	public ArrayList<Livro> livros;
	private facadeBiblioteca() {}
	private static facadeBiblioteca instancia;
	public static facadeBiblioteca obterInstancia() {
		if(instancia == null) {
			instancia = new facadeBiblioteca();
		}
		return instancia;
	}
	public void fazerDev(int idUsuario ,int idLivro){
	}
	public void fazerEmp(){
		
	}
	public void fazerLiv(){
		
	}
	public void fazerRes(){
		
	}
	public void fazerSai(){
		
	}
	public void fazerObs(){
		
	}
}
