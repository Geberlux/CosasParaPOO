
public class Mesa {

	private int id;
	private int horario;

	@Override
	public String toString() {
		return "Mesa [id=" + id + ", horario=" + horario + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public Mesa(int id, int horario) {
		super();
		this.id = id;
		this.horario = horario;
	}

	public boolean inscribirme(Alumno alumno) {

		return true;
	}
}

