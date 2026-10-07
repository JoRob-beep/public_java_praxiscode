import java.util.Scanner;

public class LE_03_04_tabelle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String start;
        String end;
        String increment;
        double start_num = 0;
        double end_num = 0;
        double increment_num = 0;
        double end_num_increase = 0;
        double start_num_increase = 0;

            System.out.println("### Tabelle ####");
        while(true) {
            System.out.println("Geben Sie den Startwert ein: ");
            start = scanner.nextLine();
            if (start.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")) {
                start_num = Double.parseDouble(start);
                break;
            } else {
                System.out.println("Das war keine Zahl");
            }
        }
        while(true) {
            System.out.println("Geben Sie den Endwert ein: ");
            end = scanner.nextLine();

            if (end.matches("^-?\\d+(\\.\\d+)?([eE][-+]?\\d+)?$")) {
                end_num = Double.parseDouble(end);
                if (start_num < end_num) {
                    break;
                } else {
                    System.out.println("Da war die zweite Zahl kleiner.");
                }
            } else {
                System.out.println("Das war keine Zahl");
            }
        }
        end_num_increase = end_num;
        start_num_increase = start_num;

        for(int j=1; j< 12; j++) {
            increment_num = (end_num_increase - start_num_increase) / 10;
            if (j==1){
                System.out.printf("%4d  ", j);
            }else{
                System.out.printf("%4d  ", (j-1)*10);
            }
            for (double i = start_num_increase; i <= end_num_increase; i += increment_num) {
                    System.out.printf(" %10.2f    ", i);
            }
            start_num_increase = start_num * (j*10);
            end_num_increase = end_num * (j*10);
            System.out.printf("\n");
        }
    }
}
