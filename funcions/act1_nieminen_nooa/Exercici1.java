
public class Exercici1 {
    public static void main(String[] args) {
        inici();
    }

    static void inici() {
        String resultat;
        resultat = signe(0);
        System.out.println(resultat);
    }

    static String signe(int x) {
        String resultat = "";
        if(x == 0) {
            resultat = "zero";
        } else if(x > 0) {
            resultat = "positiu";
        } else if(x < 0) {
            resultat = "negatiu";
        }
        return resultat;
    }
}
