package prFactorial;

public class factorial {

	public static int calcular(int entrada){
		int salida;
		if(entrada<2){
			salida=1;
		}else {
			salida=entrada*factorial.calcular(entrada-1);
		}
		return salida;
	}
}
