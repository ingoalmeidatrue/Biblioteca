import java.util.ArrayList;

public class fazerReserva {
	public static ArrayList<Reserva>reservas = new ArrayList();
	public static void criarReserva() {
		
	}
	public static void removeReserva(Users user, Livro livro) {
	Reserva buscado;
	int  pos = 0;
	for(int i=0 ;i < reservas.size();i++) {
			buscado = reservas.get(i);
			if(buscado.idUsuario == user.id && buscado.idLivro == livro.id) {
				pos = i;
			}
	}
	reservas.remove(pos);
}
	
	public static  int quantidadeReservas(Livro livro) {
		int contador=0;
		for(int i=0;i<reservas.size();i++) {
			if(reservas.get(i).idLivro == livro.id) {
				contador++;
			}
		}
		return contador;
	}
	
	
	
	public static boolean existeReserva(Users user,Livro livro) {
		Reserva buscado;
		for(int i=0 ;i < reservas.size();i++) {
			buscado = reservas.get(i);
			if(buscado.idUsuario == user.id && buscado.idLivro == livro.id) {
					return true;
				}
		}
		return false;
	}
}