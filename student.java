import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
public class student {
    static void getInfo(int nos){
        String First;
        String Last;

        String PeoplesoftID;
        int PID;

        String Year;
        String Email;
        String St;

        String AreaCode;
        int Zipcode;

        String City;
        String Addy;

        String N= "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";

        String Emails="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";

        String PSID= "^[0-9]{7}";

        String Add= "\\d{1,3}.?\\d{0,3}\\s[a-zA-Z]{2,30}\\s[a-zA-Z]{2,15}";


        String State="^(?-i:A[LKSZRAEP]|C[AOT]|D[EC]|F[LM]|G[AU]|HI|I[ADLN]|K[SY]|LA|M[ADEHINOPST]|N[CDEHJMVY]|O[HKR]|P[ARW]|RI|S[CD]|T[NX]|UT|V[AIT]|W[AIVY])$";

        String CY="^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";

        String Zip = "^\\d{5}-\\d{4}|\\d{5}|[A-Z]\\d[A-Z] \\d[A-Z]\\d$";

        String[] StudentYear= new String[] {"Freshman", "Sophomore","Junior","Senior"};

            for (int z = 0; z < nos; z++){
                First= JOptionPane.showInputDialog("Enter first name: ");
                    while(!(First.matches(N))){
                        First=JOptionPane.showInputDialog("Invalid first name, try again:  ");


                    }
                Last= JOptionPane.showInputDialog("Enter last name: ");
                while(!(Last.matches(N))){
                    Last=JOptionPane.showInputDialog("Invalid last name, try again:  ");


                }
                PeoplesoftID= JOptionPane.showInputDialog("Enter Peoplesoft ID: ");
                while(!(PeoplesoftID.matches(PSID))){
                    PeoplesoftID=JOptionPane.showInputDialog("Invalid Peoplesoft ID, try again:  ");
                    PID = Integer.parseInt(PeoplesoftID);


                }
                Year= JOptionPane.showInputDialog("Enter Class standing: ");
                while(!(Arrays.asList(StudentYear).contains(Year))){
                    Year=JOptionPane.showInputDialog("Invalid Class Standing, try again:  ");


                }
                Email= JOptionPane.showInputDialog("Enter email address: ");
                while(!(Email.matches(Emails))){
                    Email=JOptionPane.showInputDialog("Invalid email address, try again:  ");


                }
                Addy= JOptionPane.showInputDialog("Enter address: ");
                while(!(Addy.matches(Add))){
                    Addy=JOptionPane.showInputDialog("Invalid address, try again:  ");


                }
                City= JOptionPane.showInputDialog("Enter city: ");
                while(!(City.matches(CY))){
                    City=JOptionPane.showInputDialog("Invalid city, try again:  ");


                }
                St= JOptionPane.showInputDialog("Enter state: ");
                while(!(St.matches(State))){
                    St=JOptionPane.showInputDialog("Invalid state, try again:  ");


                }
                AreaCode= JOptionPane.showInputDialog("Enter zip code: ");
                while(!(AreaCode.matches(Zip))){
                    AreaCode=JOptionPane.showInputDialog("Invalid zip code, try again:  ");
                }
                displayInfo(Last, First, PeoplesoftID,  Email,  St,  AreaCode,  Year,  City,  Addy,  nos);
            }
    }
    static void displayInfo(String Last,  String First, String PeoplesoftID, String Email, String St, String AreaCode, String Year, String City, String Addy, int nos ){
        int no = nos;
        String Fname = First;

        String Lname = Last;

        String StudentID = PeoplesoftID;

        String Mail = Email;

        String STE = St;

        String ZCode = AreaCode;

        String StudentStatus = Year;

        String Location = City;

        String Home = Addy;


        String[] LIST  = new String[]{Fname, Lname, StudentID, StudentStatus, Mail, Home, Location, STE, ZCode };


        System.out.println("Students Details, Department of ILT");

        for(int f = 0; f < LIST.length; f++){
            System.out.print(LIST[f] + " ");
        }

        System.out.println();
        System.out.println("Number of students: " +nos);
    }


}
