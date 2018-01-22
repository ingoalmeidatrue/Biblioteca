import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Emprestimo {
	Users usuario;
	Livro livro;
	public LocalDate dataFinal;
	public LocalDate dataInicial;
	
	public Emprestimo(Users usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
	}
	
	public void setarEmprestismo() {
		
		dataInicial=LocalDate.now();
		
		if(usuario.type == 1) {
			this.dataFinal = dataInicial.plusDays(2);
		}
		else if(usuario.type == 2) {
			dataFinal = dataInicial.plusDays(5);
		}
		else {
			dataFinal = dataInicial.plusDays(7);
		}
	}
	
	
	

	
	public void emp() {
		
	}
}