
public class Verificador {

	private char[] alfabeto = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p',
								'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	

	public boolean validar(String palabra) {
		boolean flag = true;
		String palb = palabra.toLowerCase();
		String pal = palb.replace(" ", "");
		char[] arreglo = pal.toCharArray();
		if (pal.length() >= 27) {
			for (int i = 0; i < arreglo.length; i++) {
				for (int j = 0; j < alfabeto.length; j++) {
					if (arreglo[i] == alfabeto[j]) {
						alfabeto[j] = '*';
					}
				}
			}
		}
		for (int i = 0; i < alfabeto.length; i++) {
			if(alfabeto[i] != '*'){
				flag = false;
			}
		}
		return flag;
	}

}
