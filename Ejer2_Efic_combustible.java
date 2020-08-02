
import java.util.Scanner;

// Kilómetros por galón(US) = mpg*1.609344
public class Ejer2_Efic_combustible
    {
        public static void main(String[] args)
        {
        double a;
        double mpg,x1;
        mpg=1.609344;
       
        Scanner Tecl = new Scanner(System.in);
        System.out.print("Escriba el valor en  MPG = ");
        a = Tecl.nextDouble();
        x1= a * mpg;
        System.out.println("El valor en  LPK = "+x1);
        
    }
    }
