/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecoradorstream;

/**
 *
 * @author adrian
 */
class Decorator implements LCD {
 protected LCD inner;
 public Decorator( LCD i ) { inner = i; }
 public void write( String[] s ) { inner.write( s ); }
 public void read( String[] s ) { inner.read( s ); }
 }
