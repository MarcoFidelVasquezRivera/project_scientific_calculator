import java.util.Scanner;

public class Calculator{

	public final static double pi=3.1416;
	public static String[] array= new String[10];

	public static void main(String[]args){
		Scanner reader= new Scanner(System.in);
		Scanner lecture= new Scanner(System.in);

		int continueOperation=0;
		int mode=0;
		int degOrGrad=0;
		int modeTwo=0;
		String operation="";
		String numberOne="";
		String numberTwo="";
		String result="";
		String convertionsTipe="";

		System.out.println("bienvenido, ingrese el modo que desea usar");
		System.out.println("ingrese 1 para una operacion a la vez y 2 para flujo de operaciones ");

		mode=reader.nextInt();

		while(mode!=1 && mode!=2){

			System.out.println("para escoger un modo solo puede ingresa uno o dos");
			mode=reader.nextInt();		
		}


		Message();
		

		while(continueOperation==0){
			System.out.println("ingrese la operacion que desea realizar");
			operation=lecture.next();


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
								SaveNumbers(result);
								break;


					case "-": 	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								numberOne=Conditional(numberOne);
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Subtraction(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la resta es: "+result);
								SaveNumbers(result);
								break;


					case "*":	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								numberOne=Conditional(numberOne);
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Multiplication(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la multiplicacion es: "+result);
								SaveNumbers(result);
								break;


					case "/":	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								numberOne=Conditional(numberOne);
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Division(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la division es: "+result);
								SaveNumbers(result);
								break;


					case "%": 	System.out.println("ingrese el primer numero");
								numberOne=lecture.next();
								numberOne=Conditional(numberOne);
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Module(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la modulo es: "+result);
								SaveNumbers(result);
								break;


					case "RAIZ": 	System.out.println("ingrese el numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
									result=String.valueOf(ComplexOperations.SquareRoot(Double.parseDouble(numberOne)));
									System.out.println("el resultado de la raiz es: "+result);
									SaveNumbers(result);
									break;


					case "RAIZN": 	System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
									System.out.println("ingrese el segundo numero");
									numberTwo=lecture.next();
									numberTwo=Conditional(numberTwo);
									result=String.valueOf(ComplexOperations.NthRoot(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
									System.out.println("el resultado de la raiz enesima es: "+result);
									SaveNumbers(result);
									break;


					case "POTENCIACION": 	System.out.println("ingrese el primer numero");
											numberOne=lecture.next();
											numberOne=Conditional(numberOne);
											System.out.println("ingrese el segundo numero");
											numberTwo=lecture.next();
											numberTwo=Conditional(numberTwo);
											result=String.valueOf(ComplexOperations.Potentiation(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
											System.out.println("el resultado de la potenciacion es: "+result);
											SaveNumbers(result);
											break;


					case "FACTORIAL": 	System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
										result=String.valueOf(ComplexOperations.Factorial(Double.parseDouble(numberOne)));
										System.out.println("el resultado del factorial es: "+result);
										SaveNumbers(result);
										break;

					case "CONVERSION": 	MenuConvertions();
										convertionsTipe=lecture.next();
										System.out.println(convertionsTipe);
										switch(convertionsTipe){

											case "RAD":		System.out.println("ingrese el numero");
															numberOne=lecture.next();
															numberOne=Conditional(numberOne);
															result=String.valueOf(TrigonometricOperations.DegToRad(Double.parseDouble(numberOne)));
															SaveNumbers(result);
															break;

											case "DEG":		System.out.println("no necesita poner Pi, la calculadora lo hara automaticamente");
															System.out.println("ingrese el numerador");
															numberOne=lecture.next();
															numberOne=Conditional(numberOne);
															System.out.println("ingrese el denominador");
															numberTwo=lecture.next();
															numberTwo=Conditional(numberTwo);
															result=String.valueOf(TrigonometricOperations.RadToDeg(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
															SaveNumbers(result);
															break;

											case "DECTOBIN":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=String.valueOf(ConvertersDecimal.BinaryConverter(Double.parseDouble(numberOne)));
																break;

											case "DECTOHEX":	System.out.println("ingrese el numero");
																numberOne=lecture.next();	
																numberOne=Conditional(numberOne);
																result=String.valueOf(ConvertersDecimal.HexaConverter(Double.parseDouble(numberOne)));
																break;

											case "BINTODEC":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=String.valueOf(ConvertersBinary.DecimalConverter(numberOne));
																SaveNumbers(result);
																break;

											case "BINTOHEX":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=ConvertersBinary.HexaConverter(numberOne);
																break;

											case "HEXTODEC":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=String.valueOf(ConvertersHexadecimal.DecimalConverter(numberOne));
																SaveNumbers(result);
																break;


											case "HEXTOBIN":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
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
									numberOne=Conditional(numberOne);
									result=String.valueOf(TrigonometricOperations.Sine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del seno es: "+result);
									SaveNumbers(result);
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
									numberOne=Conditional(numberOne);
									result=String.valueOf(TrigonometricOperations.Cosine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del coseno es es: "+result);
									SaveNumbers(result);
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
									numberOne=Conditional(numberOne);
									result=String.valueOf(TrigonometricOperations.Tangent(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado de la tangente es es: "+result);
									SaveNumbers(result);
									break;


					case "LOG":		System.out.println("ingrese el numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
									result=String.valueOf(ComplexOperations.Logarithm10(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base 10 es: "+result);
									SaveNumbers(result);
									break;


					case "LOGN": 	System.out.println("ingrese el numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
									result=String.valueOf(ComplexOperations.LogarithmE(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base natural es: "+result);
									SaveNumbers(result);
									break;


					case "NOTACIONC": 	System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
										while(Double.parseDouble(numberOne)<=0){
											System.out.println("la operacion no se puede realizar con numeros negativos");
											System.out.println("vuelva a ingresar un numero");
											numberOne=lecture.next();
										}
										result=ComplexOperations.Baseten(Double.parseDouble(numberOne));
										System.out.println("el resultado del logaritmo base natural es: "+result);
										break;


					case "OPERACION":	Message();


					case "MEMORIA": for(int count=0;count<10;count++){

										System.out.println("el dato "+(count+1)+" es: "+array[count]);

									}


					default: System.out.println("la opercion que usted ingreso no se encuentra entre nuestras opciones");


				}//fin del switch

				System.out.println("ingrese 0 si desea seguir usando la calculadora, de lo contrario ingrese cualquier otro numero");
				continueOperation=reader.nextInt();
				if(continueOperation!=0){
					break;
				}

				System.out.println("ingrese 1 si desea continuar en este modo, ingrese 2 si desea cambiar al modo de operaciones continuas");
				mode=reader.nextInt();

				while(mode!=1 && mode!=2){

					System.out.println("para escoger un modo solo puede ingresa uno o dos");
					mode=reader.nextInt();	

				}//fin del while


			}//fin del modo uno
			else if(mode==2){
				switch(operation){

					case "+": 	if(modeTwo!=0){

									numberOne=array[0];

								}
								else{
									System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
								}
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Sumation(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la suma es: "+result);
								SaveNumbers(result);
								break;


					case "-": 	if(modeTwo!=0){

									numberOne=array[0];

								}
								else{
									System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
								}
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Subtraction(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la resta es: "+result);
								SaveNumbers(result);
								break;


					case "*":	if(modeTwo!=0){

									numberOne=array[0];

								}
								else{
									System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
								}
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Multiplication(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la multiplicacion es: "+result);
								SaveNumbers(result);
								break;


					case "/":	if(modeTwo!=0){

									numberOne=array[0];

								}
								else{
									System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
								}
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Division(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la division es: "+result);
								SaveNumbers(result);
								break;


					case "%": 	if(modeTwo!=0){

									numberOne=array[0];

								}
								else{
									System.out.println("ingrese el primer numero");
									numberOne=lecture.next();
									numberOne=Conditional(numberOne);
								}
								System.out.println("ingrese el segundo numero");
								numberTwo=lecture.next();
								numberTwo=Conditional(numberTwo);
								result=String.valueOf(SimpleOperations.Module(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
								System.out.println("el resultado de la modulo es: "+result);
								SaveNumbers(result);
								break;


					case "RAIZ": 	if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}
									result=String.valueOf(ComplexOperations.SquareRoot(Double.parseDouble(numberOne)));
									System.out.println("el resultado de la raiz es: "+result);
									SaveNumbers(result);
									break;


					case "RAIZN": 	if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
										System.out.println("ingrese el primer numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}
									System.out.println("ingrese el segundo numero");
									numberTwo=lecture.next();
									numberTwo=Conditional(numberTwo);
									result=String.valueOf(ComplexOperations.NthRoot(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
									System.out.println("el resultado de la raiz enesima es: "+result);
									SaveNumbers(result);
									break;


					case "POTENCIACION": 	if(modeTwo!=0){

												numberOne=array[0];

											}
											else{
												System.out.println("ingrese el primer numero");
												numberOne=lecture.next();
												numberOne=Conditional(numberOne);
											}
											System.out.println("ingrese el segundo numero");
											numberTwo=lecture.next();
											numberTwo=Conditional(numberTwo);
											result=String.valueOf(ComplexOperations.Potentiation(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
											System.out.println("el resultado de la potenciacion es: "+result);
											SaveNumbers(result);
											break;


					case "FACTORIAL": 	if(modeTwo!=0){

											numberOne=array[0];

										}
										else{
											System.out.println("ingrese el numero");
											numberOne=lecture.next();
											numberOne=Conditional(numberOne);
										}
										result=String.valueOf(ComplexOperations.Factorial(Double.parseDouble(numberOne)));
										System.out.println("el resultado del factorial es: "+result);
										SaveNumbers(result);
										break;

					case "CONVERSION": 	MenuConvertions();
										convertionsTipe=lecture.next();
										System.out.println(convertionsTipe);
										switch(convertionsTipe){

											case "RAD":		if(modeTwo!=0){

																numberOne=array[0];

															}
															else{
																System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);
															}
															result=String.valueOf(TrigonometricOperations.DegToRad(Double.parseDouble(numberOne)));
															SaveNumbers(result);
															break;

											case "DEG":		if(modeTwo!=0){

																numberOne=array[0];

															}
															else{
																System.out.println("no necesita poner Pi, la calculadora lo hara automaticamente");
																System.out.println("ingrese el numerador");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);
															}
															System.out.println("ingrese el denominador");
															numberTwo=lecture.next();
															numberTwo=Conditional(numberTwo);
															numberTwo=Conditional(numberTwo);
															result=String.valueOf(TrigonometricOperations.RadToDeg(Double.parseDouble(numberOne),Double.parseDouble(numberTwo)));
															SaveNumbers(result);
															break;

											case "DECTOBIN":	if(modeTwo!=0){

																	numberOne=array[0];

																}
																else{
																
																	System.out.println("ingrese el numero");
																	numberOne=lecture.next();
																	numberOne=Conditional(numberOne);
																}	
																result=String.valueOf(ConvertersDecimal.BinaryConverter(Double.parseDouble(numberOne)));
																break;

											case "DECTOHEX":	if(modeTwo!=0){

																	numberOne=array[0];

																}
																else{
																
																	System.out.println("ingrese el numero");
																	numberOne=lecture.next();
																	numberOne=Conditional(numberOne);
																}	
																result=String.valueOf(ConvertersDecimal.HexaConverter(Double.parseDouble(numberOne)));
																break;

											case "BINTODEC":	
																System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);
																	
																result=String.valueOf(ConvertersBinary.DecimalConverter(numberOne));
																SaveNumbers(result);
																break;

											case "BINTOHEX":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=ConvertersBinary.HexaConverter(numberOne);
																break;

											case "HEXTODEC":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
																result=String.valueOf(ConvertersHexadecimal.DecimalConverter(numberOne));
																SaveNumbers(result);
																break;


											case "HEXTOBIN":	System.out.println("ingrese el numero");
																numberOne=lecture.next();
																numberOne=Conditional(numberOne);	
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
									if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
																
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}	
									result=String.valueOf(TrigonometricOperations.Sine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del seno es: "+result);
									SaveNumbers(result);
									break;

					case "COS": 	System.out.println("ingrese uno si va a introducir grados");
									System.out.println("ingrese dos si va a introducir radianes");
									degOrGrad= reader.nextInt();
									while((degOrGrad!=1) &&(degOrGrad!=2)){
										System.out.println("solo puede ingresar uno o dos para la seleccion");
										degOrGrad= reader.nextInt();
									}
									if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
																
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}	
									result=String.valueOf(TrigonometricOperations.Cosine(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado del coseno es es: "+result);
									SaveNumbers(result);
									break;


					case "TAN": 	System.out.println("ingrese uno si va a introducir grados");
									System.out.println("ingrese dos si va a introducir radianes");
									degOrGrad= reader.nextInt();
									while((degOrGrad!=1) &&(degOrGrad!=2)){
										System.out.println("solo puede ingresar uno o dos para la seleccion");
										degOrGrad= reader.nextInt();
									}
									if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
																
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}	
									result=String.valueOf(TrigonometricOperations.Tangent(Double.parseDouble(numberOne),degOrGrad));
									System.out.println("el resultado de la tangente es es: "+result);
									SaveNumbers(result);
									break;


					case "LOG":		if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
																
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}	
									result=String.valueOf(ComplexOperations.Logarithm10(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base 10 es: "+result);
									SaveNumbers(result);
									break;


					case "LOGN": 	if(modeTwo!=0){

										numberOne=array[0];

									}
									else{
																
										System.out.println("ingrese el numero");
										numberOne=lecture.next();
										numberOne=Conditional(numberOne);
									}	
									result=String.valueOf(ComplexOperations.LogarithmE(Double.parseDouble(numberOne)));
									System.out.println("el resultado del logaritmo base natural es: "+result);
									SaveNumbers(result);
									break;


					case "NOTACIONC": 	if(modeTwo!=0){

											numberOne=array[0];

										}
										else{
																
											System.out.println("ingrese el numero");
											numberOne=lecture.next();
											numberOne=Conditional(numberOne);
										}	
										while(Double.parseDouble(numberOne)<=0){
											System.out.println("la operacion no se puede realizar con numeros negativos");
											System.out.println("vuelva a ingresar un numero");
											numberOne=lecture.next();
										}
										result=ComplexOperations.Baseten(Double.parseDouble(numberOne));
										System.out.println("el resultado del logaritmo base natural es: "+result);
										break;


					case "OPERACION":	Message();


					case "MEMORIA": for(int count=0;count<10;count++){

										System.out.println("el dato "+(count+1)+" es: "+array[count]);

									}


					default: System.out.println("la opercion que usted ingreso no se encuentra entre nuestras opciones");


				}//fin del switch

				System.out.println("ingrese 0 si desea seguir usando la calculadora, de lo contrario ingrese cualquier otro numero");
				continueOperation=reader.nextInt();
				if(continueOperation!=0){
					break;
				}

				System.out.println("ingrese 2 si desea continuar en este modo, ingrese 1 si desea cambiar al modo de una operacion a la vez");
				mode=reader.nextInt();

				while(mode!=1 && mode!=2){

					System.out.println("para escoger un modo solo puede ingresa uno o dos");
					mode=reader.nextInt();	

				}//fin del while
				modeTwo++;
				if(mode==1){
					modeTwo=0;
				}


			}//fin del modo dos 

			
		}//fin del bucle, cuando se termine el bucle la calculadora tambien debera terminar

	
	}//fin del metodo

/**
*This method prints a small manual about calculators' operation.
*<b>post: </b> The manual has been printed on screen.<br>
*/

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
		System.out.println("escriba <MEMORIA> para ver los datos que tiene guardados en memoria");
		System.out.println("si desea usar uno de los datos en memoria en una operacion escriba <mem(numero del dato)>");
		System.out.println("por ejemplo <mem1> lamaria al dato en el espacio uno de le memoria, hay un total de diez espacios");
		System.out.println("tenga en cuenta que al iniciar iniciar la calculadora no tiene ningun dato guardado");
		System.out.println("si desea usar pi en una operacion escriba <P>");

	}//fin del metodo

/**
*This method prints a small manual about conversion's operations.
*<b>post: </b> The manual has been printed on screen.<br>
*/
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

/**
*This method evaluates if the entered number is pi or a number from the memory.
*<b>Pre:</b> The memory has been declared and the number has been entered.<br>
*<b>Post:</b> The entered number has been evaluated and changed for its respective value.<br>
@param number number to evaluate. number!=null && number!="".
@return result return its a String value. return!=null && return!="". 

*/

	public static String Conditional(String number){
		String result="";
		char helper;
		helper=number.charAt(0);
		int superHelper;

		if(number==null || number==""){
		 	System.out.println("usted no ha ingresado ningun valor,se ingresara el numero 1 por defecto");
		 	result="1";
		 }
		else{
			if(helper!='P'){
				result=number;
			}
			else{
				result="3.1416";
			}//fin del condicional

			if(helper!='m'){

			}
			else{
				helper=number.charAt(3);
				superHelper=Integer.parseInt(""+helper);

				if(number.length()>=5){

					if(number.length()>5){
						System.out.println("el espacio en memoria que ingreso no existe, se ingresara el numero uno por defecto");
						result="1";
					}
					else{
						if(array[9]==null){
						System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
						result="1";
					}
					else{
						result=array[9];
					 
					}
				}				
				
			}
			else{
				switch(superHelper){

					case 1: if(array[0]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[0];
					 			
							}
							break;	

					case 2:	if(array[1]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[1];
					 			
							}
							break;	

					case 3:	if(array[2]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[2];
					 				
							}
							break;	

					case 4:	if(array[3]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[3];
					 				
							}
							break;	
							
					case 5:	if(array[4]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[4];
					 			
							}
							break;	

					case 6:	if(array[5]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[5];
					 				
							}
							break;	

					case 7:	if(array[6]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[6];
					 			
							}
							break;	

					case 8:	if(array[7]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[7];
					 				
							}
							break;	

					case 9:	if(array[8]==null){
								System.out.println("el valor en memoria que ingreso esta vacio, se ingresara por defecto el numero 1");
								result="1";
							}
							else{
								result=array[8];
					 				
							}
							break;	
							
				}//fin del switch
			}//fin de la condicion
		}//fin del condicional
		}
		
		return result;
	}

/**
*This method saves results in a memory array of ten positions.
*<b>Pre:</b> Array results is initialized.<br>
*<b>post:</b> The method has saved result in the array's first position and has moved previus results (if any) to the right.<br>
@param result result to save. result !=null && result!="".
*/
	public static void SaveNumbers(String result){

		for(int count=9;count>=0;count--){
				if(count>=1){
					array[count]=array[count-1];
				}
				else{
					array[count]=result;
				}
	
		}//fin del guardado de los datos en el array

	}//fin del metodo


}//FIN DE LA CLASE