/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecoradorstream;

import java.io.IOException;
import static patrondecoradorstream.DecoratorStream.in;

/**
 *
 * @author adrian
 */
class Core implements LCD {
 public void write( String[] s ) {
 System.out.print( "INPUT: " );
 try {
 s[0] = in.readLine();
 } catch (IOException ex) { ex.printStackTrace(); }
 }
 public void read( String[] s ) {
 System.out.println( "Output: " + s[0] );
 } 

}
