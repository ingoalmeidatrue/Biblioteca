import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Users {
 	verificaEmprestimo verificaemprestimo;
	public ArrayList<Emprestimo> corrente = new ArrayList();
	public ArrayList fechado = new ArrayList();
	public ArrayList historico = new ArrayList();
	public int id;
	public String nome;
	public int type;
	public static boolean devedor;
	public boolean comportamentoEmprestimo(Users user, Livro livro) {
		return verificaemprestimo.verificarRegra(user,livro);
	}	
		public void adicionarCorrente(Emprestimo e) {
		corrente.add(e);
	}
	public boolean procurarLivroCorrente(Livro livro) {
			for(int i = 0; i < corrente.size();i++) {
				if(livro.id == corrente.get(i).livro.id) {
					return true;
				}
			}
			return false;
		}
		public boolean qtdEmprestimos(int type) {
			if(type == 1) {
				if(corrente.size()>=3) {
					return true;
				}		
			}
			else if(type == 2) {
				if(corrente.size()>=4) {
					return true;
				}
			}
			return false;
		}
}
