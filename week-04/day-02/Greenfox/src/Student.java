public class Student extends Person {
    String previousOrganization;
    int skipDays;
    int numberOfDays;
    public Student (String name, int age, String gender, String previousOrganization){
        super(name,age,gender);
        this.previousOrganization = previousOrganization;
    }
    public Student(){
        super("Jane Doe", 30, "female");
        previousOrganization = "The School of Life";
        skipDays = 0;
        numberOfDays = 0;
    }
    public void getGoal(){
        System.out.println("Be a junior software developer");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skipDays + " days from the course already.");
    }
    public void SkipDays(){
        skipDays = numberOfDays;
    }
    public void skipDays(int i) {
    }
}
