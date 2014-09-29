/**
 * Exemplo de interpretador.
 *
 * Esse código é um exemplo de interpretador para a linguagem 'Blah'. Esse programa
 * não faz qualquer interpretação, ele apenas lê o conteúdo de um arquivo que foi
 * passado pela linha de comando.
 *
 * Por Fernando Bevilacqua <fernando.bevilacqua@uffs.edu.br>
 */

class Interpretador {
    private String linhas[];
    
    public void interpreta(String l[]) {
        this.linhas = l;
              
        for(int i = 0; i < this.linhas.length; i++) {
            if(this.linhas[i] != null) {
			
			            	//Criando um vetor baseado na STRING, separando todos os caracteres que   
                //possuem um " |:?[0-9]+|:" entre eles.  
            String[] s = this.linhas[i].split(" ");  
			for(int j = 0; j < s.length; j++)
         /* 
              Resultado: 
              s[0] = 4 
              s[1] = 5 
              s[2] = 10 
              s[3] = 40 
             */
                  
            //Imprimindo 4 ou o primeiro item da string   
        	//for (j=0;j<6;j++)//{
                System.out.println(""+s[j]);
            //}
			
			
			
			
			
            	// TODO: interpretar a linha
                //System.out.println("Linha " + (i + 1) + ": " + this.linhas[i]);
            }
        }
    }
}