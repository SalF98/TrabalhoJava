package code;

class Revista extends Material {
	private int numero = 0;

	public Revista(String titulo, String autor, int numero) {
		super(titulo, autor);
		this.numero = numero;
		
	}

	public void mostrarNumeroRevistas() {
		super.mostrarLivrosRevistas();
			System.out.println("Nº da revista:" + " é " + numero);
			numero = numero + 1;
		}
	}
