

public class EscribirEnConsola {

	public static void main(String[] args) {
        imprimir( "Testeando esta mierda");
        int x = 1;
        imprimir( "x = " + x );
    }

    static void imprimir (String contenido) {
        System.console().writer().println(contenido);
    }

}




------------------------------------
void readPasswordFromConsole() {
    Console console = System.console();
    char[] password = console.readPassword("Enter password: ");
    console.printf(String.valueOf(password));
}
Esto solicitará la contraseña y no repetirá los caracteres mientras la escribimos.