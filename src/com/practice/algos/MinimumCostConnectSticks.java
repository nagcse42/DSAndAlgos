package com.practice.algos;

import java.util.PriorityQueue;

/**
 * It will find the minimum cost for connecting sticks
 *
 * Input: [2,4,3]
 * Output: 14
 * Explanation : 2+3 = 5 (this new stick with value 5 will be added to sticks)
 *               5+4 = 9 (this new stick with value 9 will be added to sticks)
 *               Tot: 14(5+9) - total cost for connecting all sticks
 *
 * Input: [1,8,3,5]
 * Ouptput: 30
 * Explanation: 1+3 = 4(this stick with 4 value will be added to sticks)
 *              4+5 = 9 (new stick with value 9 added to sticks)
 *              8+9 = 17 (new stick with 17 will be added to sticks)
 *              Tot: 30 total cost for connecting all sticks
 */
public class MinimumCostConnectSticks {

    public static void main(String[] args) {
        int array1[]= {2,4,3};
        System.out.println("Min cost to connect {2,4,3} : "+getMinCostForConnectSticks(array1));

        int array2[]= {1,8,3,5};
        System.out.println("Min cost to connect {1,8,3,5} : "+getMinCostForConnectSticks(array2));
    }

    private static int getMinCostForConnectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> sticksQueue = new PriorityQueue<Integer>();
        for(int stick : sticks) {
            sticksQueue.add(stick);
        }

        while (sticksQueue.size() > 1) {
            int sum = sticksQueue.remove() + sticksQueue.remove();
            cost += sum;
            sticksQueue.add(sum);
        }

        return cost;
    }
}
