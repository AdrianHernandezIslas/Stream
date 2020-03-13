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
class Authenticate extends Decorator {
 public Authenticate( LCD inner ) { super( inner ); }
 public void write( String[] s ) {
 System.out.print( "PASSWORD: " );
 try {
 in.readLine();
 } catch (IOException ex) { ex.printStackTrace(); }
 super.write( s );
 }
 public void read( String[] s ) {
 String c="";
 System.out.print( "PASSWORD: ");
 try {
 c=in.readLine();
 } catch (IOException ex) { ex.printStackTrace(); }
 super.inner.read(s);
 super.read( s );
 } }
