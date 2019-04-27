package main.java.Ceaser;


public class Decode {

    public static String decrypt(String encodedText, int key)
    {
        String decodedScript = "";
        String error ="";

        if (key<1 || key > 26) {
            error = "key must be between 1 to 25";
        }else {
            for (int i = 0; i < encodedText.length(); i++) {
                if (Character.isUpperCase(encodedText.charAt(i))) {
                    char ch = (char) (((int) encodedText.charAt(i) -
                            key));
                    if (ch < 'A') {
                        decodedScript += ((char) (encodedText.charAt(i) + (26 - key)));
                    } else {
                        decodedScript += (ch);
                    }
                } else if (Character.isLowerCase(encodedText.charAt(i))) {
                    char ch = (char) (((int) encodedText.charAt(i) -
                            key));
                    if (ch < 'a') {
                        decodedScript += ((char) (encodedText.charAt(i) + (26 - key)));
                    } else {
                        decodedScript += (ch);
                    }

                } else {

                    char ch = encodedText.charAt(i);

                    decodedScript += (ch);
                }

            }
            return decodedScript;
        }
        return error;
    }

}


