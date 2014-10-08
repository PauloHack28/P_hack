/**
 * @author Paulo
 *
 */
public class Operadores {

private char soma          ='+';
private char subtracao     ='-';
private char divisao       ='/';
private char multiplicacao ='*';
private double d;
	public char getSoma() {
		return soma;
	}
	public void setSoma(char soma) {
		this.soma = soma;
	}
	public char getSubtracao() {
		return subtracao;
	}
	public void setSubtracao(char subtracao) {
		this.subtracao = subtracao;
	}
	public char getDivisao() {
		return divisao;
	}
	public void setDivisao(char divisao) {
		this.divisao = divisao;
	}
	public char getMultiplicacao() {
		return multiplicacao;
	}
	public void setMultiplicacao(char multiplicacao) {
		this.multiplicacao = multiplicacao;
	}

	public double SomaDouble (double a, double b){
		d=a+b;
		return d;
	}
	public double SubtracaoDouble (double a, double b){
		d=a-b;
		return d;
	}
	public double multiplicacaoDouble (double a, double b){
		d=a*b;
		return d;
	}
	public double DivisaoDouble (double a, double b){
		d=a/b;
		return d;
	}
}

