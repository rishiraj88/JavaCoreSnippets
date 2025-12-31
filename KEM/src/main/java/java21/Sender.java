package java21;

import javax.crypto.KEM;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

public class Sender {

    public KEM.Encapsulated getEncapsulated(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        final var sendersKem = KEM.getInstance("DHKEM");
        final var sender = sendersKem.newEncapsulator(publicKey);
        return sender.encapsulate();
    }

}
