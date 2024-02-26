import java.util.Scanner;

public class LibrarySystem {
    private static String adminUsername = "admin";
    private static String adminPassword = "admin";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Library System ====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3) : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your NIM (15 digits): ");
                    String nim = scanner.next();
                    if (nim.length() == 15) {
                        loginAsStudent();
                    } else {
                        System.out.println("Invalid NIM. Please enter a 15-digit NIM.");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    String inputAdminUsername = scanner.next();
                    System.out.print("Enter your password (admin) : ");
                    String inputAdminPassword = scanner.next();
                    loginAsAdmin(inputAdminUsername, inputAdminPassword);
                    break;
                case 3:
                    System.out.println("Exiting Library System...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void loginAsStudent() {
        System.out.println("Successful login as Student");
    }

    private static void loginAsAdmin(String username, String password) {
        if (adminUsername.equals(username) && adminPassword.equals(password)) {
            System.out.println("Successful login as Admin");
        } else {
            System.out.println("Admin User not Found");
        }
    }
}
