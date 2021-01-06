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
        
        AbsMusic obj=new AbsMusic();
        obj.typeGenre();
        System.out.println("\n");
        
        PunkRock p=new PunkRock();
        p.printSong();
        p.printArtist();
        p.printAlbum();
        p.setDateReleased("14th April 2004");
        System.out.println("Date of Released: "+p.getDateReleased());
        p.setPrice(45.60);
        System.out.println("Price of the song: Rm"+p.getPrice());
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        PopRock p1=new PopRock();
        p1.printSong();
        p1.printArtist();
        p1.printAlbum();
        p1.setDateReleased("26th May 2004");
        System.out.println("Date of Released: "+p1.getDateReleased());
        p1.setPrice(13.70);
        System.out.println("Price of the song: Rm"+p1.getPrice());
        p1.recommendedSong("Bohemian Rhapsody","Shut up and Dance!");
        p1.checkPlatform();
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        Country p2=new Country();
        p2.printSong();
        p2.printArtist();
        p2.printAlbum();
        p2.setDateReleased("27th February 1998");
        System.out.println("Date of Released: "+p2.getDateReleased());
        p2.setPrice(13.70);
        System.out.println("Price of the song: Rm"+p2.getPrice());
        p2.recommendedSong("Up!","Take Me Home");
        p2.checkPlatform();
        
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        
        Instrumental p3=new Instrumental();
        p3.printSong();
        p3.printArtist();
        p3.printAlbum();
        p3.setDateReleased("27th December 2007");
        System.out.println("Date of Released: "+p2.getDateReleased());
        p2.setPrice(13.70);
        System.out.println("Price of the song: Rm"+p2.getPrice());
        p2.recommendedSong("Canon Rock","River flows in you");
        p2.checkPlatform();
    }
    
}
