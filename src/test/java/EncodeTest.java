package test.java;
import main.java.Ceaser.Encode;
import org.junit.jupiter.api.Test;
import org.testng.annotations.ITestAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class EncodeTest {

    @Test
    public void encrypt_testLetterEncryption_String() {
        Encode testEncrypt = new Encode();
        String expectedOutput = "I";
        assertEquals(expectedOutput, testEncrypt.encrypt("H", 1));
    }
    @Test
    public void encrypt_testWordEncryption_String(){
        Encode testEncrypt = new Encode();
        String expectedOutput  = "qfbs";
        assertEquals(expectedOutput, testEncrypt.encrypt("pear", 1));
    }
    @Test
    public void encrypt_testLetterCase_String(){
        Encode testEncrypt = new Encode();
        String expectedOutput  = "NbNb";
        assertEquals(expectedOutput, testEncrypt.encrypt("MaMa", 1));
    }
}