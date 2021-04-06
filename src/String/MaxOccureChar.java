package String;
//https://www.youtube.com/watch?v=iiA6Bag8UUE&ab_channel=SmartProgramming
public class MaxOccureChar {

    public static void main(String[] args) {

        String s="aabbccc";
        int[] arr=new int[127];

        for(int i=0;i<s.length();i++){

            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }

        int max=-1;
        char c=' ';
        for (int i=0;i<s.length();i++){

            if (max<arr[s.charAt(i)]){

                max=arr[s.charAt(i)];
                c=s.charAt(i);
            }

        }
        System.out.println("Max character of string is: "+c);
    }
}
