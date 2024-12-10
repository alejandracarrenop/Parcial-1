
package parcial1;
    import java.util.Scanner;
/**
 * @author Alejandra Carreño Parra
 */
public class Parcial1 {
    private static final Scanner s = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String elección;
        do{
            System.out.print("\\n=== Bienvenido al restaurante ===");
            System.out.println("a. Desplegar un menú");
            System.out.println("b. Realizar mi pedido");
            System.out.println("c. Salir");
            elección = s.next();
            
            switch (elección) {
                case "a" : desplegarMenú();
                case "b" : Ordenar();
                case "c" : System.out.println("Gracias por elegir este restaurante");
                default : System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while (!"c".equals(elección));
    }
    private static void desplegarMenú(){
        int Menú;
        do{
            System.out.println("Elija un menú");
            System.out.println("1. Comidas");
            System.out.println("2. Bebidas");
            System.out.println("3. Postres");
            System.out.println("4. Rergesar");
            Menú = s.nextInt();
            
            switch (Menú) {
                case 1 : desplegarComidas();
                case 2 : desplegarBebidas();
                case 3 : desplegarPostres();
                case 4 : System.out.println("");
                default : System.out.println("Opción no válida. Intente de nuevo.");
            }
        }while (!"4".equals(Menú));
    }

    private static void Ordenar() {
        boolean w = true;
        while (w==true){
            System.out.println("Ponga el código de su plato");
            int code = s.nextInt();
            
        }
    }
    private static void desplegarPostres() {
        Platos.getPostres();
    }

    private static void desplegarBebidas() {
        Platos.getBebidas();
    }

    private static void desplegarComidas() {
        Platos.getComidas();
    }
}
