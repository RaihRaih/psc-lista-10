package Livro;

/*1. Livro:
   - Características:
     - Título
     - Autor
     - Número de páginas
     - Gênero
   - Ações:
     - Ser lido
     - Ser folheado
     - Ser emprestado
     - Ser guardado na estante
     */

public class Livro{
    public String getTitulo() {
        return titulo;
    }
    public void ler(){
        System.out.println("Lendo ...");
    }
    public void folear(){
        System.out.println("Passar pagina");
    }
    public void emprestar(){
        System.out.println("Emprestando o livro..");
    }
    public void guardar(){
        System.out.println("Guardando o livro..");
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


    public String getNumeroPaginas() {
        return numeroPaginas;
    }


    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    private String titulo;
    private String autor;
    private String numeroPaginas;
    private String genero;
    public int getGenero;


    public Livro(String titulo, String autor, String numeroPaginas, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }

    
}