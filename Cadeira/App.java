package Cadeira;

public class App {
    public static void main(String[] args) {
        Cadeira cadeira = new Cadeira(" Madeira ", null, " Escritório ", 12);
        cadeira.setCor("Azul");
        System.out.println(cadeira.getCor() + cadeira.getMaterial() + cadeira.getTipo());
        cadeira.sentar();
        cadeira.empilhar();
        cadeira.mover();
    }
}
