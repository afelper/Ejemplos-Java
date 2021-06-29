import java.util.*;

public class LongitudArea {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double radio, longitud, area;
       System.out.println("Intro rad de la circu: ");
       radio = sc.nextDouble();
       longitud = 2 * Math.pow(radio, 2);
       area = Math.PI * Math.pow(radio, 2);
       System.out.println("Longitud de la circ ->"+ longitud);
       System.out.println("Área de la circuferencia -> " + area);

    }
}
