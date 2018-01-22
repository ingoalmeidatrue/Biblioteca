
public class regrasemprestimoP implements verificaEmprestimo {
	public boolean verificarRegra(Users user, Livro livro) {
		System.out.println("entrei verificacao regra PROFESSOR");
		if(!Exemplares.disponivel(livro)){
			System.out.println("Não existe exemplares disponiveis PROFESSOR");
			return false;
		}
		else if(user.procurarLivroCorrente(livro)){
			System.out.println("Ja possuo o livro PROFESSOR");
			return false;
		}
		return true;
	}
}
