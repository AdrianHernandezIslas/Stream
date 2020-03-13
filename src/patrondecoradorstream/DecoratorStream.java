/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecoradorstream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author adrian
 */

public class DecoratorStream {
 static BufferedReader in = new BufferedReader(new
   InputStreamReader(System.in));
  
 public static void main( String[] args ) {
 LCD stream = new Authenticate( new Scramble( new Core() ) );
 String[] str = { new String() };
 stream.write( str );
 System.out.println( "main: " + str[0] );
 stream.read( str );
}
}

