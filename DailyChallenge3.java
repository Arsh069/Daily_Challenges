/*
LEETCODE-1578

Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
Bob can remove some balloons from the rope to make it colorful.
You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs to remove the ith balloon from the rope.
Return the minimum time Bob needs to make the rope colorful.
 */

import java.util.*;

public class DailyChallenge3 {
    HashMap<String,HashMap<Integer,String>> m;
    public TimeMap() {
        m=new HashMap<String, HashMap<Integer, String>>();
    }

    public void set(String key, String value, int timestamp) {
        if(!m.containsKey(key)){
            m.put(key,new HashMap<Integer,String>());
        }
        m.get(key).put(timestamp,value);
    }

    public String get(String key, int timestamp) {
        if(!m.containsKey(key)){
            return "";
        }

        for(int i=timestamp;i>=1;--i){
            if(m.get(key).containsKey(i)){
                return m.get(key).get(i);
            }
        }
        return "";
    }
}
