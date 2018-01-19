import java.sql.Date;
import java.time.*;
import java.util.Calendar;


public class verificacao {
	
	static LocalDate MAX;
	LocalDateTime dataAtual;
	
	
	LocalDate data_atual = LocalDate.of(2018, 10, 03);	
	
	Calendar calendar = Calendar.getInstance();
    Date date =  (Date) calendar.getTime();
	
	
	public LocalDateTime atStartOfDay() {
		return dataAtual;
		
		
	}
	
	public void verf() {
		
	}
}
