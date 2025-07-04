public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int number){
        this.accountNumber = number;
    }
    public void setBalance(double balance){
        this.accountBalance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double amount, int accountNumber ){
        if (accountNumber == this.accountNumber){
            this.accountBalance = this.accountBalance + amount;
            System.out.println("Your account balance is now " + this.accountBalance);
        }else{
            System.out.println("invalid account number");
            System.out.println("Your account balance is now " + this.accountBalance);

        }
        return this.accountBalance;
    }
    public double withdraw(double amount , int accountNumber){
        if(this.accountBalance >= amount){
            if (accountNumber == this.accountNumber) {
                this.accountBalance = this.accountBalance - amount;
                System.out.println("Your account balance is now " + this.accountBalance);
            }else{
                System.out.println("invalid account number");
                System.out.println("Your account balance is now " + this.accountBalance);
            }
        }
        return this.accountBalance;
    }

    public String toString(){
        System.out.println("Account Number: " + this.accountNumber + "\nAccount Balance: " + this.accountBalance + "\ncustomer Name: " + this.customerName + "\nemail: " + this.email + "\nphone Number: " + this.phoneNumber);
        return null;
    }

}
