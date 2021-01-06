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
abstract class listGenre {
    abstract void typeGenre();
    
}
class AbsMusic extends listGenre{
    void typeGenre(){
        System.out.println("Music Genre available: "+"\n1.Punk Rock"+"\n2.Pop Rock"+"\n3.Country"+"\n4.Instrumental");
    }    
}
