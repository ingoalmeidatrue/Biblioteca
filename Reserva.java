public class Reserva {
	Users usuario;
	Livro livro;
	public Reserva(Users usuario,Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
	}
	public int qtdMAximaReservas(Users usuario) {
		int contador = 0;
		for(int i = 0;i < fazerReserva.reservas.size();i++){	
			if(usuario.id == fazerReserva.reservas.get(i).usuario.id) {
				contador++;
			}
		}
		return contador;
	}
	public static void removeReserva(Users user, Livro livro) {
		int  pos = 0;
			for(int i=0 ;i < fazerReserva.reservas.size();i++) {
					if(fazerReserva.reservas.get(i).usuario.id == user.id && fazerReserva.reservas.get(i).livro.id == livro.id) {
						pos = i;
					}
			}
			fazerReserva.reservas.remove(pos);
	}

}
