package Cryptography;

import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Miner{
    public boolean Verify(String message, String signatureDocument, PublicKey publicKey) throws Exception{
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(publicKey);
        publicSignature.update(message.getBytes(UTF_8));

        byte[] signatureBytes = Base64.getDecoder().decode(signatureDocument);

        return publicSignature.verify(signatureBytes);
    }
}
