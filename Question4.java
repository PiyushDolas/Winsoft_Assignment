// Q4:Write a Java Program to find the duplicate characters in a string.

public class Question4{
    public static void main(String[] args) {
        String str = "Duplicate characters";
        char[] c = str.toCharArray();
        System.out.println("Duplicate Characters are:");

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(c[i] == c[j]){
                    System.out.print(c[j] + " ");
                    break;
                }
            }
        }
    }
}