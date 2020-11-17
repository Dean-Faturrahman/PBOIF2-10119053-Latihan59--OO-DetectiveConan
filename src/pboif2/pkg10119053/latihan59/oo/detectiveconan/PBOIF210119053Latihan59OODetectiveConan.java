/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan59.oo.detectiveconan;

import model.DetectiveBoys;
import model.Detective;
import model.FamFriend;
import model.Polisi;
import model.FBI;
import model.BlackOrganization;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program detective conan
 */
public class PBOIF210119053Latihan59OODetectiveConan {

    public static void main(String[] args) {
        System.out.println("=====Daftar Nama Tokoh Detektif Conan=====");
        
        System.out.println("\n-----Detective Boys-----");
        
            DetectiveBoys boy1;
            boy1 = new DetectiveBoys("Conan Edogawa");
            boy1.displayChara();
        
            DetectiveBoys boy2;
            boy2 = new DetectiveBoys("Ai Haibara");
            boy2.displayChara();
            
            DetectiveBoys boy3;
            boy3 = new DetectiveBoys("Genta Kojima");
            boy3.displayChara();
            
            DetectiveBoys boy4;
            boy4 = new DetectiveBoys("Mitsuhi Tsuburaya");
            boy4.displayChara();
            
            DetectiveBoys boy5;
            boy5 = new DetectiveBoys("Ayumi yoshida");
            boy5.displayChara();
            
        System.out.println("\n-------Detective-------");
            
            Detective det1;
            det1 = new Detective("Mouri Kogoro");
            det1.displayChara();
            
            Detective det2;
            det2 = new Detective("Shinichi Kudo");
            det2.displayChara();
            
            Detective det3;
            det3 = new Detective("Heiji Hatori");
            det3.displayChara();
            
            Detective det4;
            det4 = new Detective("Masumi Sera");
            det4.displayChara();      
            
        System.out.println("\n----Family & Friend----");
            
            FamFriend ff1;
            ff1 = new FamFriend("Kazuha Toyama");
            ff1.displayChara();
            
            FamFriend ff2;
            ff2 = new FamFriend("Sonoko Suzuki");
            ff2.displayChara();
            
            FamFriend ff3;
            ff3 = new FamFriend("Ran Mouri");
            ff3.displayChara();
            
            FamFriend ff4;
            ff4 = new FamFriend("Kisaki Eri");
            ff4.displayChara();
            
            FamFriend ff5;
            ff5 = new FamFriend("Prof. Hiroshi Agasa");
            ff5.displayChara();
            
            FamFriend ff6;
            ff6 = new FamFriend("Kaito Kid");
            ff6.displayChara();
            
            FamFriend ff7;
            ff7 = new FamFriend("Yusaku Kudo");
            ff7.displayChara();
            
            FamFriend ff8;
            ff8 = new FamFriend("Yukiko Kudo");
            ff8.displayChara();
            
        System.out.println("\n--------Polisi--------");
        
            Polisi polisi1;
            polisi1 = new Polisi("Juzo Megure");
            polisi1.displayChara();
            
            Polisi polisi2;
            polisi2 = new Polisi("Wataru akagi");
            polisi2.displayChara();
            
            Polisi polisi3;
            polisi3 = new Polisi("Miwako Sato");
            polisi3.displayChara();
            
            Polisi polisi4;
            polisi4 = new Polisi("Ninzaburo Shiratori");
            polisi4.displayChara();
            
            Polisi polisi5;
            polisi5 = new Polisi("Yumi Miyamoto");
            polisi5.displayChara();
            
            Polisi polisi6;
            polisi6 = new Polisi("Kazunobu Chiba");
            polisi6.displayChara();
            
            Polisi polisi7;
            polisi7 = new Polisi("Kiyanoga Matsumoto");
            polisi7.displayChara();
                        
        System.out.println("\n---------FBI----------");
        
            FBI fbi1;
            fbi1 = new FBI("Shuichi Akai");
            fbi1.displayChara();
            
            FBI fbi2;
            fbi2 = new FBI("Jodie Starling");
            fbi2.displayChara();
            
            FBI fbi3;
            fbi3 = new FBI("James Black");
            fbi3.displayChara();
            
            FBI fbi4;
            fbi4 = new FBI("Andre Camel");
            fbi4.displayChara();
                    	
        System.out.println("\n----Black Organization----");
        
            BlackOrganization bo1;
            bo1 = new BlackOrganization("Renya Karasuma (The Boss)");
            bo1.displayChara();
            
            BlackOrganization bo2;
            bo2 = new BlackOrganization("Rum");
            bo2.displayChara();
            
            BlackOrganization bo3;
            bo3 = new BlackOrganization("Gin");
            bo3.displayChara();
            
            BlackOrganization bo4;
            bo4 = new BlackOrganization("Vodka");
            bo4.displayChara();
            
            BlackOrganization bo5;
            bo5 = new BlackOrganization("Vermouth");
            bo5.displayChara();
            
            BlackOrganization bo6;
            bo6 = new BlackOrganization("Chianti");
            bo6.displayChara();
            
            BlackOrganization bo7;
            bo7 = new BlackOrganization("Korn staff");
            bo7.displayChara();
            
            BlackOrganization bo8;
            bo8 = new BlackOrganization("Tequila staff");
            bo8.displayChara();
            
            BlackOrganization bo9;
            bo9 = new BlackOrganization("Pisco");
            bo9.displayChara();
           
    }
    		
	
}
