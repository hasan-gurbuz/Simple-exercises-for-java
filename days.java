import java.util.Scanner;
public class days{
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.println("Enter the da number");
        int Sayi = sayi.nextInt();
        switch (Sayi) {
            case 1:
                System.out.print("monday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thursday");
                break;
            case 5:
                System.out.print("friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            case 7:
                System.out.print("sunday");
                break;
            default:
                break;
        }

    }
}