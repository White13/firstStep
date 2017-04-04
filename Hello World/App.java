package com.m2i;

/**
 * Hello world!
 *
 */
 

 
public class App {
	
    public static void main( String[] args )
    {
		Chat chat = new Chat("Félix", "Siamois");
		Chien chien = new Chien("Medor", "Bullterrier"); 
		
        chien.crier ();
		chat.crier ();
    }
}
