package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestException {

	public static void main(String[] args) throws DivisaoPorZeroException, IOException { //clausula throws adicionada ao metodo
//		try {
//			//trecho onde a exce��o pode ocorrer
//			int val = 10 / 0;
//			System.out.println(val);
//			
//		} catch(Exception e) { //Captura da exce��o
//			
//			//tratamento da exce��o
//			e.printStackTrace();
//			
//			//java.lang.ArithmeticException: / by zero - resposta com o erro, na divis�o po zer
//			//at br.com.exceptions/exceptions.TestException.main(TestException.java:8) // erro na linha 8
//			
//		}
//
//	}
		
//		//tambem podemos criar nossas exce��es a classe exception �  a classe para erros checked e unchecked
//		//Exce��es Unchecked
//		try {
//			
//			//int val = 10 / 0; //causara um erro pela divis�o por zero
//			//int [] valores = new int [3];
//			System.out.println(valores [4]);// erro por um acesso a um array de um indice que n�o existe 
//			
//			String nome = null;
//			System.out.println(nome.length()); //erro por tentar acessar uma string vazia declarada como null
//			
//			int numero = Integer.parseInt ("zero"); //erro por tentar trocar por zero um numero inteiro
//			
//		}
//		
//		catch (ArithmeticException e ) { //um erro aritmetico como causado na linha 27 sera tratado nesse bloco de codigo 
//			
//			System.out.println("N�o � possivel realizar uma divis�o por zero.");
//			
//			//Mensagem com a lista dos erros 
//			System.out.println(e.getLocalizedMessage());
//			//Imprime a lista de erro da exce��o
//			e.printStackTrace();
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e) { //erro de acesso indevido
//			
//			System.out.println("N�o � possivel acessar a posi��o 4 do array !");
//			
//		} catch  (NullPointerException e) { //erro de acesso a um objeto que n�o foi inicializado
//			System.out.println("N�o foi possive retornar o lenght, variavel n�o instanciada !");
//			
//		} catch (NumberFormatException e)  { //erro de formata��o 
//			
//			System.out.println("N�o foi possivel realizar convers�o ! ");
//			
//		} catch (Exception e)  { //a classe � a exception � a mais generica se nenhum dos outros conseguir tratar a exce��o essa ira faze-lo
//			System.out.println("Erro na execu��o do programa!");
//		
//		} finally { //sempre sera executado independente se uma exce��o ocorrer ou n�o, se a exce��o ocorrer o catch tratara e o bloco finally ainda sim sera executado, caso n�o haja exce��o o finally sera executado tambem
//			
//			System.out.println("Sempre passar� aqui !");
//		}
		
		//PROPAGA��O DE EXCE��ES
		
		// pode-se optar por n�o tratar uma exce��o em um metodo com o bloco try catch optando pelo chamador desse metodo pelo throws
		//m�todo check
		
//	FileWriter fw = new FileWriter("c:\\nota.txt"); //o codigo n�o compila, tenta gravar um arquivo nota.txt mas da erro, � um erro checked, precisa ser tratado, podemos tratar com try catch ou throws
//	
//	PrintWriter print = new PrintWriter (fw);
//	print.println ("Ma�a = R$ 4,00");
//	print.println ("Morango = R$ 6,50");
//	print.println ("Total = R$ 10,50");
//	print.close();
//	fw.close();
//	
//    // a clausula throws declara exce��es que podem ocorrer ou ser lan�adas em determinado metodo, for�ando assim que quem o chame fa�a o tratamento da exce��o na clasusa throws 	
//	
//		
		
		
		
		}

}
