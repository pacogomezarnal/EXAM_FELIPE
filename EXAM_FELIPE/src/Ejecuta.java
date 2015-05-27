import modelo.ConexionDB;
import vistas.Ventana1;
public class Ejecuta {
	
	public static void main(String[] args) {
		
		ConexionDB conexion = new ConexionDB("localhost","thelaby","root","");
		if(conexion.connectDB()==true){
			System.out.println("Conectado con exito");
				
		}
		else {
			
			System.out.println("No se ha conectado");
		}
		
		Ventana1 ventana = new Ventana1();
		ventana.setVisible(true);
	}
}