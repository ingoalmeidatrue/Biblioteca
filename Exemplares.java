import java.util.ArrayList;

public class Exemplares {
	public static ArrayList<Exemplar>LivrosDisponiveis=new ArrayList<>();
	public static void removeLivroDisponiveis(Livro livro) {
		Exemplar buscado;
		int  pos = 0;
		for(int i=0 ;i <LivrosDisponiveis.size();i++) {
				buscado=LivrosDisponiveis.get(i);
				if(buscado.id==livro.id) {
					pos = i;
				}
		}
		LivrosDisponiveis.remove(pos);
	}
	public static boolean disponivel(Livro livro) {
		for(int i=0 ;i <LivrosDisponiveis.size();i++) {
			if(livro.id==LivrosDisponiveis.get(i).id) {
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
}
