/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.prog.pkg2;

/**
 *
 * @author user
 */
public class Assignment1Prog2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Music m=new Music("Danial"," Asyraf");
        System.out.println("Name of User: "+m.toString());
        
        PunkRock p=new PunkRock();
        p.printSong();
        p.printArtist();
        p.printAlbum();
        p.setDateReleased("14th April 2004");
        System.out.println("Date of Released: "+p.getDateReleased());
        p.setPrice(45.60);
        System.out.println("Price of the song: Rm"+p.getPrice());
        
    }
    
}
