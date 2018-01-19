
public class regrasemprestimoP implements verificaEmprestimo {

	public boolean verificarRegra(Users user, Livro livro) {
		if(!Exemplares.disponivel(livro)) {
			return false;
		}
		else if(user.procurarLivroCorrente(livro)) {
			return false;
		}
		return true;
	}
}
