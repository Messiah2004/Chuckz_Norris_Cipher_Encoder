import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            str.charAt(i);
            newStr += str.charAt(i);
            newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
}
