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
public class Main {
    public static void main(String[] args) {
        //DecoratorStream.LCD stream = new DecoratorStream.Authenticate( new DecoratorStream.Scramble( new DecoratorStream.Core() ) );
        Disco stream = new Autenticar(new Mezclador( new Nucleo()));
        String[] str = { new String() };
         stream.write( str );
         System.out.println( "main: " + str[0] );
         stream.read( str );
    }
}
