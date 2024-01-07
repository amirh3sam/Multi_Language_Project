package Java.tasks;

public class LetterCount {


    public static void main(String[] args) {


        String str = "aaaerrtwwb";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char eachCharacter = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                char compareCharacter = str.charAt(j);
                if (eachCharacter == compareCharacter) {
                    count++;

                }

            }
            if (!result.contains(eachCharacter + "")) {
                result += eachCharacter + "" +count;
            }
        }
        System.out.println(result);

    }
}
