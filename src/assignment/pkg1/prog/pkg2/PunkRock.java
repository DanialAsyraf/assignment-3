/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.prog.pkg2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PunkRock{
    String songTitle,artist,album;
    double price;
    private String dateReleased;
    
    PunkRock(){
        this.songTitle="I wanna be sedated";
        this.artist="Ramones";
        this.album="The Greatest Hits";
    }
    public void printSong(){
        PunkRock obj1=new PunkRock();
        System.out.println("Song Title: "+obj1.songTitle);
    }
    public void printArtist(){
        PunkRock obj2=new PunkRock();
        System.out.println("Artist: "+obj2.artist);
    }
    public void printAlbum(){
        PunkRock obj3=new PunkRock();
        System.out.println("Album Title: "+obj3.album);
    }
    public void setDateReleased(String newDate){
        dateReleased=newDate;
    }
    public String getDateReleased(){
        return dateReleased;
    }
    public void setPrice(double newPrice){
        price=newPrice;
    }
    public double getPrice(){
        return price;
    }
    public void checkGenre(){
        Scanner scan1=new Scanner(System.in);
        try{
            System.out.println("Pease input music genre: ");
            String genre=scan1.next();
            System.out.println("Choosen music genre: "+genre);
        } catch(Exception e){
            System.out.println("Something went wrong! Genre is not available");
        }
        
    }
    public void checkPlatform(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter music platform: ");
        String platform=scan.next();
        
        if(platform=="apple music"||platform=="joox"){
            throw new ArithmeticException("Music not available on these platform!");
        }
        else{
            System.out.println("Music available!");
    }
    }
}
