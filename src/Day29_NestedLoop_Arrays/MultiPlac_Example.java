package Day29_NestedLoop_Arrays;

public class MultiPlac_Example {
    public static void main(String[] args) {

     /*  String word = "╭┈─────「\uD83E\uDD8B」" +"\n"+
                     "╰─┈➤Yᴏᴜ ᴀʀᴇ ᴍʏ ᴡʜᴏʟᴇ ʟɪғᴇ";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j <= i; j++) {

                    System.out.print(word.substring(j));

                }
              System.out.println();
            }


        String word = "Have  a good break!";
        for (int i = word.length(); i >0; i++){
            for (int j = 0; j >= i ; j++) {
                System.out.print(word.charAt(i));

            }
            System.out.println();
        }

         */

        String sentence = "java is fun";

        //for (int n = 5; n > 0; n--) {
            for (int i = 0; i < sentence.length(); i++) {
                for (int j = 0; j < i; j++) {

                    System.out.print(sentence.charAt(j));

                }
                //System.out.println();
                for (int k = sentence.length() - 1; k > i; k--) {
                    System.out.print(sentence.charAt(k));

                }
                System.out.println();

          //  }

        }
    }
}
