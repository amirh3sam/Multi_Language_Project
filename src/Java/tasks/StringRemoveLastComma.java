package Java.tasks;

public class StringRemoveLastComma {


    public static void main(String[] args) {

        String str = "Amir";
        String result = "";


        for (int i = 0 ;i < str.length() ; i++){

           if(i != str.length()-1){
               result += str.charAt(i)+ ", ";
           }
           else {
               result+= str.charAt(i);
           }
        }

        System.out.println(result);


        // OR you can do ternary operator
        //result = (condition) ? valueIfTrue : valueIfFalse;

        String result2 = "";
        for (int i = 0 ;i < str.length() ; i++) {
            result2 += (i != str.length() - 1) ? str.charAt(i)+ ", " : str.charAt(i);
        }
        System.out.println(result2);
    }

}
