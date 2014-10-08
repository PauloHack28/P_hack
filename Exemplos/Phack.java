import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Phack {
	 public static void main(String args[]) throws Exception {
	        File f;
	        Scanner s;
	        Interpretador b;
	        String linhas[] = new String[2000]; // arquivo pode ter, no m�ximo, 2000 linhas.
	        
	        try {
	            // Referencia o arquivo. args[0] conter� os dados passados pela linha de comando.
	            f = new File(args[0]);
	            // Mandamos o Scanner ler a partir do arquivo.
	            s = new Scanner(f);
	            // Instanciamos o interpretador.
	            b = new Interpretador();
	            
	            // Lemos todas as linhas do arquivo para dentro do
	            // vetor "linhas".
	            int i = 0;
	            while(s.hasNext()) {
	                linhas[i] = s.nextLine();
	                i++;
	            }
	            
	            // Inicializamos o interpretador com o vetor de linhas. A partir
	            // desse ponto, o objeto "b" ir� interpretar o c�digo lido do arquivo.
	            b.interpretaCod(linhas);
	            
	        } catch (IOException e) {
	            System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
	            System.out.println("Uso:");
	            System.out.println("    java Phack /caminho/para/arquivo.Phack");
	        }        
	   }
}


