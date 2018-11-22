package ud05;

public class usarArgumentosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		
		int suma;
		
		if(args.length>0) {
			suma=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]); //estamos convirtiendo a int los 5 parámetros String
			System.out.print("el resultado de la suma es: "+suma);
		}else {
			System.out.print("error: no temenos argumentos con los que operar");
		}
		

	}

}
