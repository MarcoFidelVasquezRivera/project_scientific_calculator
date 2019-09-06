import java.lang.Math;

public class ConvertersHexadecimal{

	public static double DecimalConverter(String numberOne){
		double result=0.0;
		char helper;

		for(int i=(numberOne.length()-1);i>=0;i--){

			helper=numberOne.charAt(i);
			result=result+DecimalProcess(helper,i);

		}
		return result;
	}//fin del metodo para convertir de hexadecimal a decimal


	public static int DecimalProcess(char numberHexa,int power){
		double result=0.0;

		switch(numberHexa){

			case '0': result=0*(Math.pow(16,power));
					break;

			case '1': result=1*(Math.pow(16,power));
					break;

			case '2': result=2*(Math.pow(16,power));
					break;

			case '3': result=3*(Math.pow(16,power));
					break;

			case '4': result=4*(Math.pow(16,power));
					break;

			case '5': result=5*(Math.pow(16,power));
					break;

			case '6': result=6*(Math.pow(16,power));
					break;

			case '7': result=7*(Math.pow(16,power));
					break;

			case '8': result=8*(Math.pow(16,power));
					break;

			case '9': result=9*(Math.pow(16,power));
					break;

			case 'A': result=10*(Math.pow(16,power));
					break;

			case 'B': result=11*(Math.pow(16,power));
					break;

			case 'C': result=12*(Math.pow(16,power));
					break;

			case 'D': result=13*(Math.pow(16,power));
					break;

			case 'E': result=14*(Math.pow(16,power));
					break;

			case 'F': result=15*(Math.pow(16,power));
					break;

		}//fin del switch
		return result;
	}//fin del metodo


	public static long BinaryConverter(String numberOne){
		double result=0.0;
		double helper=0.0;

		helper=Double.parseDouble(DecimalConverter(numberOne));
		result=ConvertersDecimal.BinaryConverter(helper);

		return result;
	}//fin del metodo para convertir a binario

}//FIN DE LA CLASE