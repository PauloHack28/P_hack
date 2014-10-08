
public class Interpretador {
	private String arquivo[];
	private Variaveis v[]=new Variaveis[20];
		
	//M�todo que faz a leitura linha por linha.
	public void interpretaCod (String linhas[]){
		this.arquivo = linhas;
		int i,pos;
		pos=0;//Ser� o indice do vetor de vari�veis.		
		
		for (i=0;i<=this.arquivo.length && this.arquivo[i]!= null;i++){
			// Dentro do la�o, selecionamos uma linha por vez para interpretar, em busca de Totens que auxiliem nos processos..
			
			// 1� SE. Caso a linha contenha a palavra Var, entende-se como cria��o de vari�vel do tipo Var:nome;
			if (this.arquivo[i].contains("Var")){
				v[pos]=new Variaveis();
				v[pos].criaVariavel(this.arquivo[i]);
				pos++;
			}
			//2� SE. Caso a linha possua atribui��o de valor do tipo a=2;
			else if (this.arquivo[i].contains("=")){
				int end;
				end = Variaveis.nomePesquisa(this.arquivo[i],v,pos);
				if (end == -1) break;
				v[end].setValor(this.arquivo[i]);
			}
			
			//Caso seja encontrado fim_do_programa, o interpretador finaliza a leitura do arquivo.
			else if (this.arquivo[i].contains("fim_do_programa")){
				break;
			}
		}			
	}	
}
