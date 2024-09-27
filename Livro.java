package code;

public class Livro extends Material {
    public enum Genero {
        ROMANCE,
        ACAO,
        FANTASIA,
        DRAMA,
        TERROR
    }

	public static Genero Genero;

    public Genero genero; 

    public Livro(String titulo, String autor, int ano, Genero genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    @Override
    public void mostrarLivrosRevistas() {
        super.mostrarLivrosRevistas();
        System.out.println("Genero: " + genero);
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
