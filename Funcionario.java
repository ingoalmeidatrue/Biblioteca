public class Funcionario extends Users {
	public Funcionario(int i,int j,String string) {
		this.id = i;
		this.type = j;
		this.nome = string;
		this.verificaemprestimo = new regrasemprestimoAF();
	}
	public void returnHistorico() {
	}
}