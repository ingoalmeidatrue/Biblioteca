import java.util.ArrayList;

public class facadeBiblioteca {
	public ArrayList<Users> Usuarios;
	public ArrayList<Livro> Livros;
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
	public void fazerEmp(int idUsuario ,int idLivro){
		
	}
	public void fazerLiv(int idLivro){
		
	}
	public void fazerRes(int idUsuario ,int idLivro){
		
	}
	public void fazerSai(){
		
	}
	public void fazerObs(int idUsuario ,int idLivro){
		
	}
	public void fazerUso(int idUsuario){
		
	}
	public void fazerRtf(int idUsuario ){
		
	}
}
