public class Person {
    String name;
    String surname;
    int age = 45;
    int height;
    int weight;
    String gender;

    public Person (String name, String surname, int age, int height, int weight, String gender){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public String showNameAndSurname(){
        return name+" "+surname;
    }

    public void printName(){
        System.out.println("Ime naše persone je: "+name);
    }

    public void idealWeight(){
        System.out.println("Idealna težina je: "+(height-110));
    }

    public void idealWeight(String gender){
        if(gender.equals("Male")){
            System.out.println("Idealna težina зa vaš pol je: "+(height-110));
        }else{
            System.out.println("Idealna težina зa vaš pol je: "+(height-100));
        }

    }

}
