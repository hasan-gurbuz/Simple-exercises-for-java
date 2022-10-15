public class pyramid{
    public static void main(String[] args) {
        for(int i = 0; i <6 ; i++){
            for(int has =1 ; has< 6-i+1;has++)
                System.out.print("#");
            for(int a = 1; a<=1+i*2;a++)
                System.out.print("*");
            for(int hastag = 1; hastag< 6-i+1;hastag++)
                System.out.print("#");
            System.out.println();
            
        }
    }
}
