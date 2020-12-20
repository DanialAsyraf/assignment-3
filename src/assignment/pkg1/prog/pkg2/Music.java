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
//import java.util.Scanner;
public class Music {
    String firstName,secondName;
    
    public Music(String firstName,String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setSecondName(String secondName){
        this.secondName=secondName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public String toString(){
        return firstName+secondName;
    }
/*    public void checkGenre(){
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
*/
/*    public void printMethod1(){
        Music obj1=new Music();
        Music obj2=new Music("Asyraf");
        System.out.println("Name: "+obj1.userFirstName+" "+obj2.userSecondName);

    }*/
}
