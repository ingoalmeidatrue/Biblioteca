
public class fazerEmprestimo {
	public static void emprestimoConcreto(Users usuario, Livro livro) { 
		if(usuario.verificaemprestimo.verificarRegra(usuario,livro)) {
			Emprestimo e = new Emprestimo(usuario,livro);
			e.setarEmprestismo();
			usuario.adicionarCorrente(e);
			Exemplares.removeLivroDisponiveis(livro);
			if(fazerReserva.existeReserva(usuario,livro)) {
				Reserva.removeReserva(livro);
			}
		}
	}
}