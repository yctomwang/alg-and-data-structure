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
    private List<Integer> numArr= new ArrayList<>(Arrays.asList(0,1));
    //top down DFS(from known to unknown)
    public int fib(int n) {
        if(n<2){
            return numArr.get(n);
        }
        dfs(2,n);
        return numArr.get(n);
    }

    //backtracking appraoch using global variable
    public void dfs(int i, int n){
        if(i>n){
            return;
        }
        int curr= numArr.get(i-1)+numArr.get(i-2);
        numArr.add(curr);
        dfs(i+1,n);

    }
}