import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class Palindrome {
  public static boolean isPalindrome(String line) {
    int len = line.length();
    int leng = len;
    int half = leng/2;
    char[] arr = line.toCharArray();
    for (int i=0; i<len; i++) {
      if (arr[i] == ' ') {
        leng -= 1;
      }
    }
    int cnt = 0;
    int left = 0;
    int right = 0;
    while (cnt != half) {
      if (arr[left] == arr[len-1-right]) {
        cnt += 1;
      }
      else {
        if (arr[left] == ' ') {
          left += 1;
        }
        else if (arr[right] == ' ') {
          right += 1;
        }
        else {
          return false;
        }
      }
    }
    return true;
  }
  public static boolean isContainPalindrome(String line) {
    int len = line.length();
    if (len == 1) {
      return true;
    }
    char[] arr = line.toCharArray();
    for (int i=0; i<len; i++) {
      for (int j=i+1; j<len; j++) {
        if (arr[i] != ' ' && arr[j] != ' ' && arr[i] == arr[j]) {
          char[] arr2 = Arrays.copyOfRange(arr, i, j+1);
          String arr3 = new String(arr2);
          if (Palindrome.isPalindrome(arr3)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  public static boolean toPalindrome(String line) {
    System.out.println(Palindrome.isPalindrome(line));
    if (Palindrome.isPalindrome(line)) {
      System.out.println(line);
      return true;
    }
    else {
      int len = line.length();
      char[] arr = line.toCharArray();
      HashMap<Character, Integer> dict = new HashMap<Character, Integer>();
      int leng = 0;
      boolean isContainOdd = false;
      boolean flag = true;
      char odd = ' ';
      // 문자 각각의 갯수 파악
      for (int i=0; i<len; i++) {
        if (dict.containsKey(arr[i])) {
          dict.put(arr[i], dict.get(arr[i])+1);
        }
        else {
          dict.put(arr[i], 1);
        }
        if (arr[i] != ' ') {
          leng += 1;
        }
      }
      // 전체 홀수 짝수와 문자 각각의 짝수 홀수를 판별해 1차로 거르기
      for (HashMap.Entry<Character, Integer> entry : dict.entrySet()) {
        if (entry.getValue()%2 != 0) {
          if (isContainOdd == true) {
            flag = false;
            break;
          }
          odd = entry.getKey();
          isContainOdd = true;
        }
      }
      if (flag == false) {
        System.out.println("impossible to convert");
        return true;
      }
      if (leng%2 == 0) {
        if (isContainOdd == true) {
          System.out.println("impossible to convert");
          return true;
        }
        else {
          char[] answer = new char[leng];
          int i = 0;
          for (HashMap.Entry<Character, Integer> entry : dict.entrySet()) {
            int temp = entry.getValue();
            while (temp > 1) {
              answer[i] = entry.getKey();
              answer[leng-1-i] = entry.getKey();
              temp -= 2;
              i += 1;
            }
          }
          System.out.println(new String(answer));
        }
      }
      else {
        if (isContainOdd) {
          char[] answer = new char[leng];
          int i = 0;
          for (HashMap.Entry<Character, Integer> entry : dict.entrySet()) {
            int temp = entry.getValue();
            while (temp > 1) {
              answer[i] = entry.getKey();
              answer[leng-1-i] = entry.getKey();
              temp -= 2;
              i += 1;
            }
          }
          answer[leng/2] = odd;
          System.out.println(new String(answer));
        }
        else {
          System.out.println("impossible to convert");
        }
      }
    }
    return true;
  }
}

class Test {
  public static void main(String[] args) {
    // System.out.print("Enter String: ");
    Scanner scan = new Scanner(System.in);
    String str;
    // str = scan.nextLine();
    // System.out.println(Palindrome.isPalindrome(str));
    // System.out.print("Enter String: ");
    // str = scan.nextLine();
    // System.out.println(Palindrome.isContainPalindrome(str));
    System.out.print("Enter String: ");
    str = scan.nextLine();
    Palindrome.toPalindrome(str);
  }
}