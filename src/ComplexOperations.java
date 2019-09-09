import java.lang.Math;

public class ComplexOperations{
	
	public static double result=0; 
	
/**
*This method calculates the squared root of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the squared root.<br>
@param numberOne its the given number. numberOne>0.
@return result result of the squared root. 
*/
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

/**
*This method calculates the nth-root.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the nth-root.<br>
@param numberOne its the index. 
@param numberTwo its the root.
@return result result of the nth-root. 
*/
	
	public static double NthRoot(double numberOne, double numberTwo){
		if((numberTwo%2)==(0) && numberOne<0){
			result=0;
			System.out.println("no se puede sacar una raiz par de un numero negativo");
			result=0;
		}
		else{
			result=	Math.pow(numberOne,1.0/numberTwo);
			
		}
		return result;//funciona
	}//fin del metodo de raiz enesima,aun en desarrollo

/**
*This method calculates the nth-power of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the power.<br>
@param numberOne its the number. 
@param numberTwo its the power.
@return result result of the nth-power. 
*/
	
	public static double Potentiation(double numberOne, double numberTwo){
		result=numberOne;
		
		for(int i=1;i<numberTwo;i++){
			result*=numberOne;
		}
		
		return result;//funciona
	}//fin del metodo poteciacion
	
/**
*This method calculates the factorial of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the factorial.<br>
@param numberOne its the given number. numberOne>0.
@return result result of the factorial. 
*/
	public static double Factorial(double numberOne){
		result=1;
		for(int i=1;i<=numberOne;i++){
			result=result*i;//poner un if dentro del for
			
		}
		return result;//funciona
	}//fin del metodo factorial
	
/**
*This method calculates the logarithm10 of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the logarithm10.<br>
@param numberOne its the given number. numberOne>0.
@return result result of the logarith10. 
*/
	public static double Logarithm10(double numberOne){
		
		result=java.lang.Math.log10(numberOne);
		
		return result;//funciona
	}//fin del metodo del logaritmo base 10

/**
*This method calculates the scientific notation of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the scientific notation.<br>
@param numberOne its the given number. numberOne>0.
@return result result of the scientific notation. 
*/
	
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
	

/**
*This method calculates the natural-logarithm of a number.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the natural-logarithm.<br>
@param numberOne its the given number. numberOne>0.
@return result result of the natural-logarith. 
*/
	public static double LogarithmE(double numberOne){

		result=Math.log(numberOne);

		return result;//funciona
	}//fin del metodo

	
}// FIN DE LA CLASE