package code;

import java.util.Scanner;
import code.Livro.Genero;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();

		while (true) {
			// Menu principal
			System.out.println("\nBem-vindo ao sistema de gerenciamento da BibliotecaXYZ!");
			System.out.println("Escolha o que gostaria de fazer (Escolha com Números)\n" 
								+ "[1] Adicionar Novo Livro ou Revista\n"
								+ "[2] Pesquisar Livro/Revista por Título\n" 
								+ "[3] Excluir Livro/Revista pelo Título\n"
								+ "[4] Listagem de Livros e Revistas\n" 
								+ "[5] Sair do Sistema\n");
			int escolhaMenu = scanner.nextInt();
			scanner.nextLine();

			// Adicionar livro
			if (escolhaMenu == 1) {
				System.out.println("Você gostaria de adicionar [1] Livros ou [2] Revistas?");
				int escolhaAdicionar = scanner.nextInt();
				scanner.nextLine();
				;
				if (escolhaAdicionar == 1) {
					System.out.println("Qual livro você gostaria de adicionar ao sistema?");
					String livroTitulo = scanner.nextLine();

					System.out.println("Quem escreveu o livro?");
					String livroAutor = scanner.nextLine();

					System.out.println("Em que ano foi lançado?");
					int livroAno = scanner.nextInt();
					scanner.nextLine();

					// Escolher o gênero
					System.out.println(
							"Qual o gênero do livro?\n[1] Romance\n[2] Ação\n[3] Fantasia\n[4] Drama\n[5] Terror");
					int escolhaGenero = scanner.nextInt();
					scanner.nextLine();
					Genero genero = null;

					// Atribuir o gênero com base na escolha
					switch (escolhaGenero) {
					case 1:
						genero = Genero.ROMANCE;
						break;
					case 2:
						genero = Genero.ACAO;
						break;
					case 3:
						genero = Genero.FANTASIA;
						break;
					case 4:
						genero = Genero.DRAMA;
						break;
					case 5:
						genero = Genero.TERROR;
						break;
					default:
						System.out.println("Escolha inválida!");
						continue; // Volta ao menu
					}

					biblioteca.adicionarLivro(livroTitulo, livroAutor, livroAno, genero);

				} else if (escolhaAdicionar == 2) {
					System.out.println("Qual revista você gostaria de adicionar ao sistema?");
					String revistaTitulo = scanner.nextLine();

					System.out.println("Quem escreveu a revista?");
					String revistaAutor = scanner.nextLine();

					System.out.println("Qual o número ou edição da revista");
					int revistaNumero = scanner.nextInt();
					scanner.nextLine();

					biblioteca.adicionarRevista(revistaTitulo, revistaAutor, revistaNumero);

				} else {
					System.out.println("Escolha Inválida! Voltando ao menu...");
				}

				// Pesquisar livro/revista
			} else if (escolhaMenu == 2) {
				System.out.println("Você gostaria de pesquisar [1] Livros ou [2] Revistas?");
				int escolhaPesquisa = scanner.nextInt();
				scanner.nextLine();

				if (escolhaPesquisa == 1) {
					System.out.println("Digite o título do livro:");
					String livroPesquisa = scanner.nextLine();
					biblioteca.pesquisarLivro(livroPesquisa);

				} else if (escolhaPesquisa == 2) {
					System.out.println("Digite o título da revista:");
					String revistaPesquisa = scanner.nextLine();
					biblioteca.pesquisarRevista(revistaPesquisa);

				} else {
					System.out.println("Escolha Inválida! Voltando ao menu...");
				}

				// Excluir livro/revista
			} else if (escolhaMenu == 3) {
				System.out.println("Você gostaria de remover [1] Livros ou [2] Revistas?");
				int escolhaExclusao = scanner.nextInt();
				scanner.nextLine();

				if (escolhaExclusao == 1) {
					System.out.println("Digite o título do livro a ser excluído:");
					String livroExcluir = scanner.nextLine();
					biblioteca.excluirLivro(livroExcluir);

				} else if (escolhaExclusao == 2) {
					System.out.println("Digite o título da revista a ser excluída:");
					String revistaExcluir = scanner.nextLine();
					biblioteca.excluirRevista(revistaExcluir);
				} else {
					System.out.println("Escolha Inválida! Voltando ao menu...");
				}

				// Listar livros/revistas
			} else if (escolhaMenu == 4) {
				System.out.println("Você gostaria de listar [1] Livros ou [2] Revistas?");
				int escolhaLivroRevista = scanner.nextInt();
				scanner.nextLine();

				if (escolhaLivroRevista == 1) {
					biblioteca.mostrarLivros();
				} else if (escolhaLivroRevista == 2) {
					biblioteca.mostrarRevistas();
				} else {
					System.out.println("Escolha Inválida! Voltando ao menu...");
				}

				// Sair do sistema
			} else if (escolhaMenu == 5) {
				System.out.println("Saindo...");
				break;
			} else {
				System.out.println("Escolha inválida, tente novamente!");
			}
		}
		scanner.close();
	}
}
