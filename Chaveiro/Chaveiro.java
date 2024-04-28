package Chaveiro;

public class Chaveiro {
    private int numeroChaves;
    private String material;
    private String forma;

    public int getNumeroChaves() {
        return numeroChaves;
    }

    public void setNumeroChaves(int numeroChaves) {
        this.numeroChaves = numeroChaves;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Chaveiro(int numeroChaves, String material, String forma) {
        this.numeroChaves = numeroChaves;
        this.material = material;
        this.forma = forma;
    }

    public void pendurar() {
        System.out.println("Pendurando o chaveiro...");
    }

    public void guardarNoBolso() {
        System.out.println("Guardando o chaveiro no bolso...");
    }

    public void trocarChaves() {
        System.out.println("Trocando as chaves...");
    }

    public void personalizar() {
        System.out.println("Personalizando o chaveiro...");
    }
}
