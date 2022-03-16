package easy.code058;

public class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        //[asdv]
        if (s1.length==1){
            return s1[0].length();
        }
        //[avb ]
        if (s1.length<=2){
            //"a "
            if (s1[1].equals("")){
                return s1[0].length();
            }
        }
        //[ aa aa aa ]
        if (s1[s1.length-1].length()==0){
            return s1[s1.length-2].length();
        }
        return s1[s1.length-1].length();
    }
}
