/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexer;

/**
 *
 * @author Paulo
 */
public class Num extends Token {
    public final int value;
    public Num(int v){
        super(Tag.NUM);value = v;
    }
    public String toString() {return"" + value;    
}
