package com.wyu._01array_31.a0208;

public class lc495 {
    public static void main(String[] args) {
        int[] timeSeries = {1,4};
        Solution495 s = new Solution495();
        int poisonedDuration = s.findPoisonedDuration(timeSeries, 2);
        System.out.println(poisonedDuration);
    }
}
class Solution495 {
//    timeSeries为非递减（可不连续） ant为总中毒时间数，expired为中毒起始时间
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ant = 0;
        int expired = 0;
/**    分两种情况：
 *      1：若expired<timeSeries[i]，说明并未中毒，那么ant为中毒时间duration
 *      2：否则，说明以中毒，需要重置中毒时间
 *
 */
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries[i]>=expired){
                ant += duration;
            }else {
                ant += timeSeries[i]+duration-expired;
            }
            expired = timeSeries[i]+duration;
        }
        return ant;
    }
}