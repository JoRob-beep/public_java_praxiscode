package KMS_1_05_LE_9_1_Gossak_Fuhrpark.Controll;

public class Validator {
    private String input;

    public Validator() {}

    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }

    public boolean validateInt() {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Eingabe darf nicht leer sein.");
            return false;
        }
        try {
            Integer.parseInt(input.trim());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Eingabe muss eine ganze Zahl sein.");
            return false;
        }
    }

    public boolean validateDouble() {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Eingabe darf nicht leer sein.");
            return false;
        }
        try {
            Double.parseDouble(input.trim());
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Eingabe muss eine Kommazahl sein.");
            return false;
        }
    }

    public boolean validateBooleanJN() {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Eingabe darf nicht leer sein.");
            return false;
        }
        String val = input.trim().toUpperCase();
        if (val.equals("J") || val.equals("N")) {
            return true;
        }
        System.out.println("Eingabe muss J oder N sein.");
        return false;
    }

    public boolean validateString() {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Eingabe darf nicht leer sein.");
            return false;
        }
        return true;
    }
}
