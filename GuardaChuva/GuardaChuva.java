package GuardaChuva;

public class GuardaChuva {
    private String tamanhoAberto;
    private String tamanhoFechado;
    private String cor;
    private String material;
    public String getTamanhoAberto() {
        return tamanhoAberto;
    }

    public void setTamanhoAberto(String tamanhoAberto) {
        this.tamanhoAberto = tamanhoAberto;
    }

    public String getTamanhoFechado() {
        return tamanhoFechado;
    }

    public void setTamanhoFechado(String tamanhoFechado) {
        this.tamanhoFechado = tamanhoFechado;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    private String tipoCabo;

    public GuardaChuva(String tamanhoAberto, String tamanhoFechado, String cor, String material, String tipoCabo) {
        this.tamanhoAberto = tamanhoAberto;
        this.tamanhoFechado = tamanhoFechado;
        this.cor = cor;
        this.material = material;
        this.tipoCabo = tipoCabo;
    }

    public void abrir() {
        System.out.println("Abrindo o guarda-chuva...");
    }

    public void fechar() {
        System.out.println("Fechando o guarda-chuva...");
    }

    public void protegerDaChuva() {
        System.out.println("Protegendo da chuva...");
    }

    public void guardar() {
        System.out.println("Guardando o guarda-chuva...");
    }
}

