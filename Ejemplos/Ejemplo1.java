public class Ejemplo1 {
    public static void main(String[] args){
        var nombre = "Adrian Perez";
        var resultado = saludo(nombre); //método saludo
        System.out.println(resultado);
    }
    public static String saludo(String nombre){
        return "Hola " + nombre + "!";
    }
}