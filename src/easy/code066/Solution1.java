package easy.code066;

/**
 * Error
 */
class Solution1 {
    public int[] plusOne(int[] digits) {
        //digits = [4,3,2,1]
        int []te=digits.clone();
        for (int i = digits.length - 1; i >= 0; i--) {
            //[9]
            if (te[i] + 1 == 10) {
                if (i != 0) {
                    te[--i] += 1;
                } else {
                    te[i] = 0;
                }
            }else if (te[i] == 10) {
                te[i] = 0;
            } else {
                te[i] = te[i] + 1;
                break;
            }
        }
        if (te[0] == 0) {
            int[] ints = new int[te.length + 1];
            for (int i = 0; i < te.length; i++) {
                ints[i + 1] = te[i];
            }
            ints[0] = 1;
            return ints;
        }
        return te;
    }
}