package Caneta;

public class Caneta {
    private String corTinta;
    private String tipoPonta;
    private String marca;
    private String corCorpo;

    public Caneta(String corTinta, String tipoPonta, String marca, String corCorpo) {
        this.corTinta = corTinta;
        this.tipoPonta = tipoPonta;
        this.marca = marca;
        this.corCorpo = corCorpo;
    }

    public void escrever() {
        System.out.println("Escrevendo...");
    }

    public void desenhar() {
        System.out.println("Desenhando...");
    }

    public void guardarNoBolso() {
        System.out.println("Guardando a caneta no bolso...");
    }

    public void trocarCargaTinta() {
        System.out.println("Trocar a carga de tinta...");
    }

    /**
     * @return String return the corTinta
     */
    public String getCorTinta() {
        return corTinta;
    }

    /**
     * @param corTinta the corTinta to set
     */
    public void setCorTinta(String corTinta) {
        this.corTinta = corTinta;
    }

    /**
     * @return String return the tipoPonta
     */
    public String getTipoPonta() {
        return tipoPonta;
    }

    /**
     * @param tipoPonta the tipoPonta to set
     */
    public void setTipoPonta(String tipoPonta) {
        this.tipoPonta = tipoPonta;
    }

    /**
     * @return String return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return String return the corCorpo
     */
    public String getCorCorpo() {
        return corCorpo;
    }

    /**
     * @param corCorpo the corCorpo to set
     */
    public void setCorCorpo(String corCorpo) {
        this.corCorpo = corCorpo;
    }

}
