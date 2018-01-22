
public class fazerEmprestimo {
	public static void emprestimoConcreto(Users usuario, Livro livro) { 
		if(usuario.comportamentoEmprestimo(usuario, livro)) {
			Emprestimo e = new Emprestimo(usuario,livro);
			e.setarEmprestismo();
			usuario.adicionarCorrente(e);
			Exemplar.setEmprestimo(e);
			Exemplares.removeLivroDisponiveis(livro);
			if(fazerReserva.existeReserva(usuario,livro)) {
				Reserva.removeReserva(usuario,livro);
			}
		}
	}
}