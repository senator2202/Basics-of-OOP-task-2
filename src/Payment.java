
public class Payment {
    public static int count;
    int id;
    int sum;
    String product;
    Payer payer;
    String paymentReceiver;

    class Payer{
        String name;
        String address;
        String phone;

        Payer(String name, String address, String phone){
            this.name=name;
            this.address = address;
            this.phone=phone;
        }

        String getPayerInfo(){
            return "name: "+name+";\taddress: "+address+";\tphone: "+phone;
        }
    }

    public Payment(String payerName, String payerAddress, String payerPhone, String product, int sum, String paymentReceiver){
        id=++count;
        payer=new Payer(payerName,payerAddress,payerPhone);
        this.product=product;
        this.paymentReceiver=paymentReceiver;
        this.sum=sum;
    }

    public String toString(){
        return "id: "+id+";\tsum: "+sum+";\tproduct: "+product+";\tpayer name: "+payer.name+";\tpayment receiver: "+paymentReceiver;
    }

    public int getId(){
        return id;
    }
    public int getSum(){
        return sum;
    }
    public String getPayerName(){
        return payer.name;
    }
    public String getPayerAdress(){
        return payer.address;
    }
    public String getPayerPhone(){
        return payer.name;
    }
    public String getPaymentReceiver(){
        return paymentReceiver;
    }
    public String getProduct(){
        return product;
    }
}
