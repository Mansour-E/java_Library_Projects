public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        /*Customer customer2 = new Customer("Tim" , 1000 , "tim@gmail.com");
        Customer customer3 = new Customer("John" , "john@gmail.com");
*/
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());
    }

}
