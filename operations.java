import java.util.Scanner;
public class operations{
    static public void main(String[] args){
        System.out.print("[1] Addition \n[2] Subtraction\n[3] Multiplication\n[4] Division\n");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner opr = new Scanner(System.in);
        Scanner cho = new Scanner(System.in);
        String choise = "Y";
       
       while(choise.equals("Y")) { 
        System.out.println("Enter two number");
        double number1 = num1.nextDouble();
        double number2 = num2.nextDouble();
        System.out.println("operations..:");
        int operation = opr.nextInt(); 
        switch (operation) {
            case 1:
                System.out.println(number1+number2);
                break;
            case 2:
                System.out.println(number1-number2);
                break;
            case 3:
                System.out.println(number1*number2);
                break;
            case 4:
                System.out.println(number1/number2);
                break;
            default:
                break;
        }
        System.out.println("Do you want to continue [Y/N]");
        choise = cho.nextLine();
       } 
    }
}
