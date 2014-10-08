
public class Variaveis {

	private String nome;
	private double valor;
	
	public Variaveis(){
		this.nome = new String();
		this.valor = 0.0;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	//M�todo de cria��o de nova vari�vel. Recebe a linha para ser interpretada e nela faz a leitura do nome da nova vari�vel.
	public void criaVariavel(String s1){
		String s = s1;
		int i,k;
		i=s.lastIndexOf(";");
		k=s.lastIndexOf(":");
		this.nome = s.substring(k+1,i);
		System.out.println("Nome:"+this.nome+" Valor:" +this.valor);
 	}
	
	/* M�todo para inserir valores em uma vari�vel. O m�todo recebe uma string que cont�m 
	 * o nome da vari�vel e o valor a ser colocado nela.
	 * Ele encontra o numero na string, transforma em double, e coloca na vari�vel valor do objeto v[i]*/
	public void setValor(String s1){
		int j;
		double k;
		String s = s1;
		j = s.indexOf("=");			
		k = Double.parseDouble(s.substring(j+1,s.indexOf(";")));
		this.valor = k;
		System.out.println("Nome:"+this.nome+" Valor:" +this.valor);
	}
	
	/* M�todo de pesquisa, recebe um vetor de vari�veis, um int com o tamanho do vetor, 
	 * e uma string a ser procurada. Retorna o indice do vetor em que esta a vari�vel
	 * ou -1 caso n�o encontre a string no vetor.*/
	public static int nomePesquisa(String s1,Variaveis v[],int p){
		int i,j;
		String s = s1;
		j = s.indexOf("=");		
		String n_busca = new String();
		n_busca = s.substring(0,j);
		String nome;
		for (i=0;i<p;i++){
			nome = v[i].getNome();
			if (nome.compareTo(n_busca) == 0){
				return i;
			}
		}
		return -1;
	}
}
	