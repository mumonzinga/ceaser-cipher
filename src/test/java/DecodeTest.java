
package test.java;
import main.java.Ceaser.Decode;
import org.junit.jupiter.api.Test;
import org.testng.annotations.ITestAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeTest {
    @Test
    public void encrypt_testLetterEncryption_String() {
        Decode testDecrypt = new Decode();
        String expectedOutput = "H";
        assertEquals(expectedOutput, testDecrypt.decrypt("I", 1));
    }

    @Test
    public void encrypt_testWordEncryption_String() {
        Decode testDecrypt = new Decode();
        String expectedOutput = "pear";
        assertEquals(expectedOutput, testDecrypt.decrypt("qfbs", 1));
    }

    @Test
    public void encrypt_testLetterCase_String() {
        Decode testDecrypt = new Decode();
        String expectedOutput = "MaMa";
        assertEquals(expectedOutput, testDecrypt.decrypt("NbNb", 1));
    }

    @Test
    public void encrypt_testSentenceEncryption_String() {
        Decode testDecrypt = new Decode();
        String expectedOutput = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expectedOutput, testDecrypt.decrypt("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 23));
    }

    @Test
    public void encrypt_testOtherCharacterEncryption_String() {
        Decode testDecrypt = new Decode();
        String expectedOutput = "abc25!";
        assertEquals(expectedOutput, testDecrypt.decrypt("bcd25!", 1));
    }
}