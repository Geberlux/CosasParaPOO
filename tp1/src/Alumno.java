
public class Alumno extends Persona {

	private int nro_alumno;
	private int contrase�a;

	public Alumno(int dni, String nombre, String apellido, int edad, int nro_alumno, int contrase�a) {
		super(dni, nombre, apellido, edad);
		this.nro_alumno = nro_alumno;
		this.contrase�a = contrase�a;
	}

	public int getNro_alumno() {
		return nro_alumno;
	}

	public void setNro_alumno(int nro_alumno) {
		this.nro_alumno = nro_alumno;
	}

	public int getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(int contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public boolean Ingresar(int usuario, int contrase�a) {

		if (usuario == 12345678) {
			if (contrase�a == 1234) {
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

