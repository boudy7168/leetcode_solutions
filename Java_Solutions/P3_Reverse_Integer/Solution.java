package P3_Reverse_Integer;

public class Solution {
    public int reverse(int x) {
        int lowerlimit=(int) Math.pow(-2,31);
        int upperlimit=(int) Math.pow(2,31)-1;
        if(x>lowerlimit && x<upperlimit){
         System.out.println(x +"is bigger than" + lowerlimit +"and x is smaller than "+ upperlimit);   
        }
        else{
            return 0;
        }
        String num=Integer.toString(x);
        String reverse="";
        int rev=0;
       
        for(int i=num.length()-1;i>=0;i--){
reverse+=num.charAt(i);

        }
        long revi;
        if(reverse.indexOf('-')==-1){
             revi=Long.parseLong(reverse);
            
        }
        else{
            String reversecorrected="-"+reverse.substring(0,reverse.length()-1 );
              revi=Long.parseLong(reversecorrected);
        }
        // here i have them stored in long now we check for size 
        if(revi>lowerlimit && revi<upperlimit){
            System.out.println(revi +"is bigger than" + lowerlimit +"and revi is smaller than "+ upperlimit);   
            rev=(int) revi;
            return rev;
           }
           else{
             return 0;
           }

       

    }

    public static void main(String[] args) {
        Solution s=new Solution();
       System.out.println( s.reverse(1534236469));

    }
}