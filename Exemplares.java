import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Exemplares {
	public static ArrayList<Exemplar>LivrosDisponiveis=new ArrayList<>();
	public static void removeLivroDisponiveis(Livro livro) {
		Exemplar buscado;
		int  pos = 0;
		for(int i=0 ;i <LivrosDisponiveis.size();i++) {
				buscado=LivrosDisponiveis.get(i);
				if(buscado.id==livro.id) {
					buscado.Exp = false;
					return;
				}
		}
	}
	public static boolean disponivel(Livro livro) {
		for(int i=0 ;i <LivrosDisponiveis.size();i++) {
			if(livro.id==LivrosDisponiveis.get(i).id && LivrosDisponiveis.get(i).Exp == true) {
				return true;
			}
		}
			return false;
	}
	
	public static int quantidadeExemplares() {
		return LivrosDisponiveis.size();
	}
	public static void imprime2() {
		for(int i=0;i < LivrosDisponiveis.size();i++) {
			System.out.print("livro");
			System.out.print(i);
			System.out.print(" ");
			System.out.println(LivrosDisponiveis.get(i).id);
		}
	}
	public static void imprimeExemplar(Livro livro) {
		for(int i=0 ; i<LivrosDisponiveis.size();i++) {
			if(livro.id==LivrosDisponiveis.get(i).id &&  LivrosDisponiveis.get(i).Exp == false) {
				Emprestimo e =LivrosDisponiveis.get(i).getEmprestimo();
				DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
				 String datainicio =e.dataInicial.format(formatters);
				 DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("d/MM/uuuu");
				 String datafinal =e.dataFinal.format(formato2);
					System.out.println(e.usuario.nome);
					System.out.println("Data inicial: "+datainicio);
					System.out.println("Data final: "+datafinal);
			}
		}
	}
}
