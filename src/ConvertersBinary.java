import java.lang.Math;

public class ConvertersBinary{

	public static double DecimalConverter(String numberOne){//cambiar numberOne a string
		double result=0;
		double module=0;
		long helper= Long.parseLong(numberOne);//cambiar lo de los int por long

		for(int i=(numberOne.length()-1);i>=0;i--){

			module=result%10;
			helper=helper/10;

			result=result+DecimalProcess((int)module,i);
			
		}//final del bucle
		
		return result;
	}//fin del metodo de conversion a decimales


	public static double DecimalProcess(int number,int power){
		double result;

		result=Math.pow(number,power);//cambiar los int por long

		return result;
	}//fin del metodo


	public static String HexaConverter(String numberOne){
		String result="";
		double helper=0;


		helper=DecimalConverter(numberOne);//cambiar los int por long

		result=ConvertersDecimal.HexaConverter(helper);

		return result;
	}//fin del metodo para pasar de binario a hexadecimal



}//FIN DE LA CLASE