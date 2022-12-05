
public class Curso {

	private int comision; 
	
	
	
	public Curso(int comision) {
		super();
		this.comision = comision;
	}



	public int RindeExamen() {
		
		int nota = (int) (Math.random()*10+1);
		
		return nota;
	}
}

