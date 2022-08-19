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
    public String reverseWords(String s) {

        int left=0;
        int right= s.length()-1;
        char [] arr = s.toCharArray();

        // to remove trailing white space
        while(left<right&&arr[left]==' ')left++;
        //to remove ending white space
        while(right>left&&arr[right]==' ') right--;
        int start=left;
        int end=right;

        //reverse the whole string
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            right--;
            left++;
        }



        //fast and slow pointer to remove duplicate white space

        int leftidx=start;
        int rightidx=start;
        while(rightidx<=end){
            if(arr[rightidx]!=' '){
                arr[leftidx]=arr[rightidx];
                leftidx++;
                rightidx++;
            }else if(arr[rightidx]==' '&&arr[rightidx-1]!=' '){
                arr[leftidx]=arr[rightidx];
                leftidx++;
                rightidx++;
            }
            else{
                rightidx++;
            }
        }


        int newstart=start;
        int newend=start;

        //revert each wrod
        while(newend<leftidx){
            while(newend<leftidx&&arr[newend]!=' '){
                newend++;

            }
            //newend-1!= whitespace because newend is currently whitespace check line 51
            //but we also need to consider that we have some extra white space between words, when newend is out of bound, we also need to flip the word
            if((arr[newend-1]!=' '&&newend<arr.length&&(arr[newend]==' '||newend==leftidx))||(arr[newend-1]!=' '&&newend==arr.length)){
                int newend2=newend-1;

                while(newstart<newend2&&newend2<leftidx){

                    char temp = arr[newstart];
                    arr[newstart]=arr[newend2];
                    arr[newend2]=temp;
                    newstart++;
                    newend2--;

                }
                newstart= newend+1;
                newend++;
            }


        }

        return new String(arr,start,leftidx-start);

    }
}
