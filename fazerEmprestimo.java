
public class fazerEmprestimo {
	public void emprestimoConcreto(Livro livro, Users user) { 
		if(Users.comportamentoEmprestimo(user,livro)) {
			Emprestimo e = new Emprestimo(user,livro);
			e.setarEmprestismo();
			user.adicionarCorrente(e);
			Exemplares.removeLivroDisponiveis(livro);
			if(fazerReserva.existeReserva(user,livro)) {
				Reserva.removeReserva(livro);
			}
		}
	}
}