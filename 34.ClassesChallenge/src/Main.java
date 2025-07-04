public class Main {

    public static void main(String[] args) {


        BankAccount account = new BankAccount();
        account.setCustomerName("hasan");
        account.setEmail("mansuurem@gmail.com");
        account.setAccountNumber(1234);
        account.setBalance(500);
        account.setPhoneNumber(1748445659);

        account.toString();
        System.out.println("---------------------------------------");

        account.deposit(100,12344);

        System.out.println("---------------------------------------");
        account.deposit(100,1234);

        System.out.println("---------------------------------------");
        account.withdraw(200,12344);

        System.out.println("---------------------------------------");
        account.withdraw(200,1234);

        System.out.println(account.getCustomerName() + "has " + account.getAccountBalance());

    }
}
