package P58_Length_of_Last_Word;

class Solution {
    public int lengthOfLastWord(String s) {
      int lastwordindex=s.trim().lastIndexOf(" ")+1 ;
      String lastword=s.trim().substring(lastwordindex);
return lastword.length();
    }
}
