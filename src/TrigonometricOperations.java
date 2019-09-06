import java.lang.Math;

public class TrigonometricOperations{

	public final static double pi=3.1416;
	public static double result=0;

	public static double DegToRad(double numberOne){

		result=(numberOne*pi)/180.0;

		return result;
	}//fin del metodo para convertir de grados a radianes

	public static double RadToDeg(double numberOne, double numberTwo){

		result=((numberOne*pi)/numberTwo)*(180/pi);

		return result;
	}//fin del metodo para convertir de radianes a grados

	public static double Sine(double numberOne){

		result=Math.sin(numberOne);

		return result;
	}//fin de la clase para obtener el seno

	public static double Cosine(double numberOne){

		result=Math.cos(numberOne);

		return result;
	}//fin de la clase para obtener el coseno

	public static double Tangent(double numberOne){

		result=Math.tan(numberOne);

		return result;
	}//fin de la clase para obtener el tangente

}//FIN DE LA CLASE