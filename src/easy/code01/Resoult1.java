
import java.util.HashMap;

/**
 * 3999 / 3999 个通过测试用例
 * 状态：通过
 * 执行用时: 6 ms
 * 内存消耗: 41.6 MB
 */
public class Resoult1 {
    public int romanToInt(String s) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        if (s.length() == 1) {
            return map.get(s);
        }
        int num = 0;
        for (int i = 0; i < s.length() ; i++) {
            if (i==s.length()-1 ){
                num += map.get(String.valueOf(s.charAt(i)));
            }else {
                if (map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i+1)))) {
                    num -= map.get(String.valueOf(s.charAt(i)));
                }  else {
                    num += map.get(String.valueOf(s.charAt(i)));
                }
            }

        }
        return num;
    }
}
