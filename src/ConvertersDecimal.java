public class ConvertersDecimal{
	
	public static String BinaryConverter(int numberOne){
		String result="";
		int module=0;
		
		if(numberOne<1){
			
		}
		else{
			while(numberOne>1){
				
				module=numberOne%2;
				numberOne=numberOne/2;

				if(numberOne<2){
					result=BinaryProcess(numberOne)+result;
				}
				else{
				result=BinaryProcess(module)+result;
				}//fin de los condicionales
					
			}//fin del bucle while
			
		}//fin de los condicionales
		
		return result;
	}//fin del metodo de entrega de binarios
	
	public static String BinaryProcess(int number){
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

	public static String HexaConverter(int numberOne){

		String result="";
		int module=0;

		if(numberOne<16){
			result=HexaProcess(numberOne);
		}
		else{
			while(numberOne>15){

				module=numberOne%16;
				numberOne=numberOne/16;

				if(numberOne<16){
					result=HexaProcess(numberOne)+result;
				}
				else{
				result=HexaProcess(module)+result;
				}//fin de los condicionales

			}//fin del bucle while

		}//fin de las condiciones

		return result;
	}//fin del metodo de entreg de hexadecimal

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