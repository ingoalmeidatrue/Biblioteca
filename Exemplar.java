
public class Exemplar{
	public int id;
	public String idExp;
	public boolean Exp;
	public static Emprestimo emprestado=null;
	public Exemplar(int a,String b,boolean disponivel){
		this.id = a;
		this.idExp = b;
		this.Exp = disponivel;
	}
	public static void setEmprestimo(Emprestimo e) {
		emprestado=e;
	}
	public Emprestimo getEmprestimo() {
		return this.emprestado;
	}
}
