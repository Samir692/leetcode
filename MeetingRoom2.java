/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class MeetingRoom2 {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: the minimum number of conference rooms required
     */
    public int minMeetingRooms(List<Interval> intervals) {
        // Write your code here
        int n = intervals.length();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++){
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int res = 0, count = 0;
        int s = 0, e = 0;

        while(s < n){
            if(start[s] < end[e]){
                count += 1;
                s += 1;
            }
            else{
                count -= 1;
                e += 1;
            }
            res = Math.max(res, count);
        }
        return res;
    }
}
