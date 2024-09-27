package code;

public class Material {
	private String titulo;
	private String autor;

	public Material(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public void mostrarLivrosRevistas() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor: " + autor);
	}

	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}