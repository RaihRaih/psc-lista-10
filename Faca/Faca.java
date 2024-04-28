package Faca;

public class Faca {
    private int tamanhoLamina;
    private String material;
    private String tipoCabo;
    private String marca;

    public Faca(int tamanhoLamina, String material, String tipoCabo, String marca) {
        this.tamanhoLamina = tamanhoLamina;
        this.material = material;
        this.tipoCabo = tipoCabo;
        this.marca = marca;
    }

    public void cortar() {
        System.out.println("Cortando...");
    }

    public void descascar() {
        System.out.println("Descascando...");
    }

    public int getTamanhoLamina() {
        return tamanhoLamina;
    }

    public void setTamanhoLamina(int tamanhoLamina) {
        this.tamanhoLamina = tamanhoLamina;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCabo() {
        return tipoCabo;
    }

    public void setTipoCabo(String tipoCabo) {
        this.tipoCabo = tipoCabo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void afiar() {
        System.out.println("Afiando...");
    }

    public void guardar() {
        System.out.println("Guardando a faca...");
    }
}
