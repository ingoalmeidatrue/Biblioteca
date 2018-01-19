import java.lang.reflect.Array;
import java.util.ArrayList;

public class users implements comportamentoEmprestimo{
	public ArrayList corrente;
	public ArrayList fechado;
	public ArrayList historico;
	comportamentoEmprestimo  verificador;
	
	public int id;
	public String nome;
	public int type;
	public boolean devedor;
	@Override
	public void verificarRegra() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int tempoDeDevolucao() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
