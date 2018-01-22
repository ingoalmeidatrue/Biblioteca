import java.util.ArrayList;

public class facadeBiblioteca {
	private facadeBiblioteca() {}
	private static facadeBiblioteca instancia;
	static ArrayList<Users> Usuarios = new ArrayList<Users>();
	static ArrayList<Livro> Livros = new ArrayList<Livro>();
	public void adicionarUsuario(Users users) {
		this.Usuarios.add(users);
	}
	public void adicionarLivro(Livro livro) {
		this.Livros.add(livro);
	}
	public static facadeBiblioteca obterInstancia() {
		if(instancia == null) {
			instancia = new facadeBiblioteca();
		}
		return instancia;
	}
	public void fazerDev(int idUsuario ,int idLivro){
	}
	public void fazerEmp(int idUsuario ,int idLivro){
		Users usuario = Busca.buscaUsuario(idUsuario);
		Livro livro = Busca.buscaLivro(idLivro);
		fazerEmprestimo.emprestimoConcreto(usuario, livro);
	}
	public void imprimeLivrosCorrentes(int idUsuario) {
		Users x = Busca.buscaUsuario(idUsuario);
		for(int i=0;i < x.corrente.size();i++) {
			System.out.println(x.corrente.get(i).livro.titulo);
		}
	}
	public void fazerLiv(int idLivro){
		Livro livro = Busca.buscaLivro(idLivro);
		Livro.fazerLiv(livro);
	}
	public void fazerRes(int idUsuario ,int idLivro){
		Users usuario = Busca.buscaUsuario(idUsuario);
		Livro livro = Busca.buscaLivro(idLivro);
		fazerReserva.criarReserva(usuario,livro);
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
