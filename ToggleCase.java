import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                str+=(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                str+=(Character.toUpperCase(ch));
            }
            else{
                str+=(ch);
            }
        }
        System.out.println(str.toString());
    }
}
