import java.lang.Math;

public class TrigonometricOperations{


	public final static double pi=3.1416;
	
/**
*This method converts degrees to radians.
*<b>pre:</b> number pi has been declared.<br>
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its the given number.
@return result result of the convertion in radians. 
*/
	
	public static double DegToRad(double numberOne){
		double result=0.0;

		result=(numberOne*pi)/180.0;

		return result;
	}//fin del metodo para convertir de grados a radianes


/**
*This method converts radians to degrees.
*<b>pre:</b> number pi has been declared.<br>
*<b>Post:</b> The method has calculated the convertion.<br>
@param numberOne its the given number.
@return result result of the convertion in degrees. 
*/
	public static double RadToDeg(double numberOne, double numberTwo){
		double result=0.0;

		result=((numberOne*pi)/numberTwo)*(180/pi);

		return result;//HAY UN ERRO CON ESTOS DE AQUI
	}//fin del metodo para convertir de radianes a grados

/**
*This method calculates the sine of a number.
*<b>Post:</b> The method has calculated the sine.<br>
@param numberOne its the given number in degrees or radians.
@param mode its one to degrees or two to radias. mode==1 mode==2.
@return result result of the sine. 
*/

	public static double Sine(double numberOne, int mode){
		double result=0.0;

		if(mode==1){

			result=DegToRad(numberOne);
			result=Math.sin(result);

		}
		else if(mode==2){
			
			result=Math.sin(numberOne);

		}

		return result;
	}//fin de la clase para obtener el seno

/**
*This method calculates the cosine of a number.
*<b>Post:</b> The method has calculated the cosine.<br>
@param numberOne its the given number in degrees or radians.
@param mode its one to degrees or two to radias. mode==1 mode==2.
@return result result of the cosine. 
*/

	public static double Cosine(double numberOne,int mode){
		double result=0.0;

		if(mode==1){

			result=DegToRad(numberOne);
			result=Math.cos(result);

		}
		else if(mode==2){
			
			result=Math.cos(numberOne);

		}

		return result;
	}//fin de la clase para obtener el coseno

/**
*This method calculates the tangent of a number.
*<b>Post:</b> The method has calculated the tangent.<br>
@param numberOne its the given number in degrees or radians.
@param mode its one to degrees or two to radias. mode==1 mode==2.
@return result result of the cosine. 
*/

	public static double Tangent(double numberOne, int mode){
		double result=0.0;

		if(mode==1){

			result=DegToRad(numberOne);
			result=Math.tan(result);

		}
		else if(mode==2){
			
			result=Math.tan(numberOne);

		}

		return result;
	}//fin de la clase para obtener el tangente

}//FIN DE LA CLASE