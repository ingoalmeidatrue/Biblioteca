import java.lang.reflect.Array;
import java.util.ArrayList;

public class Users {
	verificaEmprestimo verificaemprestimo;
	public ArrayList corrente;
	public ArrayList fechado;
	public ArrayList historico;
	public int id;
	public String nome;
	public int type;
	public boolean devedor;
	public boolean comportamentoEmprestimo() {
		return verificaemprestimo.verificarRegra();
	}
}
