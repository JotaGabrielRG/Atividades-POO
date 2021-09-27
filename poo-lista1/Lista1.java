package br.ufba.poo;

import java.io.File;

/**
 * Primeira lista de exercÃ­cios de fixaÃ§Ã£o
 */
public class Lista1 {

	/**
	 * Retorna a mÃ©dia aritmÃ©tica entre dois nÃºmeros.
	 * 
	 * @param a primeiro nÃºmero
	 * @param b segundo nÃºmero
	 * @return a mÃ©dia aritmÃ©tica entre <code>a</code> e <code>b</b>
	 */
	public static double media(double a, double b) {
	
		
		return (a + b) / 2 ;
	}

	/**
	 * Retorna o maior dos elementos de um array.
	 * 
	 * @param elementos array de nÃºmeros inteiros
	 * @return o valor do maior elemento, ou <code>Integer.MIN_VALUE</code> caso o
	 *         array seja vazio
	 */
	public static int maior(int[] elementos) {
		
		if(elementos.length == 0) { 
           return Integer.MIN_VALUE;
           
        }
		
	    int maior = elementos[0];
	    
	   
	    for (int i = 0; i < elementos.length; i++) {
	    	if (elementos[i] > maior) 
	            maior = elementos[i];
    	}
	    
        
	     
	    return maior;
	}
		    

	/**
	 * Retorna a primeira letra de um nome.
	 * 
	 * @param nome nome; pode ser <code>null</code>
	 * @return o primeiro caracter de um nome (em letra minÃºscula), ou espaÃ§o em
	 *         branco caso o nome seja <code>null</code> ou uma string vazia
	 */
	public static char primeiraLetra(String nome) {
		
		
		if (nome == null){
		
		return ' ';
		}			
		nome = nome.toLowerCase();
		return nome.charAt(0);
	}

	/**
	 * 
	 * @param nomeDoArquivo nome do arquivo; nÃ£o pode ser nulo
	 * @return Indica se o nomeDoArquivo representa o nome de um arquivo PDF
	 */
	public static boolean ehPdf(String nomeDoArquivo) {
		
		if(nomeDoArquivo.contains(".PDF")){
			return true;
		}
				
		return false;
	}

	/**
	 * Dado um arquivo, torna-o executÃ¡vel. Se o arquivo nÃ£o existir, nÃ£o faz nada.
	 * 
	 * @param arquivo Arquivo
	 */
	public static void tornaExecutavel(File arquivo) {
		
		String filename = arquivo.getName();
	
		if(filename == null) {
			return;
		}
		else if (filename.contains(".")) {
	        filename = filename.substring(0, filename.lastIndexOf('.'));
	    }
	    filename += ".exe";

	    arquivo.renameTo(new File(arquivo.getParentFile(), filename));
	    
	       	
	}
	
	
	
	

	/**
	 * Verifica se a senha digitada estÃ¡ correta.
	 * 
	 * @param senhaCorreta  senha correta
	 * @param senhaDigitada senha digitada pelo usuÃ¡rio
	 * @return <code>true</code> se as duas senhas sÃ£o iguais; <code>false</code>
	 *         caso contrÃ¡rio
	 */
	public static boolean validaSenha(String senhaCorreta, String senhaDigitada) {
		
		if( senhaDigitada == senhaCorreta) {
			return true;
		}
		
		
		return false;
	}
}
