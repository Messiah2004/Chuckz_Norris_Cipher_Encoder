import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = scanner.nextInt();
        String resultStr = str;

        if (num < str.length()) {
            String testStr1 = str.substring(0, num);
            String testStr2 = str.substring(num);
            resultStr = testStr2 + testStr1;
        }
        
        System.out.println(resultStr);
        
    }
}
