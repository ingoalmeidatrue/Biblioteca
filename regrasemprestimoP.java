
public class regrasemprestimoP implements verificaEmprestimo {
	public boolean verificarRegra(Users user, Livro livro) {
		if(!Exemplares.disponivel(livro)){
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(", não possui exemplares disponiveis no momento.");
			return false;
		}
		else if(user.procurarLivroCorrente(livro)){
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(", ja esta sendo alugado por voce.");
			return false;
		}
		return true;
	}
}
