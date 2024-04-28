package Oculos;

public class App {
    public static void main(String[] args) {
        Oculos oculos = new Oculos("Oculos Gatinho", "Amarelo", "2,4", "null");

        System.out.println(oculos.getCorArmacao() + " eh um " + oculos.getModelo() + " de " + oculos.getGrauLentes()+" graus.");
        oculos.ajustar();
        oculos.limpar();
        oculos.usar();
        oculos.guardarNoEstojo();
    }
}
