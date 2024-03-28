import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++){ // i = row, 행
            for(int j = 0; j<=i; j++){ // j = column, 열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}