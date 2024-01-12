package Java.tasks;

public class FirstTwoLetterRemoveAddToLast {


    public static void main(String[] args) {


        //String str =""; -=-> return null 1- null
        //String str ="H" -->return "H"  2- length 1
        //String str ="HI" -->return "IH"  3- length 2
        //String str = "HIME" --> return "MEHI" 4- length more than 2
        //String str = "HELLOME" -- > return HELLOME"


        String str = "HELLOME";
        System.out.println(firstRemove(str));
    }


    public static String firstRemove(String str){



        if(str.isEmpty() || str.length() == 1){
            return str;
        }
        else if(str.length() == 2){  //index 0  - 1

            String firstLetter = str.substring(1);
            return firstLetter + str.substring(0,1);
        }
        String firstTwoLetter = str.substring(2);
        return firstTwoLetter + str.substring(0,2);
    }
}
