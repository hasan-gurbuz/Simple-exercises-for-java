import java.lang.Math;
import java.text.BreakIterator;
import java.util.Random;
import java.lang.Math;
public class FFunction{
    public static void main(String[] args) {
        Random sayi = new Random();
        double Sayi = sayi.nextDouble();
        System.out.println(Sayi);
        if(Sayi <= 0)
            Sayi= Sayi*Sayi+1;
        else if(Sayi >= 1)
            Sayi = Sayi;
        else
        Sayi = Math.sqrt(Sayi);
        System.out.print(Sayi);
    }
}