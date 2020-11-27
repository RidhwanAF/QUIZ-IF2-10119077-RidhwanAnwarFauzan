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
 */
public class ServicePrice extends Customer implements ServiceItem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    @Override
    public void displayService() {
        Scanner input=new Scanner(System.in);
        System.out.println("#*****************************#");
        System.out.println("#****Rock n Roll Haircut****#");
        System.out.println("#********Service List*********#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#******************************#");
        System.out.print("Choose(1/2/3): ");
        input.nextInt();
    }

    @Override
    public float getPrice(int serviceItem) {
        return serviceItem = 45000;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        return true;
    }

    @Override
    public float getScale(boolean isMember, float parServicePrice) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public float getTotalPay(float priceService, float discount){
        return getPriceService() - discount;  
    }
    
}
