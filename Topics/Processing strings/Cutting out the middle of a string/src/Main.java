import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String resultStr1 = "";
        String resultStr2 = "";
        String mainResult = "";
        

        if (s.length() % 2 == 0 && s.length() != 2) {
            int firstNum = (s.length() / 2 - 1);
            int secNum = (s.length() / 2);

            resultStr1 = s.substring(0, firstNum);
            resultStr2 = s.substring(secNum + 1);
            mainResult = resultStr1 + resultStr2;
        } else if (s.length() % 2 != 0 && s.length() != 1) {
            double firstNum = (s.length() / 2 + .5);
            resultStr1 = s.substring(0, (int)firstNum);
            resultStr2 = s.substring((int)firstNum + 1);
            mainResult = resultStr1 + resultStr2;
        }

        System.out.println(mainResult);
    }
}
