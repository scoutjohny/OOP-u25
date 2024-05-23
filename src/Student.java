public class Student extends Person{
    String Class;
    String schoolName;

    private String nickname;

    public Student(String name, String surname, int age, int height, int weight, String gender) {
        super(name, surname, age, height, weight, gender);

    }

    public void printNickname(){
        System.out.println(nickname);
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    @Override
    public void printName(){
        System.out.println("Ime našeg studenta je: "+name+" "+surname);
        super.printName();
    }
}
