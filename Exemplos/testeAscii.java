import java.io.UnsupportedEncodingException;


public class testeAscii {

	public static void main(String[] args) {
		String txt = "Teste 0 ";  
		try {  
		    byte[] bytes = txt.getBytes("ASCII");  
		    for (int i = 0; i < bytes.length; i++) {  
		        System.out.println(bytes [i] ) ;  
		    }  
		} catch (UnsupportedEncodingException e) {  
		    e.printStackTrace();
		 }
		int x=(int)'A'; // a variavel "x" armazenara o codigo ascii de A, no 
		// caso 65 
		
		 System.out.println(x ) ;  

		char a = (char)65; // a variavel "a" recebera o caracter corespondente 
		// ao codigo 65, no caso A.
		 System.out.println(a ) ;  
		 
		 char letr1='B';  
		 int charVal = letr1;  
		 System.out.println(""+charVal);
		 char aChar  = (char)charVal;  
		 System.out.println(""+aChar);
		 		 	 
	}

}


