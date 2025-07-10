public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim" , "11/11/1985"  , "01.01.2020");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee max = new Employee("Max" , "11/11/1986"  , "01.01.2022");
        System.out.println(max);
        System.out.println("Age = " + max.getAge());
        System.out.println("Age = " + max.getAge());

        System.out.println(max.getEmployeeId());
        System.out.println(tim.getEmployeeId());

        SalariedEmployee joe = new SalariedEmployee("joe" , "11/11/1990" , "03/03/2020" , 35000 );
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970" , "03/03/2021" , 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());

    }
}
