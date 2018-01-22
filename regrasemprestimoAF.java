
public class regrasemprestimoAF implements verificaEmprestimo {
	public boolean verificarRegra(Users user,Livro livro) {
		if(!Exemplares.disponivel(livro)) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(", não possui exemplares disponiveis no momento.");
			return false;
		}
		else if(user.procurarLivroCorrente(livro)) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(", ja esta sendo alugado por voce.");
			System.out.println(user.procurarLivroCorrente(livro));
			return false;
		}
		else if(user.qtdEmprestimos(user.type)) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(" nao pode ser alugado, pois voce já possui o numero maximo de emprestimos.");
			return false;
		}
		/*else if(fazerReserva.quantidadeReservas(livro) >= Exemplares.quantidadeExemplares() && !fazerReserva.existeReserva(user, livro)) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.print(" nao pode ser alugado, pois a quantidade de reservas é menor que a quantidade de exemplares disponiveis");
			if(!fazerReserva.existeReserva(user, livro)) {
				System.out.print(" e voce ja possui uma reserva para esse livro");
			}	
			System.out.print(".");
			return false;
		}
		else if(fazerReserva.quantidadeReservas(livro) < Exemplares.quantidadeExemplares() && fazerReserva.existeReserva(user, livro)) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.print(" nao pode ser alugado, pois a quantidade de reservas é maior/igual que a quantidade de exemplares disponiveis");
			if(fazerReserva.existeReserva(user, livro)) {
				System.out.print(" e voce nao possui uma reserva para esse livro");
			}
			System.out.println(".");
			return false;
		}*/
		else if(user.devedor) {
			System.out.print(user.nome);
			System.out.print(", o livro: ");
			System.out.print(livro.titulo);
			System.out.println(" nao pode ser alugado pois voce esta devendo livro(s)");
			return false;
		}
		
		return true;
		
	}

}
