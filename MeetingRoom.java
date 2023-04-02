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

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    
  public boolean canAttendMeetings(List<Interval> intervals) {
          // Write your code here
          intervals.sort(Collections.compareInt(s -> s.start));

          for(int i = 0; i < intervals.length(); i++){
              int i1 = intervals[i-1];
              int i2 = intervals[i];

              if(i1.end > i2.start){
                  return false;
              }
          }
          return true;
      }
}
