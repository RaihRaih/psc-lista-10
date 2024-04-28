package Chave;

public class Chave {
    private String formato;
    private String material;
    private String tamanho;
    private String cor;

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Chave(String formato, String material, String tamanho, String cor) {
        this.formato = formato;
        this.material = material;
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public void abrir() {
        System.out.println("Abrindo a chave...");
    }

    public void fechar() {
        System.out.println("Fechando a chave...");
    }

    public void trancar() {
        System.out.println("Trancando a chave...");
    }

    public void destrancar() {
        System.out.println("Destrancando a chave...");
    }
}

