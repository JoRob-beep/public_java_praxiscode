import java.util.Scanner;

public class LE_02_03_Flaechen_Volumen {
    public static void main(String[] args){
        while(true) {
            Scanner scanner = new Scanner(System.in);
            double rechteck_laenge;
            double rechteck_breite = 0.0;
            double dreieck_laenge = 0.0;
            double kreis_radius = 0.0;
            double quader_laenge = 0.0;
            double quader_breite = 0.0;
            double quader_hoehe = 0.0;
            double prisma_seite = 0.0;
            double prisma_hoehe = 0.0;
            double zylinder_radius = 0.0;
            double zylinder_hoehe = 0.0;
            String auswahl_flaeche_volumen;
            String auswahl_r_d_k;
            String auswahl_q_p_z;
            String nochmal;
            System.out.println("### Flächen und Volumenberechnung ###");
            System.out.println("Fläche F oder Volumen V ? (H Hilfe)");
            System.out.println("Bitte die richtigen Buchstaben eingeben.");
            auswahl_flaeche_volumen = scanner.nextLine();
            if (auswahl_flaeche_volumen.equalsIgnoreCase("H")) {
                System.out.println("### Hilfe ###");

            } else if (auswahl_flaeche_volumen.equalsIgnoreCase("F")) {
                System.out.println("### Flächenberechnung ###");
                System.out.println("Rechteck R, gleichseitiges Dreieck D, oder Kreis K ?");
                auswahl_r_d_k = scanner.nextLine();
                if (auswahl_r_d_k.equalsIgnoreCase("R")) {
                    System.out.println("Bitte die Länge eingeben: ");
                    rechteck_laenge = scanner.nextDouble();
                    System.out.println("Bitte die Breite eingeben: ");
                    rechteck_breite = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Die Fläche beträgt: " + rechteck_laenge * rechteck_breite);
                } else if (auswahl_r_d_k.equalsIgnoreCase("D")) {
                    System.out.println("Bitte die Seitenlänge eingeben: ");
                    dreieck_laenge = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Die Fläche beträgt: " + (dreieck_laenge * dreieck_laenge * Math.sqrt(3)) / 4);
                } else if (auswahl_r_d_k.equalsIgnoreCase("K")) {
                    System.out.println("Bitte den Radius eingeben: ");
                    kreis_radius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Die Fläche beträgt: " + (Math.pow(kreis_radius, 2) * 3.1416));
                }
            } else if (auswahl_flaeche_volumen.equalsIgnoreCase("V")) {
                System.out.println("### Volumenberechnung ###");
                System.out.println("Qader Q, dreiseitiges-gleichseitiges Prisma P, Zylinder Z ?");
                auswahl_q_p_z = scanner.nextLine();
                if (auswahl_q_p_z.equalsIgnoreCase("Q")) {
                    System.out.println("Bitte gib die Länge ein: ");
                    quader_laenge = scanner.nextDouble();
                    System.out.println("Bitte gib die Breite ein: ");
                    quader_breite = scanner.nextDouble();
                    System.out.println("Bitte gib die Höhe ein: ");
                    quader_hoehe = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Das Volumen des Quaders beträgt: " + (quader_laenge * quader_breite * quader_hoehe));
                } else if (auswahl_q_p_z.equalsIgnoreCase("P")) {
                    System.out.println("Bitte gib eine Seitenlänge der Grundfläche ein: ");
                    prisma_seite = scanner.nextDouble();
                    System.out.println("Bitte gib die Höhe ein: ");
                    prisma_hoehe = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Das Volumen des Prismas beträgt: " + ((prisma_seite * prisma_seite * Math.sqrt(3)) / 4) * prisma_hoehe);
                } else if (auswahl_q_p_z.equalsIgnoreCase("Z")) {
                    System.out.println("Bitte gib den Radius der Grundfläche ein: ");
                    zylinder_radius = scanner.nextDouble();
                    System.out.println("Bitte gib die Höhe ein: ");
                    zylinder_hoehe = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Das Volumen des Zylinders beträgt: " + (3.1416 * zylinder_radius * zylinder_radius * zylinder_hoehe));
                }

            }

            System.out.println("Wollen Sie nochmal N, oder abbrechen A ?");
            nochmal = scanner.nextLine();
            if (nochmal.equalsIgnoreCase("N")){
                continue;
            } else {
                scanner.close();
                break;
            }


        }

    }
}