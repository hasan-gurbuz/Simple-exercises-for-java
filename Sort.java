import java.util.Scanner;
    public class Sort{
        public static void main(String[] args) {
            Scanner first = new Scanner(System.in);
            Scanner second = new Scanner(System.in);
            System.out.println("enter two number:");
            int  First = first.nextInt();
            int Second = second.nextInt();
            if (First > Second)
                System.out.println(Second+" "+First);
            else
                System.out.println(First+" "+Second);
        }
    }