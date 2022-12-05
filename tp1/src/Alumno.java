
public class Alumno extends Persona {

	private int nro_alumno;
	private int contraseña;

	public Alumno(int dni, String nombre, String apellido, int edad, int nro_alumno, int contraseña) {
		super(dni, nombre, apellido, edad);
		this.nro_alumno = nro_alumno;
		this.contraseña = contraseña;
	}

	public int getNro_alumno() {
		return nro_alumno;
	}

	public void setNro_alumno(int nro_alumno) {
		this.nro_alumno = nro_alumno;
	}

	public int getContraseña() {
		return contraseña;
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public boolean Ingresar(int usuario, int contraseña) {

		if (usuario == 12345678) {
			if (contraseña == 1234) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	

	@Override
	public String toString() {
		return "Alumno [Nro Alumno=" + nro_alumno + ", DNI=" + getDni()
				+ ", Nombre()=" + getNombre() + ", Apellido()=" + getApellido() + 
				", Edad()=" + getEdad()
				+ "]";
	}

	public void VerHistorial() {

	}
}

