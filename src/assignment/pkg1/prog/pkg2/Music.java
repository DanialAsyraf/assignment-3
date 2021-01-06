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

/*    public void printMethod1(){
        Music obj1=new Music();
        Music obj2=new Music("Asyraf");
        System.out.println("Name: "+obj1.userFirstName+" "+obj2.userSecondName);

    }*/
}
