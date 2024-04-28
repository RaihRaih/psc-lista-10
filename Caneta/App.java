package Caneta;

public class App {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Azul", "Esferográfica", "Bic", "Transparente");
        caneta.escrever();
        caneta.desenhar();
        caneta.guardarNoBolso();
        caneta.trocarCargaTinta();
    }
}
