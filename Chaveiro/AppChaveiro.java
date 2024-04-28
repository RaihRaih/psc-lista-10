package Chaveiro;

public class AppChaveiro {
    public static void main(String[] args) {
        Chaveiro chaveiro = new Chaveiro(3, "Metal", "Redondo");
        chaveiro.pendurar();
        chaveiro.guardarNoBolso();
        chaveiro.trocarChaves();
        chaveiro.personalizar();
    }
}
