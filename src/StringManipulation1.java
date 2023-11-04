public class StringManipulation1 {

    public static void main(String[] args) {

        String phrase = "Hoy es un dia bueno";

        String phrase_re = phrase.substring(1,3) + " phrase concatenada " + phrase.substring(1,3);

        System.out.println(phrase_re);

    }
}
