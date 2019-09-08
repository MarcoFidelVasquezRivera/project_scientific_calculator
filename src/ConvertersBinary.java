import java.lang.Math;

public class ConvertersBinary{

/**
*This method calculates the convertion from binary to decimal.
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its a String with the given number in binary.
@return result result of the convertion. 
*/
	public static double DecimalConverter(String numberOne){//cambiar numberOne a string
		double result=0;
		double module=0;
		int count=0;
		long helper= Long.parseLong(numberOne);//cambiar lo de los int por long

		for(int i=(numberOne.length()-1);i>=0;i--){

			module=helper%10;
			helper=helper/10;

			result=result+DecimalProcess((int)module,count);
			count++;

		}//final del bucle
		
		return result;
	}//fin del metodo de conversion a decimales

/**
*This method does the convertion.
*<b>Post:</b> The method has done the convertion.<br>
@param number its the given number in binary. number==0 || number==1.
@param power its the exponent.
@return result result of the convertion. 
*/
	public static double DecimalProcess(int number,int power){
		double result;

		result=Math.pow(2,power);//cambiar los int por long
		result=result*number;

		return result;
	}//fin del metodo

/**
*This method calculates the convertion from binary to hexadecimal.
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its a String with the given number in binary.
@return result result of the convertion. 
*/
	public static String HexaConverter(String numberOne){
		String result="";
		double helper=0;


		helper=DecimalConverter(numberOne);//cambiar los int por long

		result=ConvertersDecimal.HexaConverter(helper);

		return result;
	}//fin del metodo para pasar de binario a hexadecimal



}//FIN DE LA CLASE