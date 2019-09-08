import java.util.Scanner;

public class Calculator{

	public final static double pi=3.1416;

	public static void main(String[]args){
		Scanner reader= new Scanner(System.in);
		Scanner lecture= new Scanner(System.in);

		int continueOperation=0;
		int mode=0;
		int degOrGrad=0;
		String operation="";
		String numberOne="";
		String numberTwo="";
		String result="";
		String convertionsTipe="";

		int[] array= new int[10];

		System.out.println("bienvenido, ingrese el modo que desea usar");
		System.out.println("ingrese 1 para flujo de operaciones y 2 para una operacion a la vez");

		mode=reader.nextInt();

		while(mode!=1 && mode!=2){

			System.out.println("para escoger un modo solo puede ingresa uno o dos");
			mode=reader.nextInt();		
		}


		System.out.println("ingrese la operacion que desea realizar");
		Message();
		operation=lecture.next();

		System.out.println(operation);
/*
		while((operation!="+") && (operation!="-") && (operation!="*") && (operation!="/") && (operation!="%") && (operation!="RAIZ") && (operation!="RAIZN") && (operation!="POTENCIACION") && (operation!="FACTORIAL") && (operation!="CONVERSION") && (operation!="SEN") && (operation!="COS") && (operation!="TAN") && (operation!="LOG") && (operation!="LOGN") && (operation!="NOTACIONC") && (operation!="OPERACION")){
			
			System.out.println("la operacion que realizo no concuerda con ninguna de las disponibles en esta calculadora");
			System.out.println("ingrese la operacion que desea realizar");
			operation=lecture.next();	
			System.out.println(operation);		

		}// fin del bucle para revisar que la operacion que se ingrese sea compatible
*/
		while(continueOperation==0){
			if(mode==1){

				switch(operation){

					case "+": 	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								numberOne=Conditional(numberOne);
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Sumation(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la suma es: "+result);
								break;


					case "-": 	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								result=String.valueOf(SimpleOperations.Subtraction(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la resta es: "+result);
								break;


					case "*":	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								result=String.valueOf(SimpleOperations.Multiplication(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la multiplicacion es: "+result);
								break;


					case "/":	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								result=String.valueOf(SimpleOperations.Division(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la division es: "+result);
								break;


					case "%": 	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								result=String.valueOf(SimpleOperations.Module(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la modulo es: "+result);
								break;


					case "RAIZ": 	System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									result=String.valueOf(ComplexOperations.SquareRoot(Double.parseDouble(numberOne)));
									System.out.println("el resultado de la raiz es: "+result);
									break;


					case "RAIZN": 	System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									System.out.println("ingrese el segundo numero");
									numberTwo=lecture.next();
									result=String.valueOf(ComplexOperations.NthRoot(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
									System.out.println("el resultado de la raiz enesima es: "+result);
									break;


					case "POTENCIACION": 	System.out.println("ingrese el primer numero");
											numberOne=lecture.next();
											System.out.println("ingrese el segundo numero");
											numberTwo=lecture.next();
											result=String.valueOf(ComplexOperations.Potentiation(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
											System.out.println("el resultado de la potenciacion es: "+result);
											break;


					case "FACTORIAL": 	System.out.println("ingrese el primer numero");
										numberOne=lecture.next();
										result=String.valueOf(ComplexOperations.Factorial(Double.parseDouble(numberOne)));
										System.out.println("el resultado del factorial es: "+result);
										break;

					case "CONVERSION": 	MenuConvertions();
										convertionsTipe=lecture.next();
										System.out.println(convertionsTipe);
										switch(convertionsTipe){

											case "RAD":		System.out.println("ingrese el numero");
															numberOne=lecture.next();
															result=String.valueOf(TrigonometricOperations.DegToRad(Double.parseDouble(numberOne)));
															break;

											case "DEG":		System.out.println("no necesita poner Pi, la calculadora lo hara automaticamente");
															System.out.println("ingrese el numerador");
															numberOne=lecture.next();
															System.out.println("ingrese el denominador");
															numberTwo=lecture.next();
															result=String.valueOf(TrigonometricOperations.RadToDeg(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
															break;

											case "DECTOBIN":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=String.valueOf(ConvertersDecimal.BinaryConverter(Double.parseDouble(numberOne)));
																break;

											case "DECTOHEX":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=String.valueOf(ConvertersDecimal.HexaConverter(Double.parseDouble(numberOne)));
																break;

											case "BINTODEC":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=String.valueOf(ConvertersBinary.DecimalConverter(numberOne));
																break;

											case "BINTOHEX":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=ConvertersBinary.HexaConverter(numberOne);
																break;

											case "HEXTODEC":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=String.valueOf(ConvertersHexadecimal.DecimalConverter(numberOne));
																break;


											case "HEXTOBIN":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																result=ConvertersHexadecimal.BinaryConverter(numberOne);
																break;

										}

										System.out.println("el resultado de la conversion es: "+result);
										break;


					case "SEN": 	System.out.println("ingrese uno si va a introducir grados");
									System.out.println("ingrese dos si va a introducir radianes");
									degOrGrad= reader.nextInt();
									while((degOrGrad!=1) &&(degOrGrad!=2)){
										System.out.println("solo puede ingresar uno o dos para la seleccion");
										degOrGrad= reader.nextInt();
									}
									System.out.println("ingrese el numero");
									numberOne=lecture.next();
									result=String.valueOf(TrigonometricOperations.Sine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del seno es: "+result);
									break;

					case "COS": 	System.out.println("ingrese uno si va a introducir grados");
									System.out.println("ingrese dos si va a introducir radianes");
									degOrGrad= reader.nextInt();
									while((degOrGrad!=1) &&(degOrGrad!=2)){
										System.out.println("solo puede ingresar uno o dos para la seleccion");
										degOrGrad= reader.nextInt();
									}
									System.out.println("ingrese el numero");
									numberOne=lecture.next();
									result=String.valueOf(TrigonometricOperations.Cosine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del coseno es es: "+result);
									break;


					case "TAN": 	System.out.println("ingrese uno si va a introducir grados");
									System.out.println("ingrese dos si va a introducir radianes");
									degOrGrad= reader.nextInt();
									while((degOrGrad!=1) &&(degOrGrad!=2)){
										System.out.println("solo puede ingresar uno o dos para la seleccion");
										degOrGrad= reader.nextInt();
									}
									System.out.println("ingrese el numero");
									numberOne=lecture.next();
									result=String.valueOf(TrigonometricOperations.Tangent(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado de la tangente es es: "+result);
									break;


					case "LOG":		System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									result=String.valueOf(ComplexOperations.Logarithm10(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base 10 es: "+result);
									break;


					case "LOGN": 	System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									result=String.valueOf(ComplexOperations.LogarithmE(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base natural es: "+result);
									break;


					case "NOTACIONC": 	System.out.println("ingrese el primer numero");
										numberOne=lecture.next();
										while(Double.parseDouble(numberOne)<=0){
											System.out.println("la operacion no se puede realizar con numeros negativos");
											System.out.println("vuelva a ingresar un numero");
											numberOne=lecture.next();
										}
										result=ComplexOperations.Baseten(Double.parseDouble(numberOne));
										System.out.println("el resultado del logaritmo base natural es: "+result);
										break;


					case "OPERACION":	Message();


				}//fin del switch




			}//fin del modo uno
			else if(mode==2){

				





			}//fin del modo dos 

		}//fin del bucle, cuando se termine el bucle la calculadora tambien debera terminar




		
	}//fin del metodo

	public static void Message(){
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
		System.out.println("escriba <NOTACIONC> para realizar la notacion cientifica ");
		System.out.println("escriba <OPERACION> cuando desee ver nuevamente las operaciones que puede usar");
		System.out.println("si desea usar pi en una operacion escriba <P>");

	}//fin del metodo

	public static void MenuConvertions(){

		System.out.println("ingrese la conversion que desea realizar");
		System.out.println("ingrese <RAD> si desea convertir de grados a radianes");
		System.out.println("ingrese <DEG> si desea convertir de radianes a grados");
		System.out.println("ingrese <DECTOBIN> si desea convertir de grados a radianes");
		System.out.println("ingrese <DECTOHEX> si desea convertir de grados a radianes");
		System.out.println("ingrese <BINTODEC> si desea convertir de grados a radianes");
		System.out.println("ingrese <BINTOHEX> si desea convertir de grados a radianes");
		System.out.println("ingrese <HEXTODEC> si desea convertir de grados a radianes");
		System.out.println("ingrese <HEXTOBIN> si desea convertir de grados a radianes");

	}//fin del metodo

	public static String Conditional(String number){
		String result="";

		if(number!="P"){
			result=number;
		}
		else{
			result="3.1416";
		}
		return result;
	}

}//FIN DE LA CLASE