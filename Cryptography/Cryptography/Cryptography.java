package Cryptography;


public class Cryptography {
    public static void main(String[] args) throws Exception {
        User x = new User();
        String data = "The password is 759864";
        String signatureDocument = x.Signature(data,x.privateKey);

        Miner m = new Miner();

        if(m.Verify(data,signatureDocument,x.publicKey)){
            System.out.println("Yes, this is Valid");
        }else{
            System.out.println("This is invalid");
        }

    }
}
