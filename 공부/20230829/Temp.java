import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int i = scanner.nextInt();
        double f = 5f / 9f * (i - 32);
        System.out.println("화씨 " + i + "도는 섭씨 " + f + "도 입니다.");
        scanner.close();
    }
}