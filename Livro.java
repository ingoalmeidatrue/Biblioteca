
public class Livro {
	public int id;
	public String titulo;
	public String editora;
	public String autores;
	public int edicao;
	public int anopub;
	public int qtdreserva;
	public Livro(int id,String titulo,String editora,String autores,int edicao,int anopub,int qtdreserva) {
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.autores = autores;
		this.edicao = edicao;
		this.anopub = anopub;
		this.qtdreserva = qtdreserva;
	}

	public static void fazerLiv(Livro livro) {
		System.out.print("Titulo: ");
		System.out.println(livro.titulo);
		System.out.print("Quantidade de reservas:  ");
		int quantidadeReservas = fazerReserva.quantidadeReservas(livro);
		if(quantidadeReservas>=0) {
			System.out.println(quantidadeReservas);
			fazerReserva.imprimeReservasLivro(livro);
		}
		Exemplares.imprimeExemplar(livro);
		//falta a parte dos exemplares. modificar pra ao inves de tirar o livro de exemplares apenas setar a bool para false
	}
}
