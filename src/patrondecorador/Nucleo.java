/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorador;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author adrian
 */
public class Nucleo extends Disco{

    public Nucleo() {
        
    }

    public void write( String[] s ) {
        System.out.print( "ENTRADA: " );
        try {
        s[0] = in.readLine();
        } catch (IOException ex) { ex.printStackTrace(); }
    }
    public void read( String[] s ) {
        System.out.println( "SALIDA: " + s[0] );
    } 
  
}
