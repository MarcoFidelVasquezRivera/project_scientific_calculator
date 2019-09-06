import java.lang.Math;

public class ComplexOperations{
	
	public static double result=0; 
	
	public static double SquareRoot(double numberOne){
		
		double helper=0;
		helper=numberOne/10;
		
		while(result*result!=numberOne){

			result=(helper/2)+(numberOne/(2*helper));
			helper=result;
			
		}
		return result;
	}//fin del metodo de raiz cuadrada
	
	public static double NthRoot(double numberOne, double numberTwo){
		
		result=	Math.pow(numberOne,1.0/numberTwo);
		return result;
	}//fin del metodo de raiz enesima,aun en desarrollo
	
	public static double Potentiation(double numberOne, double numberTwo){
		result=numberOne;
		
		for(int i=1;i<numberTwo;i++){
			result*=numberOne;
		}
		
		return result;
	}//fin del metodo poteciacion
	
	public static double Factorial(double numberOne){
		result=1;
		for(int i=1;i<=numberOne;i++){
			result=result*i;//poner un if dentro del for
			
		}
		return result;
	}//fin del metodo factorial
	
	public static double Logarithm10(double numberOne){
		
		result=java.lang.Math.log10(numberOne);
		
		return result;
	}//fin del metodo del logaritmo base 10
	
	public static double baseten(double numberOne){
		
		//result= 0.0;//incompleto
		
		return result;
	}//fin metodo de base 10
	
	public static double logarithmE(double numberOne){

		result=Math.log(numberOne);

		return result;
	}//fin del metodo

	
}// FIN DE LA CLASE