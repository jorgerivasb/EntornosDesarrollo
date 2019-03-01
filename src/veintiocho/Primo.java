package veintiocho;

public class Primo {
			
		private static boolean esPrimo[];
		private static int primos[];
		
		public int [] generarPrimos (int max) {
			
			if (max < 2) {
				return new int[0];
			}else {
				inicializarCandidatos(max);
				EliminarMultiplos();
				obtenerCandidatosNoEliminados();
			}
			return primos;
		}
		
		private void inicializarCandidatos (int max) {
			int i;
			
			esPrimo=new boolean[max+1];
			esPrimo[0]= esPrimo[1]= false;
			
			for (i=2; i<esPrimo.length; i++) {
				esPrimo[i]=true;
			}
			
		}
		private int maxFactor() {
			return (int) Math.sqrt(esPrimo.length)+1;
		}
					
		private void EliminarMultiplos() {
			int i;
			
			for (i=2; i<maxFactor(); i++) {
				if (esPrimo[i]) {
					eliminarMultiplosDe(i);
				}
			}
		}
		
		private void eliminarMultiplosDe(int i) {
			int multiplo;
			
			for(multiplo=2*i; multiplo<esPrimo.length; multiplo+=i) {
				esPrimo[multiplo]=false;
			}
		}
		
		private void obtenerCandidatosNoEliminados() {
			int i;
			int j;
			int cuenta = 0;
			
			for (i = 0; i < esPrimo.length; i++) {
				if (esPrimo[i])
					cuenta++;}
			
			primos = new int[cuenta];
			
			for (i = 0, j = 0; i < esPrimo.length; i++) {
				if (esPrimo[i])
					primos[j++] = i;
			}
			
		}
}
