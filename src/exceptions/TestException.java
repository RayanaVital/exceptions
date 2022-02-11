package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestException {

	public static void main(String[] args) throws DivisaoPorZeroException, IOException { //clausula throws adicionada ao metodo
//		try {
//			//trecho onde a exceção pode ocorrer
//			int val = 10 / 0;
//			System.out.println(val);
//			
//		} catch(Exception e) { //Captura da exceção
//			
//			//tratamento da exceção
//			e.printStackTrace();
//			
//			//java.lang.ArithmeticException: / by zero - resposta com o erro, na divisão po zer
//			//at br.com.exceptions/exceptions.TestException.main(TestException.java:8) // erro na linha 8
//			
//		}
//
//	}
		
//		//tambem podemos criar nossas exceções a classe exception é  a classe para erros checked e unchecked
//		//Exceções Unchecked
//		try {
//			
//			//int val = 10 / 0; //causara um erro pela divisão por zero
//			//int [] valores = new int [3];
//			System.out.println(valores [4]);// erro por um acesso a um array de um indice que não existe 
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
//			System.out.println("Não é possivel realizar uma divisão por zero.");
//			
//			//Mensagem com a lista dos erros 
//			System.out.println(e.getLocalizedMessage());
//			//Imprime a lista de erro da exceção
//			e.printStackTrace();
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e) { //erro de acesso indevido
//			
//			System.out.println("Não é possivel acessar a posição 4 do array !");
//			
//		} catch  (NullPointerException e) { //erro de acesso a um objeto que não foi inicializado
//			System.out.println("Não foi possive retornar o lenght, variavel não instanciada !");
//			
//		} catch (NumberFormatException e)  { //erro de formatação 
//			
//			System.out.println("Não foi possivel realizar conversão ! ");
//			
//		} catch (Exception e)  { //a classe é a exception é a mais generica se nenhum dos outros conseguir tratar a exceção essa ira faze-lo
//			System.out.println("Erro na execução do programa!");
//		
//		} finally { //sempre sera executado independente se uma exceção ocorrer ou não, se a exceção ocorrer o catch tratara e o bloco finally ainda sim sera executado, caso não haja exceção o finally sera executado tambem
//			
//			System.out.println("Sempre passará aqui !");
//		}
		
		//PROPAGAÇÃO DE EXCEÇÕES
		
		// pode-se optar por não tratar uma exceção em um metodo com o bloco try catch optando pelo chamador desse metodo pelo throws
		//método check
		
//	FileWriter fw = new FileWriter("c:\\nota.txt"); //o codigo não compila, tenta gravar um arquivo nota.txt mas da erro, é um erro checked, precisa ser tratado, podemos tratar com try catch ou throws
//	
//	PrintWriter print = new PrintWriter (fw);
//	print.println ("Maça = R$ 4,00");
//	print.println ("Morango = R$ 6,50");
//	print.println ("Total = R$ 10,50");
//	print.close();
//	fw.close();
//	
//    // a clausula throws declara exceções que podem ocorrer ou ser lançadas em determinado metodo, forçando assim que quem o chame faça o tratamento da exceção na clasusa throws 	
//	
//		
		
		
		
		}

}
