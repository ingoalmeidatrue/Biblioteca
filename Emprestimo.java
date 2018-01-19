import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Emprestimo {
	public int idUser;
	public int idLivro;
	static Users usuario;
	static Livro livro;
	public static int dataFinal;
	public static int dataInicial;
	
	public Emprestimo(Users usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
	}
	
	public static void setarEmprestismo() {
		Date data = new Date();
		
		LocalDate localDate = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		dataInicial = localDate.getDayOfMonth();
		
		if(usuario.type == 1) {
			dataFinal = dataInicial+2;
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