package easy.code020;

public  class Solution1 {
    public boolean isValid(String s) {
        String [] ss=new String[]{"()","[]","{}"};
        String sss=s;
        for (int i=0;i<sss.length()/2;i++){
            for (String temp:ss){
                s=s.replace(temp,"");
            }
        }

        if (s.length()==0){
            return true;
        }
        return false;
    }
}