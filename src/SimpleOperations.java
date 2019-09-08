public class SimpleOperations{
	
	public static double result=0;
	
/**
*This method adds two numbers.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the addition.<br>
@param numberOne first number to add. 
@param numberTwo second number to add.
@return result result of the addition. 
*/
	public static double Sumation(double numberOne, double numberTwo){
		
		result=numberOne+numberTwo;//se realiza la suma
		
		return result;	//funciona	
	} //fin del metodo de suma
	
/**
*This method substracts two numbers.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the substraction.<br>
@param numberOne first number to substract. 
@param numberTwo second number to substract.
@return result result of the substraction. 
*/
	public static double Subtraction(double numberOne, double numberTwo){
		
		result=numberOne-numberTwo;//se realiza la resta
	
		return result;//funciona
	} //fin del metodo de resta
	
/**
*This method multiplies two numbers.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the multiplication.<br>
@param numberOne first number to multiply. 
@param numberTwo second number to multiply.
@return result result of the multiplication. 
*/
	public static double Multiplication(double numberOne, double numberTwo){
		
		result=numberOne*numberTwo;//se realiza la multiplicacion
		
		return result;//funciona
	} //fin del metodo de multiplicacion

/**
*This method divides two numbers.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the division.<br>
@param numberOne its the numerator. 
@param numberTwo its the denominator.
@return result result of the division. 
*/

	public static double Division(double numberOne, double numberTwo){

		result=numberOne/numberTwo;//se realiza la division
		
		return result;//funciona
	} //fin del metodo de division

/**
*This method calculates the remainder of a division.
*<b>pre:</b> result has been declared.<br>
*<b>Post:</b> The method has calculated the remainder.<br>
@param numberOne its the numerator. 
@param numberTwo its the denominator.
@return result result of the remainder. 
*/
	
	public static double Module(double numberOne, double numberTwo){
		
		result=numberOne%numberTwo;//se obttiene el modulo
		
		return result;//funciona
	} //fin del metodo de modulo

}//FIN DE LA CLASE