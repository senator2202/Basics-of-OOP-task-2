
import java.util.ArrayList;

public class Purchase {
    ArrayList<Payment> payments;
    int totalSum;

    public Purchase(Payment ...payments){
        this.payments=new ArrayList<Payment>();
        for (Payment p:payments
             ) {
            this.payments.add(p);
            totalSum+=p.getSum();
        }
    }

    public int getTotalSum(){
        return totalSum;
    }

    public String[] getPayments(){
        String []res=new String[payments.size()];
        for(int i=0;i<payments.size();i++)
            res[i]=payments.get(i).toString();
        return res;
    }

    public void addPayment(Payment payment){
        payments.add(payment);
        totalSum+=payment.getSum();
    }

    public void deletePayment(int paymentId){
        totalSum-=payments.get(paymentId).getSum();
        payments.remove(paymentId);
    }

    public static void main(String[] args) {
        Payment p1=new Payment("Alexey Kharitonov","4-201 Luchiny Street","+375333647786","car service",200,"STS");
        Payment p2=new Payment("Eugene Holub","21-195 Partizanskii Avenue","+375333334455","car repair",150,"STS");
        Payment p3=new Payment("Siarhei Snatovich","17-21 Sudmalisa Street","+375298765432","icecream",5,"STS");
        Purchase purchase=new Purchase(p1,p2,p3);
        for (String s:purchase.getPayments())
            System.out.println(s);
        purchase.deletePayment(1);
        System.out.println("Total sum: "+purchase.getTotalSum());
        for (String s:purchase.getPayments())
            System.out.println(s);
        System.out.println("Total sum: "+purchase.getTotalSum());
    }

}
