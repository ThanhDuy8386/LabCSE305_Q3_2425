import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        var currentContract = client.requestCreateRentalContract();
        //System.out.println(currentContract.toString());
        String PropertyID = currentContract.propertyID;
        System.out.println(PropertyID);
        System.out.println("-----------------------");
        AES aes = new AES();
        String encryptedTenantID = aes.encrypt(PropertyID, "a");
        System.out.println("ENCRYPT: " + encryptedTenantID);
        System.out.println("-----------------------");
        String decryptedTenantID = aes.decrypt(encryptedTenantID, "a");
        System.out.println("DECRYPT "+decryptedTenantID);
    }
}
