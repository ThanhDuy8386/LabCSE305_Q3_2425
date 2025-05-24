public class Client {
    Contract requestCreateRentalContract() {
        var contract = new LongTerm();
        contract.buildContractID("1").buildPropertyID("2").buildRentAmount(3000);
        return contract.signContract();
    };
}
