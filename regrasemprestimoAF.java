
public class regrasemprestimoAF implements verificaEmprestimo {
	public boolean verificarRegra(Users user,Livro livro) {
		if(!Exemplares.disponivel(livro)) {
			System.out.println("Não existe exemplares disponiveis ALUNO");
			return false;
		}
		else if(user.procurarLivroCorrente(livro)) {
			System.out.println("Ja possuo o livro ALUNO");
			System.out.println(user.procurarLivroCorrente(livro));
			return false;
		}
		else if(user.qtdEmprestimos()) {
			System.out.println("Já tenho o nivel maximo de emprestimos");
			return false;
		}
		else if(fazerReserva.quantidadeReservas(livro) >= Exemplares.quantidadeExemplares() && !user.procurarLivroCorrente(livro)) {
			
			return false;
		}
		else if(fazerReserva.quantidadeReservas(livro) < Exemplares.quantidadeExemplares() && user.procurarLivroCorrente(livro)) {
			return false;
		}
		else if(user.devedor) {
			System.out.println("Estou devendo livro(s)");
			return false;
		}
		
		return true;
		
	}

}
