package Java.tasks;

public class FrequencyOfWord {
    public static void main(String[] args) {


        String s = "Python Java java Python C++ C++ Java C# Python ";


        String t = s.replace("Python", "abcdefg");

        int frequencyOfPython = t.length() - s.length();

        System.out.println("frequencyOfPython = " + frequencyOfPython);

    }
}
