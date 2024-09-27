package code;

import java.util.ArrayList;

public class Biblioteca {
	public ArrayList<Livro> livros;
	public ArrayList<Revista> revistas;

	public Biblioteca() {
		livros = new ArrayList<>();
		revistas = new ArrayList<>();
	}

	// Adicionar um livro à biblioteca
	public void adicionarLivro(String titulo, String autor, int ano, Livro.Genero genero) {
		if (titulo.isEmpty() || autor.isEmpty()) {
			System.out.println("O livro precisa ter um título e autor válidos!");
			return;
		}
		// Verifica se o ano é maior menor ou igual a zero e mostra um aviso
		if (ano <= 1400) {
			System.out.println("Por favor insira um ano válido!");
			return;
		}
		Livro novoLivro = new Livro(titulo, autor, ano, genero);
		livros.add(novoLivro);
		System.out.println("Livro '" + titulo + "' adicionado com sucesso!");
	}

	// Mostrar todos os livros da biblioteca
	public void mostrarLivros() {
		if (livros.isEmpty()) {
			System.out.println("Nenhum livro na biblioteca.");
		} else {
			for (Livro livro : livros) {
				livro.mostrarLivrosRevistas();
			}
		}
	}

	// Pesquisar livro pelo título
	public void pesquisarLivro(String titulo) {
		if (titulo.isEmpty()) {
			System.out.println("O livro precisa ter um título para ser pesquisado!");
			return;
		}
		boolean encontrado = false;
		for (Livro livro : livros) {
			if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
				livro.mostrarLivrosRevistas();
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("Livro '" + titulo + "' não encontrado na biblioteca.");
		}
	}

	// Excluir livro pelo título
	public void excluirLivro(String titulo) {
		if (titulo.isEmpty()) {
			System.out.println("O livro precisa ter um título para ser apagado!");
			return;
		}
		Livro livroRemover = null;
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				livroRemover = livro;
				break;
			}
		}

		if (livroRemover != null) {
			livros.remove(livroRemover);
			System.out.println("Livro '" + titulo + "' removido com sucesso!");
		} else {
			System.out.println("Livro '" + titulo + "' não encontrado na biblioteca.");
		}
	}

	// Adicionar uma revista à biblioteca
	public void adicionarRevista(String titulo, String autor, int numero) {
		if (titulo.isEmpty() || autor.isEmpty()) {
			System.out.println("A revista precisa de um título e autor válidos!");
			return;

		}
		// Verifica se o número da revista é maior ou igual a zero
		if (numero <= 0) {
			System.out.println("O número da revista deve ser maior que zero!");
			return;
		}

		Revista novaRevista = new Revista(titulo, autor, numero);
		revistas.add(novaRevista);
		System.out.println("Revista '" + titulo + "' adicionada com sucesso!");
	}

	// Mostrar todas as revistas da biblioteca
	public void mostrarRevistas() {
	    if (revistas.isEmpty()) {
	        System.out.println("Nenhuma revista na biblioteca.");
	        return;
	    } else {
	        for (Revista revista : revistas) {
	            revista.mostrarNumeroRevistas();
	        }
	    }
	}

	// Pesquisar revista pelo título
	public void pesquisarRevista(String titulo) {
	    if (titulo.isEmpty()) {
	        System.out.println("A revista precisa ter um título para ser pesquisada!");
	        return;
	    }

	    boolean encontrado = false;
	    for (Revista revista : revistas) {
	        if (revista.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
	            revista.mostrarNumeroRevistas();
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("Revista '" + titulo + "' não encontrada na biblioteca.");
	    }
	}

	// Excluir revista pelo título
	public void excluirRevista(String titulo) {
		if (titulo.isEmpty()) {
			System.out.println("A revista precisa ter um título para ser excluída!");
			return;
		}
		Revista revistaRemover = null;
		for (Revista revista : revistas) {
			if (revista.getTitulo().equalsIgnoreCase(titulo)) {
				revistaRemover = revista;
				break;
			}
		}

		if (revistaRemover != null) {
			revistas.remove(revistaRemover);
			System.out.println("Revista '" + titulo + "' removida com sucesso!");
		} else {
			System.out.println("Revista '" + titulo + "' não encontrada na biblioteca.");
		}
	}
}
