
public abstract class Espaço_Em_Branco {
	abstract boolean isWhitespace (char ch );
	public static class Teste {

		   public  static  void main ( String args []){ 
		      System . out . println ( Character . isWhitespace ( 'c' )); 
		      System . out . println ( Character . isWhitespace ( ' ' )); 
		      System . out . println ( Character . isWhitespace ( '/' )); 
		      System . out . println ( Character . isWhitespace ( '\t' )); 
		   } 
		}
}
