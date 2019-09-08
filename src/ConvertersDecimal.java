public class ConvertersDecimal{
	
/**
*This method calculates the convertion from decimal to binary.
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its the given number in decimal.
@return result result of the convertion. 
*/
	public static String BinaryConverter(double numberOne){
		String result="";
		double module=0;
		
		if(numberOne<2){
			result=BinaryProcess(numberOne)+result;
		}
		else{
			while(numberOne>1){
				
				module=numberOne%2;
				numberOne=Math.floor(numberOne/2);

				if(numberOne==1 || numberOne==0){
					result=BinaryProcess(module)+result;
					result=BinaryProcess(numberOne)+result;
				}
				else{
				result=BinaryProcess(module)+result;
				}//fin de los condicionales
					
			}//fin del bucle while
			
		}//fin de los condicionales
		
		return result;
	}//fin del metodo de entrega de binarios

/**
*This method does the convertion.
*<b>Post:</b> The method has done the convertion.<br>
@param number its the given number in decimal and its zero or one. number==0 || number==1.
@return result result of the convertion. 
*/
	
	public static String BinaryProcess(double number){
		String result="";

		if(number==0){
			result="0";
		}
		else{
			result="1";
		}

		return result;
	}//fin del metodo

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/**
*This method calculates the conversion from decimal to hexadecimal.
*<b>Post:</b> The method has calculated the conversion.<br>
@param numberOne its the given number in decimal.
@return result result of the conversion. 
*/
	public static String HexaConverter(double numberOne){

		String result="";
		double module=0;

		if(numberOne<16){
			result=HexaProcess((int)numberOne);
		}
		else{
			while(numberOne>15){

				module=(int)numberOne%16;
				numberOne=(Math.floor(numberOne/16));

				if(numberOne<16){
					result=HexaProcess((int)module)+result;
					result=HexaProcess((int)numberOne)+result;
				}
				else{
				result=HexaProcess((int)module)+result;
				}//fin de los condicionales

			}//fin del bucle while

		}//fin de las condiciones

		return result;
	}//fin del metodo de entreg de hexadecimal

/**
*This method does the convertion.
*<b>Post:</b> The method has done the convertion.<br>
@param number its the given number in decimal and its between zero until fifthen.
@return result result of the convertion. 
*/

	public static String HexaProcess(int number){

		String result="";

		switch(number){

			case 0: result="0";
					break;

			case 1: result="1";
					break;

			case 2: result="2";
					break;

			case 3: result="3";
					break;

			case 4: result="4";
					break;

			case 5: result="5";
					break;

			case 6: result="6";
					break;

			case 7: result="7";
					break;

			case 8: result="8";
					break;

			case 9: result="9";
					break;

			case 10: result="A";
					break;

			case 11: result="B";
					break;

			case 12: result="C";
					break;

			case 13: result="D";
					break;

			case 14: result="E";
					break;

			case 15: result="F";
					break;

		}//final del switch

		return result;
	}//fin del metodo
	
}//FIN DE LA CLASE