package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author: 邵禹寒
 * @date: 2021-10-08 17:30
 */
public class Lc187 {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 11) {
            return new ArrayList<>();
        }
        Set<String> set = new HashSet<>();
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < s.length() - 9; i++) {
            if (!set.add(s.substring(i, i + 10))) {
                ans.add(s.substring(i, i + 10));
            }
        }
        return new ArrayList<>(ans);
    }
}
