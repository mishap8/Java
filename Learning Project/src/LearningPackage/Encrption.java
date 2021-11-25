package LearningPackage;

import java.util.Scanner;

public class Encrption {
    public static final Scanner INPUT_READER = new Scanner(System.in);
    
    public static void main(String[] args) {
        String name = INPUT_READER.nextLine();
        
        System.out.println(name);
        	
       /* try {
            System.out.println(name);
            //getEncryptedName(name)
        } catch (Exception e) {
            System.out.println(e);
        } */
    }
}

/*class Encrypter {
    public String getEncryptedName(String name){
        boolean validateResponse = Validator.validate(name);
        if (validateResponse == true){
            name = name.toLowerCase();
            StringBuilder str = new StringBuilder(name);
            StringBuilder reverseStr = str.reverse();
            String value = reverseStr.toString();
        }
        if (validateResponse == false){
            String value = "Try again with valid name";
        }
    }
} */ 
/*
class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            
            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }
        
        return true;
    }
}
*/