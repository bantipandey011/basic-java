package String;

public class CountVowels {
    public static void main(String[] args) {
        String str="jgxssydcxbsywwkjdrwaekjdudoipwsofrsgvxblaaaaaaajkaudjpeo;dqooiiaiyuajejesdgeuildgwwksdwwywjhwj";
        int count=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
