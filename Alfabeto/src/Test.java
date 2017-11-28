import java.util.Scanner;

public class Test {
	
	public static void main(String ... args) {
		Scanner t = new Scanner(System.in);
		System.out.println("ingresar oracion: ");
		String oracion = t.nextLine();
		
		Verificador v = new Verificador();
		boolean flag = v.validar(oracion);
		System.out.println(flag);
		if(flag == true){
			System.out.println("La oracion contiene todas las letras del alfabeto");
		}else{
			System.out.println("La oracion NO contiene todas las letras del alfabeto");
		}
	}	
}
