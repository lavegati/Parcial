import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("Cantidad de rutas");
		Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
		int [] rutas = new int [0];	
		int [] conductores =new int [0];
		if (r%2 != 0) {
			System.out.println("Falta una ruta");
		}
		else {
			rutas = new int [r];	
			conductores =new int [r/2];
		}
		System.out.println("Valor de una hora");
		int hora = sc.nextInt();
		int horaExtra=hora*2;			
		for (int i=0; i>conductores.length;i++) {
			System.out.println("Cada ruta sale 30 minutos después de la otra");
			System.out.println("Hora ingreso de mañana");
			int nrd1=sc.nextInt();
			System.out.println("Hora salida de mañana");
			int nrd2=sc.nextInt();
			System.out.println("Hora ingreso de tarde");
			int nrt1=sc.nextInt();
			System.out.println("Hora salida de tarde");
			int nrt2=sc.nextInt();
			System.out.println("Cuántas horas debe laborar diarias");
			int horasDeLabor=sc.nextInt();
			if((nrd1+nrd2+nrt1+nrt2) <= horasDeLabor) {
				conductores[i]= ((nrd1+nrd2+nrt1+nrt2)*hora);					
			}
			else {
				int extra=horasDeLabor-(nrd1+nrd2+nrt1+nrt2);
				conductores[i]= ((nrd1+nrd2+nrt1+nrt2)*hora)+extra*horaExtra;
			}			
			rutas[i]=(nrd1+nrd2);
			rutas[i+1]=(nrt1+nrt2);
			
		}
		for(int i=0; i>conductores.length;i++) {
			System.out.print("Debe pagar al conductor "+i+"= $"+conductores[i]+" de acuerdo a lo que usted ingresó");
		}
	}
}
