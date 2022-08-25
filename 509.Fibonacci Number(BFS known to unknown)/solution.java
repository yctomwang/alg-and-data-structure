import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;

class Solution {
    private Queue<Integer> fibQueue= new ArrayDeque<>();
    private List<Integer> fibArr = new ArrayList<>();
    //BFS approach
    //from known to unknown
    public int fib(int n) {
        fibArr.add(0);
        fibArr.add(1);
        fibQueue.offer(2);
        while(!fibQueue.isEmpty()){
            int curr=fibQueue.poll();
            int fibCurr=fibArr.get(curr-1)+fibArr.get(curr-2);
            fibArr.add(fibCurr);
            if(curr<=n){
                fibQueue.offer(curr+1);
            }
        }
        return fibArr.get(n);
    }
}
