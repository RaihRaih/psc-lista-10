package Faca;

public class AppFaca {
    public static void main(String[] args) {
        Faca faca = new Faca(15, "Aço inoxidável", "Madeira", "Tramontina");
        faca.cortar();
        faca.descascar();
        faca.afiar();
        faca.guardar();
    }
}
