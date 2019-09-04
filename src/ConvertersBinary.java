public class ConvertersBinary{

	public static int DecimalConverter(int numberOne){
		int result=0;
		int module=0;
		int helper=numberOne;//cambiar lo de los int por long

		for(int i=(numberOne.lenght-1);i>=0;i--){

			module=result%10;
			helper=helper/10;

			result=result+DecimalProcess(module,i);


		}
		
		return result;
	}//fin del metodo de conversion a decimales


	public static int DecimalProcess(int number,int power){
		int result;

		result=Math.pow(number,power);//cambiar los int por long

		return result;
	}//fin del metodo


	public static String HexaConverter(int numberOne){
		String result="";

		numberOne=DecimalConverter(numberOne);//cambiar los int por long

		result=ConvertersDecimal.HexaConverter(numberOne);

		return result;
	}//fin del metodo para pasar de binario a hexadecimal



}//FIN DE LA CLASE