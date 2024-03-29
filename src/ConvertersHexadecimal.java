import java.lang.Math;

public class ConvertersHexadecimal{

/**
*This method calculates the convertion from hexadecimal to decimal.
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its a String with the given number in hexadecimal.
@return result result of the convertion. 
*/

	public static double DecimalConverter(String numberOne){
		double result=0.0;
		char helper;
		int count=0;

		for(int i=(numberOne.length()-1);i>=0;i--){

			helper=numberOne.charAt(i);
			result=result+DecimalProcess(helper,count);
			count++;
		}
		return result;
	}//fin del metodo para convertir de hexadecimal a decimal

/**
*This method does the convertion.
*<b>Post:</b> The method has done the convertion.<br>
@param number its the given number in hexadecimal between zero and F. 
@param power its the exponent.
@return result result of the convertion. 
*/

	public static double DecimalProcess(char numberHexa,int power){
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

/**
*This method calculates the convertion from hexadecimal to binary.
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its a String with the given number in hexadecimal.
@return result result of the convertion. 
*/

	public static String BinaryConverter(String numberOne){
		String result="";
		double helper=0.0;

		helper=DecimalConverter(numberOne);
		result=ConvertersDecimal.BinaryConverter(helper);

		return result;
	}//fin del metodo para convertir a binario

}//FIN DE LA CLASE