package Cadeira;

public class Cadeira {
    private String material;
    private String cor;
    private String tipo;
    private int alturaEncosto;

    public Cadeira(String material, String cor, String tipo, int alturaEncosto) {
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.alturaEncosto = alturaEncosto;
    }

    public void sentar() {
        System.out.println("Sentando na cadeira...");
    }

    public void recostar() {
        System.out.println("Recostando na cadeira...");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAlturaEncosto() {
        return alturaEncosto;
    }

    public void setAlturaEncosto(int alturaEncosto) {
        this.alturaEncosto = alturaEncosto;
    }

    public void mover() {
        System.out.println("Movendo a cadeira...");
    }

    public void empilhar() {
        System.out.println("Empilhando cadeiras...");
    }
}

