
public abstract class Busca {
	public static Users buscaUsuario(int idUsuario) {
		Users buscado;
		for(int i=0 ;i < facadeBiblioteca.obterInstancia().Usuarios.size();i++) {
			buscado=facadeBiblioteca.obterInstancia().Usuarios.get(i);
			if(buscado.id==idUsuario) {
				return buscado;
			}
		}
		return null;
	}
	public static Livro buscaLivro(int idLivro) {
		Livro buscado;
		for(int i=0 ;i <facadeBiblioteca.obterInstancia().Livros.size();i++) {
			buscado=facadeBiblioteca.obterInstancia().Livros.get(i);
			if(buscado.id==idLivro) {
				return buscado;
			}
		}
		return null;
	}
	public static Exemplar buscaLivroDisponiveis(int idLivro) {
		Exemplar buscado;
		for(int i=0 ;i <Exemplares.obterInstancia().LivrosDisponiveis.size();i++) {
			buscado=Exemplares.obterInstancia().LivrosDisponiveis.get(i);
			if(buscado.id==idLivro) {
				return buscado;
			}
		}
		return null;
	}
}
