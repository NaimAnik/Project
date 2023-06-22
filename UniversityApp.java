import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UniversityApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = null;

        while (true) {
            System.out.println("\n----- University App Menu -----");
            System.out.println("1. Student Login");
            System.out.println("2. Guardian Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentUser = studentLogin(scanner);
                    if (currentUser != null) {
                        studentMenu((Student) currentUser);
                    } else {
                        System.out.println("Invalid login credentials!");
                    }
                    break;

                case 2:
                    currentUser = guardianLogin(scanner);
                    if (currentUser != null) {
                        guardianMenu((Guardian) currentUser);
                    } else {
                        System.out.println("Invalid login credentials!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the University App!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static User studentLogin(Scanner scanner) {
        System.out.print("Enter student email: ");
        String studentEmail = scanner.next();

        System.out.print("Enter student password: ");
        String studentPassword = scanner.next();

        // Perform authentication logic and return the student object if authenticated
        // Replace the below code with your own authentication logic
        if (studentEmail.equals("student@example.com") && studentPassword.equals("student123")) {
            return new Student(studentEmail, studentPassword, "S1234", "John Doe");
        } else {
            return null;
        }
    }

    public static User guardianLogin(Scanner scanner) {
        System.out.print("Enter guardian email: ");
        String guardianEmail = scanner.next();

        System.out.print("Enter guardian password: ");
        String guardianPassword = scanner.next();

        // Perform authentication logic and return the guardian object if authenticated
        // Replace the below code with your own authentication logic
        if (guardianEmail.equals("guardian@example.com") && guardianPassword.equals("guardian123")) {
            return new Guardian(guardianEmail, guardianPassword, "G5678", "Jane Smith");
        } else {
            return null;
        }
    }

    public static void studentMenu(Student student) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Student Menu -----");
            System.out.println("1. View Results");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    student.viewResults();
                    break;

                case 2:
                    System.out.println("Logging out from student account...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void guardianMenu(Guardian guardian) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Guardian Menu -----");
            System.out.println("1. View Associated Students");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    guardian.viewAssociatedStudents();
                    break;

                case 2:
                    System.out.println("Logging out from guardian account...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
