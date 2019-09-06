import java.util.Scanner;

public class Calculator{

	public final static double pi=3.1416;

	public static void main(String[]args){
		Scanner reader= new Scanner(System.in);
		Scanner lecture= new Scanner(System.in);

		int continueOperation=0;
		int mode=0;
		String operation="";
		String numberOne="";
		String numberTwo="";
		double number1=0.0;
		double number2=0.0;
		int[] array=new array[10];

		System.out.println("bienvenido, ingrese el modo que desea usar");
		System.out.println("ingrese 1 para flujo de operaciones y 2 para una operacion a la vez");

		mode=reader.nextInt();

		while(mode!=1 && mode!=2){

			System.out.println("para escoger un modo solo puede ingresa runo o dos");
			mode=resder.nextInt();		
		}


		System.out.println("ingrese la operacion que desea realizar")
		System.out.println(Operations());
		operation= lecture.nextS();

		while(continueOperation==0){
			if(mode==1){

			}
			else if(mode==2){

				
			}



		}




		
	}//fin del metodo

	public static void Operations(){
		System.out.println("escriba <+> para realizar la suma ");
		System.out.println("escriba <-> para realizar la resta ");
		System.out.println("escriba <*> para realizar la multiplicacion ");
		System.out.println("escriba </> para realizar la division ");
		System.out.println("escriba <%> para realizar el modulo ");
		System.out.println("escriba <RAIZ> para realizar la raiz cuadrada ");
		System.out.println("escriba <RAIZN> para realizar la raiz enesima ");
		System.out.println("escriba <POTENCIACION> para realizar la potenciacion ");
		System.out.println("escriba <FACTORIAL> para realizar el factorial ");
		System.out.println("escriba <CONVERSION> para realizar la para realizar algun tipo de conversion ");
		System.out.println("escriba <SEN> para realizar el seno ");
		System.out.println("escriba <COS> para realizar el coseno ");
		System.out.println("escriba <TAN> para realizar la tangente ");
		System.out.println("escriba <LOG> para realizar el logaritmo base 10 ");
		System.out.println("escriba <LOGN> para realizar el logaritmo natural ");
		System.out.println("escriba <NOT> para realizar la notacion cientifica ");
		System.out,println("escriba <OPERACION> cuando desee ver nuevamente las operaciones que puede usar")

	}//fin del metodo

}//FIN DE LA CLASE