public class Contract {
    public String contractID;
    public String propertyID;
    public String tenantID;
    public int rentAmount;

    public Contract(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }
    @Override
    public String toString(){
        return "ContractID: " + contractID +"\n" + "PropertyID: " + propertyID +"\n"+ "TenantID: " + tenantID+"\n" + "RentAmount: " + rentAmount;
    }
}
