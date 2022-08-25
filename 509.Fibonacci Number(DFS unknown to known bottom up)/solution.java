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
    public int fib(int n) {

        if (n <= 1) {
            return n;
        }
        int answer = fib(n - 1) + fib(n - 2);

        return answer;

    }
}