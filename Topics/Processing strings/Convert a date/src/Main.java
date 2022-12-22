import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dateSplit = scanner.nextLine().split("-");
        System.out.println(dateSplit[1] + "/" + dateSplit[2] + "/" + dateSplit[0]);
        
    }
}
