import java.util.ArrayList;

public class Gera {
	public static void geraExemplares() {
		Exemplar a;
		a = new Exemplar(100,"01",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(100,"02",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(101,"03",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(200,"04",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(201,"05",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(300,"06",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(300,"07",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(400,"08",true);
		Exemplares.LivrosDisponiveis.add(a);
		a = new Exemplar(400,"09",true);
	}
	public static void geraLivros() {
		Livro a;
		a = new Livro(100,"Engenharia de Software","Addison Wesley","Ian Sommervile",6,2000,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a  = new Livro(101,"UML - Guia do Usuario", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson",7,2000,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
	}
	public static void geraUsuarios() {
		Funcionario f;
		Aluno a;
		Professor p;
		a = new Aluno(456,2,"Pedro Paulo");
		facadeBiblioteca.obterInstancia().adicionarUsuario(a);
		p = new Professor(100,3,"Carlos Lucena");
		facadeBiblioteca.obterInstancia().adicionarUsuario(p);
		/*for(int i = 0;i < facadeBiblioteca.Usuarios.size();i++) {
			System.out.println(facadeBiblioteca.Usuarios.get(i).id);
		}*/
	}
}
