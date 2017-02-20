/*
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size()<2) return intervals;
        List<Interval> res = new LinkedList<Interval>();
        //Lambda fuction, to sort intervals with start
        intervals.sort((l1, l2) -> Integer.compare(l1.start, l2.start));
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for(Interval interval: intervals){
            if(interval.start <= end){
                end = Math.max(end, interval.end);
            }
            else{
                res.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        res.add(new Interval(start, end));
        return res;
    }
}
