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
		a = new Livro(200,"Code Complete", "Microsofr Press", "Steve McConell",2,2014,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a = new Livro(201,"Agile Software Development,Principles,Patterns,and Pratices","Prentice Hall","Robert Martin",1,2002,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a = new Livro(300,"Refactoring: Improving the Design of Existing Code","Addison-Wesley Professional","Martin Fowler",1,1999,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a = new Livro(301,"Software Metrics: A Rigorous and Practical Approach", "CRC Press","Norman Fenton, James Bieman",3,2014,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a = new Livro(400,"Design Patterns: Elements of Reusable Object-Oriented Software","Addison-Wesley Professional","Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",1,1994,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
		a = new Livro(401,"UML Distilled: A Brief Guide to the Standard Object Modeling Language","Addison-Wesley Professional","Martin Fowler",3,2003,0);
		facadeBiblioteca.obterInstancia().adicionarLivro(a);
	}
	public static void geraUsuarios() {
		Funcionario f;
		Aluno a;
		Professor p;
		f = new Funcionario(123,1,"Joao da Silva");
		facadeBiblioteca.obterInstancia().adicionarUsuario(f);
		f = new Funcionario(789,1,"Pedro Paulo");
		facadeBiblioteca.obterInstancia().adicionarUsuario(f);
		a = new Aluno(456,2,"Luiz Fernando Rodrigues");
		facadeBiblioteca.obterInstancia().adicionarUsuario(a);
		p = new Professor(100,3,"Carlos Lucena");
		facadeBiblioteca.obterInstancia().adicionarUsuario(p);
		/*for(int i = 0;i < facadeBiblioteca.Usuarios.size();i++) {
			System.out.println(facadeBiblioteca.Usuarios.get(i).id);
		}*/
	}
}
