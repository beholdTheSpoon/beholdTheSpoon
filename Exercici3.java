
public class Exercici3 {
    public static void main(String[] args) {
        int resultat = max2(15, 13);
        System.out.println(resultat);
    }

    static int max2(int n1, int n2) {
        int resultat = 0;
        if(n1 > n2) {
            resultat = n1;
        } else {
            resultat = n2;
        }
        return resultat;
    }
}