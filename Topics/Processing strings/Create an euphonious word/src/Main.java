import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("");
        int counter = 0;
        int refCount = 0;
        int reference = 0;
        
        int result = 0;
        boolean vowelTrue = false;
        boolean consTrue = false;
        
        
        

        for (int i = 0; i < str.length; i++) {
            
            

            if (counter == 3) {
                if (refCount > 0) {
                    counter = 0;
                    refCount = 0;
                    result += 1;
                    vowelTrue = true;
                    
                } if (refCount < 0) {
                    counter = 0;
                    refCount = 0;
                    result += 1;
                    consTrue = true;
                } 
            } else if (counter == 2 && (vowelTrue || consTrue)) {
                counter = 0;
                result += 1;
            } else if (i == str.length - 1 && (vowelTrue || consTrue)) {
                result += 1;
            }
            
            if (str[i].equalsIgnoreCase("a") || str[i].equalsIgnoreCase("e") || str[i].equalsIgnoreCase("i")|| str[i].equalsIgnoreCase("o") || str[i].equalsIgnoreCase("u") || str[i].equalsIgnoreCase("y")){
                if (reference == 68) {
                    consTrue = false;
                    counter = 0;
                    refCount = 0;
                    counter += 1;
                    refCount += 2;
                    reference = 69;
                } else if (reference == 69 || i == 0) {
                    counter += 1;
                    refCount += 2;
                    reference = 69;
                }
            } else {
                if (reference == 69) {
                    vowelTrue = false;
                    counter = 0;
                    refCount = 0;
                    counter += 1;
                    refCount -= 1;
                    reference = 68;
                } else if (reference == 68 || i == 0) {
                    counter += 1;
                    refCount -= 1;
                    reference = 68;
                }
            }

            if (i == str.length - 1 && (refCount == 6 || refCount == -3)) {
                result += 1;
            }
        }

        System.out.println(result);
        
        
    }
}
