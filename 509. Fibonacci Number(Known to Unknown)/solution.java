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
import java.util.stream.*;

class Solution {
        //from known to unknown
        public List<Integer> fibArr = new ArrayList<>();

        public int fib(int n) {
            fibArr.add(0);
            fibArr.add(1);
            for(int  i=2;i<=n;i++){
                int curr= fibArr.get(i-1)+fibArr.get(i-2);
                fibArr.add(curr);
            }
            return fibArr.get(n);
        }
}
