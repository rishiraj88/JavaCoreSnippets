package java21;

import javax.crypto.DecapsulateException;
import javax.crypto.KEM;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;

public class Receiver {

public byte[] getKey(KEM.Encapsulated encapsulated, PrivateKey privateKey) throws NoSuchAlgorithmException, InvalidKeyException, DecapsulateException {
        // Create a new instance of the KEM with the algorithm name "DHKEM"
        final var receiversKem = KEM.getInstance("DHKEM");
        // Create a new Decapsulator using the private key
        final var receiver = receiversKem.newDecapsulator(privateKey);
        // Decapsulate the encapsulated key
        final var receivedSecretKey = receiver.decapsulate(encapsulated.encapsulation());
        // Return the encoded secret key
        return receivedSecretKey.getEncoded();
    }

}
