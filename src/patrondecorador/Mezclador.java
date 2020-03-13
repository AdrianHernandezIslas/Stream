/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorador;

/**
 *
 * @author adrian
 */
public class Mezclador extends Decorador {
    
    public Mezclador(Disco i) {
        super(i);
    }

    public void write( String[] s ) {
        super.write( s );

        System.out.println( "ENCRIPTADO:" );
        StringBuffer sb = new StringBuffer( s[0] );
        for (int i=0; i < sb.length(); i++)
        sb.setCharAt( i, (char) (sb.charAt( i ) - 5) );
        s[0] = sb.toString();
    }
    public void read( String[] s ) {
        StringBuffer sb = new StringBuffer( s[0] );
        for (int i=0; i < sb.length(); i++)
        sb.setCharAt( i, (char) (sb.charAt( i ) + 5) );
        s[0] = sb.toString();
        System.out.println( "ENCRIPTADO:" );
        super.read( s );
    }
    
    
    
}
