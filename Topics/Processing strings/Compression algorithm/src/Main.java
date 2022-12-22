import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            Character curChar = str.charAt(i);
            Character preChar = '0';
            if (i > 0) {
                preChar = str.charAt(i - 1);
            }

            if (i == 0 && 1 != str.length()) {
                newStr += str.charAt(i);
                counter++;
            } else if (i != str.length() - 1 && i > 0 && curChar.equals(preChar)) {
                counter++;
            } else if (i != str.length() - 1 && i > 0 && !curChar.equals(preChar)) {
                newStr += counter;
                newStr += str.charAt(i);
                counter = 0;
                counter++;
            } else if (i == str.length() - 1 && curChar.equals(preChar)) {
                counter++;
                newStr += counter;
            } else if (i > 0 && i == str.length() - 1 && !curChar.equals(preChar)) {
                newStr += counter;
                newStr += str.charAt(i);
                counter = 1;
                newStr += counter;
            } else if (i == 0 && i == str.length() - 1 && !curChar.equals(preChar)) {
                newStr += str.charAt(i);
                counter = 1;
                newStr += counter;
            }
        }

        System.out.print(newStr);
    }
}
