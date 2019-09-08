import java.lang.Math;

public class TrigonometricOperations{


	public final static double pi=3.1416;
	
	
	public static double DegToRad(double numberOne){
		double result=0.0;

		result=(numberOne*pi)/180.0;

		return result;
	}//fin del metodo para convertir de grados a radianes

	public static double RadToDeg(double numberOne, double numberTwo){
		double result=0.0;

		result=((numberOne*pi)/numberTwo)*(180/pi);

		return result;//HAY UN ERRO CON ESTOS DE AQUI
	}//fin del metodo para convertir de radianes a grados

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