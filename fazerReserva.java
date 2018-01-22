import java.util.ArrayList;

public class fazerReserva {
	public static ArrayList<Reserva>reservas = new ArrayList();
	public static void criarReserva(Users usuario,Livro livro) {
		Reserva r = new Reserva(usuario,livro);
		if(r.qtdMAximaReservas(usuario)>=3) {
			System.out.print("Existem 3 ou mais reservas para o usuario de nome: ");
			System.out.println(usuario.nome);
		}
		else if(existeReserva(usuario,livro)) {
			System.out.print("O usuario de nome: ");
			System.out.print(usuario.nome);
			System.out.print(" ja possui reserva para o livro: ");
			System.out.println(livro.titulo);
		}
		else {
			reservas.add(r);
			livro.qtdreserva++;
		}		
	}
	public static int quantidadeReservas(Livro livro) {
		int contador=0;
		for(int i=0;i<reservas.size();i++) {
			if(reservas.get(i).livro.id == livro.id) {
				contador++;
			}
		}
		return contador;
	}
	public static boolean existeReserva(Users user,Livro livro) {
		Reserva buscado;
		for(int i=0 ;i < reservas.size();i++) {
			buscado = reservas.get(i);
			if(buscado.usuario.id == user.id && buscado.livro.id == livro.id) {
					return true;
				}
		}
		return false;
	}
	/*public static void imprimeReservas() {
		for(int i=0;i < reservas.size();i++) {
			System.out.print("reserva ");
			System.out.print(i);
			System.out.print(" ");
			System.out.print("usuario");
			System.out.println(reservas.get(i).usuario.id);
			System.out.print("livro ");
			System.out.println(reservas.get(i).livro.id);
		}
	}*/
	public static void imprimeReservasLivro(Livro livro) {
		System.out.print("O livro ");
		System.out.print(livro.titulo);
		System.out.print(" foi reservado pelos usuarios: ");
		for(int i = 0; i < reservas.size();i++) {
			if(livro.id == reservas.get(i).livro.id) {
				if(i == quantidadeReservas(livro)-1) {
					System.out.print(" e ");
				}
				if(i < quantidadeReservas(livro)-1 && i!=0) {
					System.out.print(", ");
				}
				System.out.print(reservas.get(i).usuario.nome);
			}
		}		
		System.out.println(".");
	}
}