import java.util.Scanner;
    public class VatRate{
        public static void main(String[] args) {
            Scanner name = new Scanner(System.in);
            System.out.println("Enter a prodduct name");
            String Pname = name.nextLine();
            Scanner price = new Scanner(System.in);
            System.out.println("Enter the price");
            int Price = price.nextInt();
            System.out.print("Vat included price is:"+ Price*118/100);
        }
    }