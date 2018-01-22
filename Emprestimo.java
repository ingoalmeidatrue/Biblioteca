import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Emprestimo {
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
		
		dataInicial = localDate.getDayOfMonth();
		
		if(usuario.type == 1) {
			this.dataFinal = this.dataInicial+2;
		}
		else if(usuario.type == 2) {
			dataFinal = dataInicial+5;
		}
		else {
			dataFinal = dataInicial+7;
		}
	}
	
	
	

	
	public void emp() {
		
	}
}