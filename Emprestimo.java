import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class emprestimo {
	public int idUser;
	public int idLivro;
	
	public int dataFinal;
	
	Date data = new Date();
	
	LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	
	public int dataInicial = localDate.getDayOfMonth();
	
	public void devolver() {
		System.out.println("devolve dia: " + dataInicial);
	}
	
	
	
	
	
	
	
	
	
	
	public void emp() {
		
	}
	
	
}
