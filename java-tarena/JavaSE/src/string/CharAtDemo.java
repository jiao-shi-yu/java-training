package string;

public class CharAtDemo {
    public static void main(String[] args) {
        //             0123456789
        String line = "helloworld";
        char c = line.charAt(5);
        System.out.println(c);
        //            0 1 2 34 5 67 8
        String str = "上海自来水自来海上";
        for(int i=0;i<str.length()/2;i++){
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length()-1-i);
            if(c1 != c2){
                System.out.print("不");
                break;
            }
        }
        System.out.println("是回文!");
    }
}

