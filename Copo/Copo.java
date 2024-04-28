package Copo;

public class Copo {
    private String material;
    private int capacidadeMl;
    private String cor;
    private String tipoAlca;

    public Copo(String material, int capacidadeMl, String cor, String tipoAlca) {
        this.material = material;
        this.capacidadeMl = capacidadeMl;
        this.cor = cor;
        this.tipoAlca = tipoAlca;
    }

    public void beber() {
        System.out.println("Bebendo...");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacidadeMl() {
        return capacidadeMl;
    }

    public void setCapacidadeMl(int capacidadeMl) {
        this.capacidadeMl = capacidadeMl;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoAlca() {
        return tipoAlca;
    }

    public void setTipoAlca(String tipoAlca) {
        this.tipoAlca = tipoAlca;
    }

    public void encher() {
        System.out.println("Enchendo o copo...");
    }

    public void esvaziar() {
        System.out.println("Esvaziando o copo...");
    }

    public void lavar() {
        System.out.println("Lavando o copo...");
    }
}
    