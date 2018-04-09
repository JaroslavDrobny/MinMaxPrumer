
package minmaxprumer;
import java.util.Scanner;

public class MinMaxPrumer {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pocet = 1, soucet=0;
        while(true) {
            System.out.println("vlož "+pocet+". číslo: ");
            int vstup = sc.nextInt();
            if (vstup==0) break;
            soucet = soucet + vstup;
            if (vstup <min) min=vstup;
            if (vstup >max) max=vstup;
            System.out.println("nejmenší zatím vložené: "+min);
            System.out.println("největší zatím vložené: "+max);
            System.out.println("Průměr: "+((float) soucet/pocet));
            pocet++;
            
            
        }
        
    }
    
}
