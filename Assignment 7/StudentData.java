import java.util.Scanner;

public class StudentData{
    private String firstname;
    private String lastname;
    private String middlename;
    private String prn;

    public void enternames() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        firstname = scanner.nextLine();

        System.out.print("Enter your last name: ");
        lastname = scanner.nextLine();
    }

    public void appendmiddlename() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your middle name: ");
        middlename = scanner.nextLine();

        firstname += " " + middlename;
    }

    public void enterandmanipulateprn() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your 11-digit PRN as text data: ");
        prn = scanner.nextLine();

            prn = "CS" + prn.substring(8);
        
         
    }

    public void displayresult() {
        System.out.println("Full Name: " + firstname + " " + lastname);
        System.out.println("Modified PRN: " + prn);
    }

    public static void main(String[] args) {
        StudentData program = new StudentData();

        program.enternames();
        program.appendmiddlename();
        program.enterandmanipulateprn();
        program.displayresult();
    }
}

