import java.util.*;
public class DiscountedFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fee=sc.nextDouble();
        double discountPercent=sc.nextDouble();
        double discount=fee/discountPercent;
        double discountedFee=fee-discount;
        System.out.println(" The discount amount is :"+discount+" INR and final discounted fee is :"+discountedFee+" INR");
    }
}
