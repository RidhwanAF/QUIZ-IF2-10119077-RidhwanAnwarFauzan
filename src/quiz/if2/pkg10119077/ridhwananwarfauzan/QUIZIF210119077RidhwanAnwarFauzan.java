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
        ServicePrice objSP = new ServicePrice();
        Scanner input = new Scanner(System.in);

        objSP.displayService();
        System.out.println("===Program Kasir Rock n Roll Haircut===");
        System.out.print("Customer Name : ");
        objSP.setName(input.nextLine());
        System.out.print("Customer Email : ");
        objSP.setEmail(input.nextLine());
        objSP.displayService();
        objSP.setPriceService(objSP.getPrice(input.nextInt()));
        System.out.print("Are you Member (yes/no) : ");
        objSP.setMember(objSP.checkMemberStatus(input.next()));

        System.out.println("\n#*************************************#");
        System.out.println("#**********CUSTOMER INVOICE***********#");
        System.out.println("Data Transaction : "+objSP.currentTime());
        System.out.println("Service Price : Rp."+objSP.getPriceService());
        System.out.println("Discount : Rp."+objSP.getScale(objSP.isMember(),objSP.getPriceService()));
        System.out.println("Total Pay : Rp."+objSP.getTotalPay(objSP.getPriceService(),
        objSP.getScale(objSP.isMember(),objSP.getPriceService())));
    }
    
}
