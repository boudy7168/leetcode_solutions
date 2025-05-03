package P2_add_two_numbers;


 
 

public class P2_add_two_numbers {
    public ListNode add_two_numbers(ListNode l1,ListNode l2){
String ll1="";
String ll2="";
ListNode currentl1=l1;
ListNode currentl2=l2;
for(int i=0;i<101;i++){
if(currentl1.next!=null){
ll1+=currentl1.val;
currentl1=currentl1.next;
}
//here we have the first number stored in a string 
    }
ll1+=currentl1.val;

for(int i=0;i<101;i++){
    if(currentl2.next!=null){
    ll2+=currentl2.val;
    currentl2=currentl2.next;
    }
    //here we have the second number stored in a string 
        }
        ll2+=currentl2.val;
        // string reverse
        String reversedll1 = "";
        for (int i = ll1.length() - 1; i >= 0; i--) {
            reversedll1 += ll1.charAt(i);
        }
        //string reverse end
           // string reverse
           String reversedll2 = "";
           for (int i = ll2.length() - 1; i >= 0; i--) {
               reversedll2 += ll2.charAt(i);
           }
           //string reverse end
        System.out.println("here"+reversedll2);
        System.out.println("here"+reversedll1);
        int numl1 = Integer.parseInt(reversedll1);
        int numl2 = Integer.parseInt(reversedll2);

    int result=numl1+numl2;
    String resultt = String.valueOf(result);
    System.out.println("result"+resultt);//till here correct
    String reversedresult = "";
    for (int i = resultt.length() - 1; i >= 0; i--) {
        reversedresult += resultt.charAt(i);
    }
    System.out.println(reversedresult);
   ListNode currentnode= new ListNode(reversedresult.charAt(0)- '0');
   ListNode head=currentnode;
   System.out.println(reversedresult.charAt(0)- '0');
   for(int i=1;i<resultt.length();i++){
    ListNode l3=new ListNode(reversedresult.charAt(i)- '0');
    System.out.println(reversedresult.charAt(i)+"i="+i);
    currentnode.next=l3;
    currentnode=l3;
}

return head;



    }




public static void main(String[] args){
    P2_add_two_numbers p=new P2_add_two_numbers();
    ListNode l1=new ListNode(3);
    ListNode l2=new ListNode(4,l1);
    ListNode l3=new ListNode(2,l2);
    
    ListNode l4=new ListNode(4);
    ListNode l5=new ListNode(6,l4);
    ListNode l6=new ListNode(5,l5);
    System.out.println(p.add_two_numbers(l3,l6));
}
}