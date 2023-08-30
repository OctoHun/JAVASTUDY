import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // 입력받은 연도가 윤년인지 아닌지 알려주는 프로그램
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int day = scanner.nextInt();
        boolean isLeapYear = IsLeapYear(i);
        WhatDayIsIt(isLeapYear, day);
        scanner.close();
    }

    private static void WhatDayIsIt(boolean isLeapYear, int day) {
        int[] dayOfMonth_NoneLeap = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] dayOfMonth_Leap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int month = 0, day_answer = 0;
        for (int i = 0; i < 12; i++) {
            if (isLeapYear) {
                if (day > dayOfMonth_Leap[i]) {
                    day -= dayOfMonth_Leap[i];
                } else {
                    month = i + 1;
                    day_answer = day;
                    break;
                }
            } else {
                if (day > dayOfMonth_NoneLeap[i]) {
                    day -= dayOfMonth_NoneLeap[i];
                } else {
                    month = i + 1;
                    day_answer = day;
                    break;
                }
            }
        }
        System.out.println(month + "월" + day_answer + "일 입니다.");
    }

    private static boolean IsLeapYear(int i) {
        boolean answer = (i % 4 == 0) ? (i % 100 == 0) ? (i % 400 == 0) ? true : false : true : false;
        if (answer) {
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
        return answer;
    }
}