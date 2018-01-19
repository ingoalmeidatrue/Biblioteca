import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Users {
	static verificaEmprestimo verificaemprestimo;
	public static ArrayList<Emprestimo> corrente = new ArrayList();
	public static ArrayList fechado = new ArrayList();
	public static ArrayList historico = new ArrayList();
	public static int id;
	public static String nome;
	public static int type;
	public static boolean devedor;
	public static boolean comportamentoEmprestimo(Users user, Livro livro) {
		return verificaemprestimo.verificarRegra(user,livro);
	}	
		public static void adicionarCorrente(Emprestimo e) {
		corrente.add(e);
	}
		public static boolean procurarLivroCorrente(Livro livro) {
			for(int i = 0; i < corrente.size();i++) {
				if(livro.id == corrente.get(i).idLivro) {
					return true;
				}
			}
			return false;
		}
}
