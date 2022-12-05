import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirmenu();

	}

	public static void imprimirmenu() {
		Scanner entrada = new Scanner(System.in);

		
		System.out.println("----------------------------------------------------");
		System.out.println("Bienvenido a la escuela Da Vinci ");
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("Acceder como: ");
		System.out.println("1.Alumno ");
		System.out.println("2.Admin");
		System.out.println("3.Salir del sistema");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("----------------------------------------------------");
			System.out.println("Login Alumnos");
			IngresoAlumno();
			break;
		case 2:
			System.out.println("----------------------------------------------------");
			System.out.println("Login Admins");
			IngresoAdmin();
			break;
		case 3:
			System.out.println("----------------------------------------------------");
			System.out.println("Hasta pronto ~~");
			System.exit(opcion);

			break;
		default:
			System.out.println("----------------------------------------------------");
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			imprimirmenu();
			break;
		}

	}

	
	//ingresar como alumno
	private static void IngresoAlumno() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese dni ");
		System.out.println("----------------------------------------------------");
		int dni = entrada.nextInt();
		System.out.println("----------------------------------------------------");
		System.out.println(" Ingrese contraseña");
		System.out.println("----------------------------------------------------");
		int contraseña = entrada.nextInt();

		// Supongamos que este cliente existe en la base de datos, seria un tanto asi
		// Esto es una sobrecarga previa
		//HistorialAcademico historial = new HistorialAcademico(1234, 7); 
		//digamos que este es el historial asignado a este alumno 
		Alumno alumno = new Alumno(41948027 ,"Heber", "Martínez",23, 1,1234);

		if (alumno.Ingresar(dni, contraseña)) {
			menuAlumno(alumno);
		} else {
			System.out.println("No se pudo ingresar");
			System.out.println("Vuelva a intentar");
			IngresoAlumno();
		}

	}

	// ingresar como admin 
	private static void IngresoAdmin() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese dni ");
		int dni = entrada.nextInt();
		System.out.println(" Ingrese contraseña");
		int contraseña = entrada.nextInt();

		// Supongamos que este cliente existe en la base de datos, seria un tanto asi
		// Esto es una sobrecarga previa
			Admin administrador = new Admin (1,"julio","profe",45,1,"profesor de fisica");
		if (administrador.Ingresar(dni, contraseña)) {
			MenuAdmin(administrador);
		} else {
			System.out.println("No se pudo ingresar");
			System.out.println("Vuelva a intentar");
			IngresoAdmin();
		}

	}

	private static void MenuAdmin(Admin administrador) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Bienvenido administrador");
		System.out.println(administrador.getNombre());
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("1.Ver historial alumno ");
		System.out.println("2.Ver materias");
		System.out.println("3.Salir de la cuenta");
		System.out.println("----------------------------------------------------");
		int dinero;

		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Ingrese numero de historial");
			int historial = entrada.nextInt();
			
			Verhistorial(historial,administrador);
			break;
		case 2:
			;
			System.out.println("Ingresar cantidad a depositar");
			dinero = entrada.nextInt();
			break;
		case 3:
			imprimirmenu();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
		// TODO Auto-generated method stub
		
	}

	
	public static void Verhistorial(int historial,Admin administrador) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		if(administrador.AccederHistorial(historial)!=null) {
			HistorialAcademico historialaux = administrador.AccederHistorial(historial);
			System.out.println("Se encontro al alumno");
			Alumno alumno = new Alumno(12345678 ,"Heber", "Martínez",23, 1,1234);
			System.out.println("El alumno es " + alumno);
			System.out.println("1- Modificar historial");
			System.out.println("2-Salir");
			int opcion = entrada.nextInt();
			if(opcion==1) {
				System.out.println("Ingrese su nueva nota ");
				int nota = entrada.nextInt();
				if(historialaux.CambiarNota(nota)) {
					System.out.println("se cambio la nota del alumno !");
					MenuAdmin(administrador);
				}else {
					System.out.println("no se pudo cambiar la nota "); 
					MenuAdmin(administrador);
				}
			}else{
			MenuAdmin(administrador);
			}
		}else {
			System.out.println("No se encontró");
			MenuAdmin(administrador);
		}
	}
	
	// Este menu seria el menu de inicio de el cliente
	public static void menuAlumno(Alumno alumno) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Bienvenido alumno");
		System.out.println(alumno.getNombre());
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("1.Ver perfil");
		System.out.println("2.Ver oferta de materias");
		System.out.println("3.Salir de la cuenta");
		System.out.println("----------------------------------------------------");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			VerPerfil(alumno);
			break;
		case 2:
			OfertaMaterias(alumno);
			break;
		case 3:
			imprimirmenu();
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}

	}

	private static void OfertaMaterias(Alumno alumno) {
		//digamos que en el sistema ya tenemos las notas de este alumno, 
		//matematica  10
		//lengua 4 
		//programacion 2
		Materia materia1 = new Materia(1,"matematica");
		Materia materia2 = new Materia(2,"programacion");
		Materia materia3 = new Materia(3,"lengua");
		Curso cursoMatematica = new Curso(1);
		Curso cursoProgramacion = new Curso(2);
		Curso cursoLengua = new Curso(3);
		Nota nota1 = new Nota(1,10);
		Nota nota2 = new Nota(2,4);
		Nota nota3 = new Nota(3,2);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println(" Materias disponibles  \n" + materia1  + " \n"+ materia2 +" \n"+ materia3 +" \n");
		int opcion = entrada.nextInt();
		switch(opcion) {
			case 1:
				System.out.println("Eligio"+materia1.getNombre());
				System.out.println("su nota es " + nota1.getValor());
				if(nota1.getValor()>7) {
					System.out.println("Esta materia esta promocionada");
				}else if(nota1.getValor()<7 && nota1.getValor()>4) {
					System.out.println("La materia esta aprobada");
					System.out.println("puede anotarse en finales");
					System.out.println(" 1- Ver mesas");
					int mesas = entrada.nextInt();
					if(mesas==1) {
						MostrarMesas(alumno,materia1);
					}
				}
				
				break;
			case 2:
				System.out.println("Eligio"+materia2.getNombre());
				System.out.println("su nota es " + nota2.getValor());
				break;
			case 3:
				System.out.println("Eligio"+materia3.getNombre());
				System.out.println("su nota es " + nota3.getValor());
				break;
		}
		
		
		
		System.out.println(" inscribirse a finales ");
		
		
		
		System.out.println("----------------------------------------------------");
	}

	private static void MostrarMesas(Alumno alumno,Materia materia) {
		
		Scanner entrada = new Scanner(System.in);
		Mesa mesa1 = new Mesa(1,10);
		Mesa mesa2 = new Mesa(2,10);
		System.out.println("las mesas de " +materia.getNombre() + " son estas");
		System.out.println(mesa1);
		System.out.println(mesa2);
		int opcion = entrada.nextInt();
		switch(opcion) {
		case 1:
			mesa1.inscribirme(alumno);
		break;
		}
		
	}

	private static void VerPerfil(Alumno alumno) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("----------------------------------------------------");
		System.out.println("Bienvenidoa su perfil"); 
		System.out.println("información de alumno "); 
		System.out.println("Por favor escoja una de las siguientes opciones");
		System.out.println("1.Informacion personal");
		System.out.println("2.Ver materias cursadas");
		System.out.println("3.Salir al menu de alumno a");
		System.out.println("----------------------------------------------------");
		HistorialAcademico historial = new HistorialAcademico(1234, 7); 
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			System.out.println(alumno);
			System.out.println(historial);
			break;
		case 2:
			//Relaciono al alumno con un historial academico, en este caso solo tengo uno 
			//pero seria el historial 1234 
			System.out.println(alumno);
			break;
		case 3:
			menuAlumno(alumno);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta volver a intentar");
			break;
		}
		
	}

}

