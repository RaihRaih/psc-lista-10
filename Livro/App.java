package Livro;

public class App{
    public static void main(String[] args) {
        Livro livro = new Livro("Raissa linda!", "Raissa", "45", "Comédia");
        System.out.println(livro.getTitulo() + " eh uma " + livro.getGenero() + " de " + livro.getNumeroPaginas()+" paginas.");
        livro.emprestar();
        livro.folear();
        livro.ler();
        livro.folear();
        livro.ler();
    }
}