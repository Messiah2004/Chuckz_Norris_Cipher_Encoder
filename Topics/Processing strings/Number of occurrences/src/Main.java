import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainStr = scanner.nextLine();
        String subStr = scanner.nextLine();
        String testStr = "";
        int frequency = 0;

        String[] testArray = mainStr.split(" ");
        String[] test2Array = mainStr.split("");
        String[] arrayStr = mainStr.split(subStr);
        if (subStr.equals(testArray[0]) && arrayStr.length == 0) {
            frequency = 1;
        } else if (subStr.equals(testArray[0]) || subStr.equals(test2Array[0])) {
            frequency = arrayStr.length;
        } else {
            frequency = arrayStr.length - 1;
        }
        System.out.print(frequency);
    }
}


