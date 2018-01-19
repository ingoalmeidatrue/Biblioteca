import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Emprestimo {
	public int idUser;
	public int idLivro;
	Users usuario;
	Livro livro;
	public int dataFinal;
	public int dataInicial;
	
	public Emprestimo(Users usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
	}
	
	public void setarEmprestismo() {
		Date data = new Date();
		
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		this.dataInicial = localDate.getDayOfMonth();
		
		if(this.usuario.type == 1) {
			this.dataFinal = dataInicial+2;
		}
		else if(this.usuario.type == 2) {
			this.dataFinal = dataInicial+3;
		}
		else {
			this.dataFinal = dataInicial+7;
		}
	}
	
	
	

	
	public void emp() {
		
	}
}