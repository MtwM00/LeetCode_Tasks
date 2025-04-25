package Leetcode;

import java.util.*;

public class TimeMap {

    private Map<String, TreeMap<Integer, String>> keyStore;

    public TimeMap() {
        keyStore = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyStore.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {

        if (!keyStore.containsKey(key)) return "";

        TreeMap<Integer, String> timestamps = keyStore.get(key);
        Map.Entry<Integer, String> entry = timestamps.floorEntry(timestamp);
        if (entry == null) return "";
        else return entry.getValue();
    }


}
