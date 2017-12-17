package p5;

import javax.swing.JOptionPane;

public class Password {
    public static void main(String[] args) {
        while(true) {
            String lastName = JOptionPane.showInputDialog("Last name? ");
            String newPassword = JOptionPane.showInputDialog("What do you wish your new password to be?");
            if (newPassword.length() > 5) {
                if (findNonAlpha(newPassword) && !newPassword.contains(lastName)) {
                    System.out.println("Password accepted");
                    return;
                } else {
                    System.out.println("Passwords must have at least one non-aplhanumeric character and can not contain last name");
                }
            } else {
                System.out.println("Passwords must have at least 6 characters");
            }
        }
    }//end method

    private static boolean findNonAlpha(String newPassword) {
        boolean found = false;
        for (int i = 0; i < newPassword.length() && !found; i++) {
            String eachChar = newPassword.substring(i, i + 1);
            if (eachChar.equals("+") ||
                    eachChar.equals("-") ||
                    eachChar.equals("*") ||
                    eachChar.equals("/") ||
                    eachChar.equals("@")) {
                found = true;
            }
        }
        return found;
    }

}//end class Password
