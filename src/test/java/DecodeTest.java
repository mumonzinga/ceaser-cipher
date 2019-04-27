
package test.java;
import main.java.Ceaser.Decode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptTest{

    public void encrypt_testLetterEncryption_String(){
        Decode testDecrypt = new Decode();
        String expectedOutput  = "H";
        assertEquals(expectedOutput, testDecrypt.decrypt("I", 1));
    }

