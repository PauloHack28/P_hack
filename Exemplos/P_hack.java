/**
 * Exemplo de interpretador.
 *
 * Esse é o ponto de partida para o interpretador da linguagem 'P_hack'.
 * O único objetivo desse programa é instanciar um objeto P_hack, que é
 * o interpretador da linguagem, passando para ele o caminho do arquivo
 * a ser interpretador. Para mais informações, veja o arquivo P_hack.java
 *
 * Para executar, rode o seguinte comando no terminal:
 * java P_hack ./teste.P_hack
 * 
 * Por Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */

import java.util.Scanner;
import java.io.*;

class P_hack {
    public static void main(String args[]) throws Exception {
        File f;
        Scanner s;
        Interpretador b;
        String linhas[] = new String[2000]; // arquivo pode ter, no máximo, 2000 linhas.
        
        try {
            // Referencia o arquivo. args[0] conterá os dados passados pela linha de comando.
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
            // desse ponto, o objeto "b" irá interpretar o código lido do arquivo.
            b.interpreta(linhas);
            
        } catch (IOException e) {
            System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
            System.out.println("Uso:");
            System.out.println("    java P_hack /caminho/para/arquivo.P_hack");
        }
        
    }
}