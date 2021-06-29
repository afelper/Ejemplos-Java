import java.util.*;
public class Ejercicio1 {

    public static void main(String[]  args) {
        var sc = new Scanner(System.in);

        System.out.println("Fecha de nacimiento dia/mes/años: ");
        var Fnacimiento = sc.nextLine();

        var digitos = suerte(Fnacimiento);
        System.out.println(digitos);    
    }

    
    public static String  suerte(String Fnacimiento){

        String[] nSuerte = Fnacimiento.split("/");
        String item1 = nSuerte[0];  //dia
        String item2 = nSuerte[1];  //mes
        String item3 = nSuerte[2];  //año
        int NumeroSuerte = 0;

        int itemUno = Integer.parseInt(item1);  // string a entero
        int itemDos = Integer.parseInt(item2); 
        int itemTres = Integer.parseInt(item3); 

        
        NumeroSuerte = itemUno + itemDos + itemTres;

        return "Número de la suerte: " + NumeroSuerte;

    }
   
}