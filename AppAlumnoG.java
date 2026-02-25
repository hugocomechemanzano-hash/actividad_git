import java.util.Random;
public class AlunnoG {

	private String nombre;
	private String telefono;
	private int edad;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public AlumnoG(String nombre, String telefono, int edad) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		
		Random r = new Random();
		this.nota1 = 1 + r.nextInt(10);
		this.nota2 = 1 + r.nextInt(10);
		this.nota3 = 1 + r.nextInt(10);
}
