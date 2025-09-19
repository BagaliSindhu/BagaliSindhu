package com.problems;

import java.util.*;

		public class Problem4 {
		    public static void main(String[] args) {
		        int[] nums = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

		        Map<Integer, Integer> result = new LinkedHashMap<>();

		       
		        for (int d = 1; d <= 9; d++) {
		            int count = 0;
		            for (int n : nums) {
		                if (n % d == 0) {
		                    count++;
		                }
		            }
		            result.put(d, count);
		        }

		        
		        StringBuilder sb = new StringBuilder("{");
		        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
		            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append(", ");
		        }

		        
		        if (sb.length() > 1) {
		            sb.setLength(sb.length() - 2);
		        }
		        sb.append("}");

		        
		        System.out.println(sb.toString());
		    }
		}
