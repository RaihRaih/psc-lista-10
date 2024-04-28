package Chave;

public class App {
    public static void main(String[] args) {
        Chave chave = new Chave("Redondo", "Metal", "45cm", "Prata");
        System.out.println(chave.getCor()+"\n"+chave.getFormato()+"\n"+chave.getMaterial()+"\n"+chave.getTamanho()+"\n");
        chave.abrir();
        chave.destrancar();
        chave.fechar();
    }
}
