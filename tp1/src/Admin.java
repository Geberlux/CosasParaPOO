
public class Admin extends Persona{

	private int id;
	private String titulo; 
	
	public Admin(int dni, String nombre, String apellido, int edad, int id, String titulo) {
		super(dni, nombre, apellido, edad);
		this.id = id;
		this.titulo = titulo;
	}

	@Override
	public boolean Ingresar(int usuario, int contraseña) {

		if (usuario == 12345679) {
			if (contraseña == 1234) {
				return true;
			} 
		} else {
			return false;
		}
		return false;
	}
	
	public HistorialAcademico AccederHistorial(int nro_historial) {
		
		
		/*pensemos que estamos llamando a una base de datos y pidiendole 
		los datos de el alumno con el histortial con numero de alumno1 1234*/
		HistorialAcademico historial = new HistorialAcademico(1234, 7); 
		if(nro_historial == historial.getNro_historial()) {
			return historial;
		}else {
			return null;
		}
	}
	
	
	
}

