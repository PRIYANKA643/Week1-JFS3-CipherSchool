
public class test0 {
    public static void main(String args[]){
        Amazon customer = new Amazon();
        float payableAmount = customer.Transaction(1000);
        System.out.println("Total payable "+payableAmount);
    }
}
class Amazon{
    float Transaction(float amt) {
        Gpay gpayObj = new Gpay();
        gpayObj.setTxnCharge(0.07f);

        float totalAmount = amt+ (amt*gpayObj.getTxnCharge());
        return totalAmount;
    }
}
class Gpay{
    private float txnCharge=0.05f;
    public void setTxnCharge(float newChange){
        if(getTxnCharge()<=0.05f){
           System.out.println("Invalid TxnCharge");
           return; 
        }
        txnCharge=getTxnCharge();
    }
float getTxnCharge(){
    return txnCharge;
}
}
