import java.util.Scanner;

public class Haiku {
    public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

String[] lines=new String[3];

char[] vowels={'a','e','i','o','u'};

for(int i=0;i<3;i++){
    lines[i]=sc.nextLine();
}
int count1=0,count2=0,count3=0;

       for(char c:lines[0].toCharArray()){

           for(char v:vowels){
               if(v==c){
                   count1++;
               }

           }

       }
        for(char c:lines[1].toCharArray()){

            for(char v:vowels){
                if(v==c){
                    count2++;
                }

            }

        }
        for(char c:lines[2].toCharArray()){

            for(char v:vowels){
                if(v==c){
                    count3++;
                }

            }

        }

if(count1==5 && count2==7 && count3==5){
    System.out.println("YES");
}
else {
    System.out.println("NO");
}


    }
}