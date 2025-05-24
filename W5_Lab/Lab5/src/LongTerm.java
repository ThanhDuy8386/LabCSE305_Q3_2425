public class LongTerm implements ContractBuilder {
    public String ContractID;
    public int RentAmount;
    public String TenantID;
    public String PropertyID;
    @Override
    public ContractBuilder buildContractID(String contractID) {
        this.ContractID = "Long term "+contractID;
        return this;
    }
    @Override
    public ContractBuilder buildPropertyID(String propertyID) {
        this.PropertyID = propertyID;
        return this;
    }
    @Override
    public ContractBuilder buildTenantID(String tenantID) {
        this.ContractID = tenantID;
        return this;
    }
    @Override
    public ContractBuilder buildRentAmount(int rentAmount) {
        this.RentAmount = rentAmount;
        return this;
    }
    @Override
    public Contract signContract() {
        return new Contract(ContractID, PropertyID, TenantID, RentAmount);
    }
    @Override
    public String toString() {
        return "LongTerm [ContractID=" + ContractID + ", RentAmount=" + RentAmount + ", TenantID=" + TenantID
                + ", PropertyID=" + PropertyID + "]";
    }
}
