/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorador;

import java.io.IOException;

/**
 *
 * @author adrian
 */
public class Autenticar extends Decorador{
    private String c,sc;
    public Autenticar(Disco i) {
        super(i);
    }

    public void write( String[] s ) {
        System.out.print( "CONTRASEÑA: " );
        try {
        c = in.readLine();
        sc = c;
        } catch (IOException ex) { ex.printStackTrace(); }
        super.write( s );
    }
    public void read( String[] s ) {
        System.out.print( "CONTRASEÑA: ");
        try {
        c=in.readLine();
        } catch (IOException ex) { ex.printStackTrace(); }
        if(c.equals(sc)){
            super.inner.read(s);
            super.read( s );
        }else{
            System.out.println("Contraseña MAl");
        }
    } 
    
}
