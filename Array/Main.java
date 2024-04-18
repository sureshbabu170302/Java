import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Encapsulation> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Banking Portal - Operations");
            System.out.println();
            System.out.println("Create Account: 1");
            System.out.println("View Account Details: 2");
            System.out.println("Deposit amount to your Account: 3");
            System.out.println("Withdraw amount from your Account: 4");
            System.out.println("Delete Account: 5");
            System.out.println("Exit System: 6");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Creating an account...");
                    System.out.print("Enter account holder name: ");
                    String name = sc.next().toString() + " " + sc.nextLine();
                    System.out.print("Enter account number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter Initial amount in the acount: ");
                    int amount = sc.nextInt();
                    Encapsulation acc = new Encapsulation(name, accNo, amount);
                    arr.add(acc);
                    System.out.println();
                    System.out.println("Account created successfully!");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter Account number to view details: ");
                    int viewAccNo = sc.nextInt();
                    System.out.println();
                    Encapsulation viewAcc = searchAccount(arr, viewAccNo);

                    if (viewAcc != null) {
                        viewAcc.displayAccountDetails(viewAccNo);
                    } else {
                        System.out.println("Account Not found!");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Deposit money into an existing account: ");
                    System.out.print("Enter Account Number : ");
                    int depAccNo = sc.nextInt();
                    System.out.println();
                    Encapsulation searchAccount = searchAccount(arr, depAccNo);
                    if (searchAccount != null) {
                        searchAccount.displayAccountDetails(depAccNo);
                        System.out.println();
                        System.out.print("Enter the amount to be deposited: ");
                        int depositAmount = sc.nextInt();
                        searchAccount.amountDeposit(depositAmount);
                        System.out.println("Amount Deposited successfully ! ");
                        searchAccount.displayAccountDetails(depAccNo);
                    }
                    break;

                case 4:
                    System.out.println("Withdraw money from an existing account: ");
                    System.out.print("Enter Account Number : ");
                    int withdrawAccNo = sc.nextInt();
                    Encapsulation searchwithDrawAccount = searchAccount(arr, withdrawAccNo);
                    if (searchwithDrawAccount != null) {
                        searchwithDrawAccount.displayAccountDetails(withdrawAccNo);
                        System.out.println();
                        System.out.print("Enter the amount to be withdrawed: ");
                        int depositAmount = sc.nextInt();
                        searchwithDrawAccount.amountWithdrawal(withdrawAccNo);
                        System.out.println("Amount withdrawed successfully ! ");
                        searchwithDrawAccount.displayAccountDetails(withdrawAccNo);
                    }
                    break;

                case 5:
                    System.out.print("Enter the account number you want to delete: ");
                    int accNoToDelete = sc.nextInt();
                    Encapsulation accountToDelete = searchAccount(arr, accNoToDelete);
                    if (accountToDelete != null) {
                        accountToDelete.displayAccountDetails(accNoToDelete);
                        ;
                        System.out.println();
                        System.out.print("Are you sure you want to delete the account? (Y/N): ");
                        String decision = sc.next().toUpperCase();
                        if (decision.equals("Y")) {
                            arr.remove(accountToDelete);
                            System.out.println("Account deleted successfully!");
                        } else {
                            System.out.println("Deletion cancelled.");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    System.out.println();
                    break;

                case 6:
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

    private static Encapsulation searchAccount(ArrayList<Encapsulation> accounts, int num) {
        for (Encapsulation acc : accounts) {
            if (acc.getAccountNumber() == num) {
                return acc;
            }
        }
        return null;
    }
}