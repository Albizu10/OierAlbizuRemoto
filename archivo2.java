package POO;
import java.util.Scanner;

public class CocheEj9App {
    public static void main(String[] args) { 
        Scanner sc= new Scanner(System.in);
        CocheEj9[]coche=new CocheEj9[2];
        int e=1;
        
        for(int i=0;i<coche.length;i++)
        {System.out.println("Introduce el color y el modelo del coche" + (e=e+1));
        coche[i]= new CocheEj9(sc.nextLine(),sc.nextLine());}
        String equals=CocheEj9.comparador;

    sc.close();
    }
}
