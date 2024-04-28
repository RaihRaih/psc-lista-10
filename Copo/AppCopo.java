package Copo;

public class AppCopo {
    public static void main(String[] args) {
        Copo copo = new Copo("Vidro", 300, "Transparente", "Sem alça");
        copo.encher();
        copo.beber();
        copo.esvaziar();
        copo.lavar();
    }
}
