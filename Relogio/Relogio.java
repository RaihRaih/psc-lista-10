package Relogio;

public class Relogio {
    private String marca;
    private String tipo;
    private String materialPulseira;
    private String cor;

    public Relogio(String marca, String tipo, String materialPulseira, String cor) {
        this.marca = marca;
        this.tipo = tipo;
        this.materialPulseira = materialPulseira;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterialPulseira() {
        return materialPulseira;
    }

    public void setMaterialPulseira(String materialPulseira) {
        this.materialPulseira = materialPulseira;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void mostrarHoras() {
        System.out.println("Mostrando as horas...");
    }

    public void ajustarHorario() {
        System.out.println("Ajustando o horário...");
    }

    public void alarmar() {
        System.out.println("Alarmando...");
    }

    public void cronometrar() {
        System.out.println("Cronometrando...");
    }
}
