import java.lang.Math;

public class ComplexOperations{
	
	public static double result=0; 
	
	public static double SquareRoot(double numberOne){
		
		double helper=0;
		helper=numberOne/10;
		int cont=0;
		
		while(result*result!=numberOne && (cont<100)){

			result=(helper/2)+(numberOne/(2*helper));
			helper=result;
			cont++;
		}
		return result;//funciona
	}//fin del metodo de raiz cuadrada
	
	public static double NthRoot(double numberOne, double numberTwo){
		
		result=	Math.pow(numberOne,1.0/numberTwo);
		return result;//funciona
	}//fin del metodo de raiz enesima,aun en desarrollo
	
	public static double Potentiation(double numberOne, double numberTwo){
		result=numberOne;
		
		for(int i=1;i<numberTwo;i++){
			result*=numberOne;
		}
		
		return result;//funciona
	}//fin del metodo poteciacion
	
	public static double Factorial(double numberOne){
		result=1;
		for(int i=1;i<=numberOne;i++){
			result=result*i;//poner un if dentro del for
			
		}
		return result;//funciona
	}//fin del metodo factorial
	
	public static double Logarithm10(double numberOne){
		
		result=java.lang.Math.log10(numberOne);
		
		return result;//funciona
	}//fin del metodo del logaritmo base 10
	
	public static String Baseten(double numberOne){
		 int i=0;
		 String solution="";
		 String helper="";

		if(numberOne<1){

			for(i=0;numberOne<1;i++){

				numberOne=numberOne*10;


			}//fin del bucle

			i=0-i; 
		}
		else if(numberOne>=10){

			for(i=0;numberOne>=10;i++){

				numberOne=numberOne/10;

			}


		}
		solution=String.valueOf(numberOne);
		helper=String.valueOf(i);
		solution=solution+"E"+helper;
		return solution;
	}//fin metodo de base 10
	
	public static double LogarithmE(double numberOne){

		result=Math.log(numberOne);

		return result;//funciona
	}//fin del metodo

	
}// FIN DE LA CLASE