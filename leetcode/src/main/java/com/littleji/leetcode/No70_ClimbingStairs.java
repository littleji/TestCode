package com.littleji.leetcode;
import com.littleji.leetcode.utils.BinaryNode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jimmy on 2016/10/25.
 */
public class No70_ClimbingStairs {
    int result;
    public HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public int climbStairs(int n) {
        doit(n);
        return result;
    }
    public void doit (int last){
        if (last == 0){
            this.result++;
            return ;
        }
        else if (last <0)
            return;
        else{
            if (map.get(last) == null){
                doit(last-1);
                doit(last-2);
                map.put(last,result);
            }
            else
                result += map.get(last);
            return;
        }
    }
    int anotherclimbStairs(int n)
    {
        if (n < 4) return n;
        int a = 2, b = 3, c = 5;
        for (int i = 5; i <= n; i++)
        {
            a = c;
            c = b+c;
            b = a;
        }
        return c;
    }
}
