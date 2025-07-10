public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){
        this("carla", "12" , "14");
    }
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
}
