import java.util.Scanner;

public class Notendurchschnittsrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Fächer ein: ");
        int anzahlFaecher = scanner.nextInt();

        double gesamtpunktzahl = 0;
        for (int i = 0; i < anzahlFaecher; i++) {
            System.out.print("Geben Sie die erzielte Punktzahl für Fach " + (i + 1) + " ein: ");
            double erzieltePunktzahl = scanner.nextDouble();

            System.out.print("Geben Sie die maximal mögliche Punktzahl für Fach " + (i + 1) + " ein: ");
            double maxPunktzahl = scanner.nextDouble();

            gesamtpunktzahl += berechneNote(erzieltePunktzahl, maxPunktzahl);
        }

        double durchschnitt = gesamtpunktzahl / anzahlFaecher;
        System.out.println("Der Notendurchschnitt ist: " + durchschnitt);

        scanner.close();
    }

    public static double berechneNote(double erzieltePunktzahl, double maxPunktzahl) {
        return ((erzieltePunktzahl * 5) / maxPunktzahl) + 1;
    }
}
