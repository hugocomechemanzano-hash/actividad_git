import java.util.Scanner;
public class AppAlumnoG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.tn);
	
		System.out.println(" --. Registro de Alumno ...
		System.out.print("Introduce el nonbre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce el teléfono: ");
		String telefono = sc.nextLine();
		
		System.out.print("Introduce la edad: ");
		int edad = sc.nextInt();
		
		// Creamos el objeto Alumno (las notas se generan solas en el construc$
		AlumnoG alumno = new AlumnoG(nombre, telefono, edad);
}
