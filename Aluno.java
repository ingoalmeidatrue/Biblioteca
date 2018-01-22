public class Aluno extends Users {
	public Aluno(int i, int j, String string) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.type = j;
		this.nome = string;
		this.verificaemprestimo= new regrasemprestimoAF();
	}
	public void returnHistorico() {
	}
}