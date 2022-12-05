
public class HistorialAcademico {

	private int nro_historial;
	private double promedio;

	public HistorialAcademico(int nro_historial, double promedio) {
		super();
		this.nro_historial = nro_historial;
		this.promedio = promedio;
	}

	public int getNro_historial() {
		return nro_historial;
	}

	public void setNro_historial(int nro_historial) {
		this.nro_historial = nro_historial;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	

	public boolean CambiarNota(int nota) {

		if(nota>0) {
		double aux = (this.getPromedio()+nota )/ 2;
		this.setPromedio(aux);
		return true;
		}else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "HistorialAcademico [nro_historial=" + nro_historial + ", promedio=" + promedio + "]";
	}
}

