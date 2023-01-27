interface olaCustomer{
    void bookCab();
    void findAride();
    void rateDriver();
    void scheduleCab();
    void canceCab();
    void addMoneytoWallet();
    void raiseTicket();
    void signup();
    void signIn();
}
interface olaDriver{
    void acceptBooking();
    void getCustomerLocation();
    void SetAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedback();

}
interface olaOwner{
    void getDriveRecords();
    void getReportByDriver();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomerFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}
public class test  implements olaOwner,olaDriver,olaCustomer{
    public static void main(String[] args) {
        olaCustomer cust = new test();
        olaDriver manoj = new test();
    }

    @Override
    public void addDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void changeDriverStatus() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getCustomerFeedback() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getDriveRecords() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getReportByDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getReportByRegion() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getTotalRevenue() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SetAvailableStatus() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void acceptBooking() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void callCustomer() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void customerFeedback() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getCustomerLocation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getMyCommission() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void raiseMoneyTransferRequest() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setUpYourVehicle() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addMoneytoWallet() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void bookCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void canceCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void findAride() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void raiseTicket() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void rateDriver() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void scheduleCab() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void signIn() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void signup() {
        // TODO Auto-generated method stub
        
    }
}
