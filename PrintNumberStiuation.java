import java.util.Scanner;
    public class PrintNumberStiuation {
        public static void main(String[] args) {
            Scanner Nmbr = new Scanner(System.in);
            System.out.println("Enter a number");
            int a = Nmbr.nextInt();
            if(a%2 == 0)
                System.out.println(a +" is a even number");
            else
            System.out.println(a +" is a odd number");
        }
        
    }