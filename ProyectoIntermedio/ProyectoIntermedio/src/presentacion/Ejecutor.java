package presentacion;
import java.util.Scanner;
public class Ejecutor {
 Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
        MenuPrincipal metodo = new MenuPrincipal();
        metodo.mostrarMenu();
}
}
