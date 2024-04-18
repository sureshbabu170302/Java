import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList <Encapsulation> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("Create Account: 1");
        System.out.println("View Account Details: 2");
        System.out.println("Delete Account: 3");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();

        switch (choice) {
            case 1:
                System.out.println("Creating an account...");
                System.out.println("Enter account holder name: ");
                String name = sc.next().toString() + " " + sc.nextLine();
                System.out.println("Enter account number: ");
                int accNo = sc.nextInt();
                System.out.println("Enter Initial amount in the acount: ");
                int amount = sc.nextInt();
                Encapsulation acc = new Encapsulation(name, accNo, amount);
                arr.add(acc);
                System.out.println("Account created successfully!");
                System.out.println();
                break;
            case 2:
                System.out.println("Enter Account number to view details: ");
                int viewAccNo = sc.nextInt();
                Encapsulation  viewAcc = searchAccount(arr, viewAccNo);

                if (viewAcc != null) {
                    viewAcc.displayAccountDetails(viewAccNo);
                } else{
                    System.out.println("Account Not found!");
                }
                System.out.println();
                break;
            
            case 3:
                System.out.println("Exiting System, Bye...");
                sc.close();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid choice, please try again");
                break;
        }
        }
    }

    private static Encapsulation searchAccount(ArrayList<Encapsulation> accounts ,int num){
        for(Encapsulation acc : accounts){
            if(acc.getAccountNumber()== num){
                return acc;
            }
        }
        return null;
    }
}