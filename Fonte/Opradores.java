/**
 * @author Paulo
 *
 */
public class Opradores {

private char soma          ='+';
private char subtracao     ='-';
private char divisao       ='/';
private char multiplicacao ='*';
private int c;
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
	public int SomaInt (int a, int b){
		c=a+b;
		return c;
	}
	public int SubtracaoInt (int a, int b){
		c=a-b;
		return c;
	}
	public int multiplicacaoInt (int a, int b){
		c=a*b;
		return c;
	}
	public int DivisaoInt (int a, int b){
		c=a/b;
		return c;
	}
	public double SomaInt (double a, double b){
		d=a+b;
		return d;
	}
	public double SubtracaoInt (double a, double b){
		d=a-b;
		return d;
	}
	public double multiplicacaoInt (double a, double b){
		d=a*b;
		return d;
	}
	public double DivisaoInt (double a, double b){
		d=a/b;
		return d;
	}
}
