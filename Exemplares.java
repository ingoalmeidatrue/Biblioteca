import java.util.ArrayList;

public class Exemplares {
	private Exemplares() {}
	private static Exemplares instancia;
	public static Exemplares obterInstancia() {
		if(instancia == null) {
			instancia = new Exemplares();
		}
		return instancia;
	}
	public static ArrayList<Exemplar>LivrosDisponiveis=new ArrayList<>();
}
