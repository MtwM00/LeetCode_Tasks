package Leetcode;

public class Task_981 {

    /**
     Task 981. Time Based Key-Value Store

     Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

     Implement the TimeMap class:

     TimeMap() Initializes the object of the data structure.
     void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
     String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp.
     If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".

     Constraints:

     1 <= key.length, value.length <= 100
     key and value consist of lowercase English letters and digits.
     1 <= timestamp <= 107
     All the timestamps timestamp of set are strictly increasing.
     At most 2 * 105 calls will be made to set and get.

     */

    public static void main(String[] args) {

        TimeMap timeMap = new TimeMap();

        timeMap.set("alice", "happy", 1);  // store the key "alice" and value "happy" along with timestamp = 1.
        System.out.println(timeMap.get("alice", 1));           // return "happy"
        System.out.println(timeMap.get("alice", 2));          // return "happy", there is no value stored for timestamp 2, thus we return the value at timestamp 1.
        timeMap.set("alice", "sad", 3);    // store the key "alice" and value "sad" along with timestamp = 3.
        System.out.println(timeMap.get("alice", 3));

    }

}
