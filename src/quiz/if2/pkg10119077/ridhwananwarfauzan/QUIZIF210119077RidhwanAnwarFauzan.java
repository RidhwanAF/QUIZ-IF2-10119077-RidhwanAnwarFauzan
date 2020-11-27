/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119077.ridhwananwarfauzan;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF-2
 * Deskripsi    : Menampilkan detail harga haircur
 */
public class QUIZIF210119077RidhwanAnwarFauzan {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ServicePrice objSP=new ServicePrice();
        
        objSP.displayService();
        System.out.print("Are you Member (yes/no) : ");
        input.next();
        System.out.println("");
        System.out.println("#*****************************#");
        System.out.println("#****Customer Invoice****#");
        System.out.println("Service Price : ");
        System.out.println("Discount : ");
        System.out.println("Total Pay : ");
    }
    
}
