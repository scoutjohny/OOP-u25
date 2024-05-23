import java.util.Scanner;

public class Calculator {
    double operand1, operand2;

    public Calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite jedan broj: ");
        this.operand1 = scanner.nextDouble();
        System.out.println("Unesite još jedan broj: ");
        this.operand2 = scanner.nextDouble();
    }
    public double add(){
        double result = operand1+operand2;
        return result;
    }
}
