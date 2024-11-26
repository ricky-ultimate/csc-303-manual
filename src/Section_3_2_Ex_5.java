import javax.swing.*;

public class Section_3_2_Ex_5 {
    public static void main(String[] args){
        String Surname = JOptionPane.showInputDialog("Surname: ");
        String FirstName = JOptionPane.showInputDialog("First name: ");
        String MiddleName = JOptionPane.showInputDialog("Middle name: ");

        toUpper(Surname, FirstName, MiddleName);
        reverseName(Surname, FirstName, MiddleName);
        getInitials(Surname, FirstName, MiddleName);
    }

    public static void toUpper(String surname, String firstname, String middlename){
        String FullNameUpper = surname.toUpperCase() + " " + firstname.toUpperCase() + " " + middlename.toUpperCase();
        JOptionPane.showMessageDialog(null, "Name in uppercase: " + FullNameUpper);
    }

    public static void reverseName(String surname, String firstname, String middlename){
         String ReversedName = middlename + " " + firstname + " " + surname;
         JOptionPane.showMessageDialog(null, "Reversed name: " + ReversedName);
    }

    public static void getInitials(String surname, String firstname, String middlename){
        char sur_initial = surname.charAt(0);
        char first_initial = firstname.charAt(0);
        char middle_initial = middlename.charAt(0);

        String totalInitial = sur_initial + " " + first_initial + " " + middle_initial;
        JOptionPane.showMessageDialog(null, "Total Initials: " + totalInitial.toUpperCase());
    }
}
