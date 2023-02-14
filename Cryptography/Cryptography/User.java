package Cryptography;

import java.security.*;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

public class User {
    KeyPairGenerator generator ;
    KeyPair pair;

    PublicKey publicKey;
    PrivateKey privateKey;
    User() throws Exception {
        generator = KeyPairGenerator.getInstance("RSA");
        pair = generator.generateKeyPair();
        generator.initialize(2048);
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }
    public String Signature(String message,PrivateKey privateKey) throws Exception {
        byte[] data = message.getBytes(UTF_8);
        Signature MySignature = Signature.getInstance("SHA256WithRSA");
        MySignature.initSign(privateKey);
        MySignature.update(data);
        byte[] signatureData = MySignature.sign();

        return Base64.getEncoder().encodeToString(signatureData);
    }
    public static void main(String[] args) {

    }
}
