
public class Gera {
	void geraExemplares() {
		Exemplar a;
		a = new Exemplar(100,"01",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(100,"02",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(101,"03",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(200,"04",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(201,"05",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(300,"06",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(300,"07",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(400,"08",true);
		Exemplares.obterInstancia().LivrosDisponiveis.add(a);
		a = new Exemplar(400,"09",true);
	}
	void geraLivros() {
		Livro a;
		
	}
}
