import java.util.Scanner;

public class ContactoController {

    public static void main(String[] args) {
        // 1. Inicialización del Scanner para capturar datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- SISTEMA DE CONTACTO - PORTAFOLIO JLE ---");

        // 2. Captura de datos del formulario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su mensaje: ");
        String mensaje = scanner.nextLine();

        // 3. Llamada al método de notificación (CORREGIDO: Ahora está dentro del flujo)
        enviarNotificacion(nombre, email, mensaje);

        // 4. Cierre de recursos (CORREGIDO: Elimina el error de 'Resource leak')
        scanner.close();
        
        System.out.println("\nProceso finalizado con éxito.");
    }

    /**
     * Método para simular el envío de una notificación de contacto.
     * Ubicado fuera del main para mantener una estructura limpia.
     */
    public static void enviarNotificacion(String nombre, String email, String mensaje) {
        System.out.println("\n========================================");
        System.out.println("[NOTIFICACIÓN DE CONTACTO RECIBIDA]");
        System.out.println("De: " + nombre + " (" + email + ")");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Estado: Enviado a la bandeja de José Leonel.");
        System.out.println("========================================\n");
    }
}