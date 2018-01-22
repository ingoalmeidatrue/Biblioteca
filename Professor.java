
public class Professor extends Users {
	public Professor(int i, int j, String string) {
		this.id = i;
		this.type = j;
		this.nome = string;
		this.verificaemprestimo = new regrasemprestimoP();
	}
	public void returnHistorico() {
		
	}
}
