public class Main {
    public static void main(String[] args) {

        String [] predmet = {"bicikl", "automobil", "telefon"};
        String [] imePredmeta = {"BMX", "Audi", "Samsung"};
        double [] cena = {215.54, 1000.00, 400.44};

        for (int i = 0; i < predmet.length; i++) {
            System.out.println(imePredmeta[i] + " je " + predmet[i] + ", i kosta " + cena[i] + "eur-a.");
        }
    }
}