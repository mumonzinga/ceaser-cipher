package main.java.Ceaser;



public class Encode {



    public static String encrypt(String text, int s)

    {

        String outcome= "";
        String error=" ";

        if (s<1 || s > 26) {
            error = "key must be between 1 to 25";
        }else {

            for (int i = 0; i < text.length(); i++) {
                if (Character.isUpperCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            s));

                    if (ch > 'Z') {
                        outcome += ((char) (text.charAt(i) - (26 - s)));
                    } else {
                        outcome += (ch);
                    }

                } else if (Character.isLowerCase(text.charAt(i))) {
                    char ch = (char) (((int) text.charAt(i) +
                            s));

                    if (ch > 'z') {
                        outcome += ((char) (text.charAt(i) - (26 - s)));
                    } else {
                        outcome += (ch);
                    }

                } else {

                    char ch = text.charAt(i);
                    outcome += (ch);

                }
            }
            return outcome;
        }

        return error;
    }

}