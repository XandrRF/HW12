public class Person {
    private String name;
    private String jobTitle;
    private String placeOfWork;
    private int age;
    private int salary;

    public Person() {
    }

    public Person(String name, String jobTitle, String placeOfWork, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.placeOfWork = placeOfWork;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
