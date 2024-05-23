public class Professor extends Person{

    String subject;
    String className;
    public Professor(String name, String surname, int age, int height, int weight, String gender, String subject, String className) {
        super(name, surname, age, height, weight, gender);
        this.subject = subject;
        this.className = className;
    }
    @Override
    public void printName(){
        System.out.println("Proffessor " + name + " teaches subject " + subject);
    }
}

