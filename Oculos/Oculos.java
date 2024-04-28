package Oculos;

public class Oculos {
    private String modelo;
    private String corArmacao;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCorArmacao() {
        return corArmacao;
    }

    public void setCorArmacao(String corArmacao) {
        this.corArmacao = corArmacao;
    }

    public String getGrauLentes() {
        return grauLentes;
    }

    public void setGrauLentes(String grauLentes) {
        this.grauLentes = grauLentes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String grauLentes;
    private String marca;

    public Oculos(String modelo, String corArmacao, String grauLentes, String marca) {
        this.modelo = modelo;
        this.corArmacao = corArmacao;
        this.grauLentes = grauLentes;
        this.marca = marca;
    }

    public void usar() {
        System.out.println("Usando os óculos...");
    }

    public void limpar() {
        System.out.println("Limpando os óculos...");
    }

    public void guardarNoEstojo() {
        System.out.println("Guardando os óculos no estojo...");
    }

    public void ajustar() {
        System.out.println("Ajustando os óculos...");
    }
}
