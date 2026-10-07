import java.util.Random;

public class KMS_1_05_LE_06_01_Gossak_min_max {
    public static int[][] random_num(){
        int[][] random_data = new int[10][10];
        Random rand = new Random();

        for (int i = 0; i < random_data.length; i++) {
            for (int j = 0; j < random_data[i].length; j++) {
                random_data[i][j] = rand.nextInt(100)+1;
            }
        }
        //System.out.println(random_data[1][2]);
        for (int i = 0; i < random_data.length; i++) {
            for (int j = 0; j < random_data[i].length; j++) {
                System.out.print(random_data[i][j] + "\t");
            }
            System.out.println();
        }
        return random_data;
    }
    public static int minimum(int[][] random_data){
        int min_num = 100;
        for (int j=0; j<=9; j++){
            for (int i=0; i<= 9; i++){
                if (random_data[i][j] < min_num){
                    min_num = random_data[i][j];
                }
            }
        }
        return min_num;
    }
    public static int maximum(int[][] random_data){
        int max_num = 0;
        for (int j=0; j<=9; j++){
            for (int i=0; i<= 9; i++){
                if (random_data[i][j] > max_num){
                    max_num = random_data[i][j];
                }
            }
        }
        return max_num;
    }

    public static void main(String [] args){
        int[][] random_data = random_num();
        int min_num = minimum(random_data);
        System.out.println(min_num);
        int max_num = maximum(random_data);
        System.out.println(max_num);
    }
}
