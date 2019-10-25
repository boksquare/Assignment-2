import javax.swing.*;
import java.util.Arrays;
public class data {
    public static void main (String[]args){
        int students[];

        String number = JOptionPane.showInputDialog("Enter the number of students: ");

        int nos = Integer.parseInt(number);

        students = new int [nos];
        student.getInfo(nos);;
    }
}
