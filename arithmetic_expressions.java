import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arithmeticExpressions function below.
    static String arithmeticExpressions(int[] arr) {
        int result = arr[0];
        String resultStr = "";
        int index = 0;
        int iOpers = 0;
        String[] opers = new String[]("*", "+", "-");
        applyOpers(arr, opers, index, iOpers, resultStr, result);
    }

    static String applyOper(int[] arr, String[] opers, int index, int iOpers, String resultStr, int result) {
        if (iOpers < opers.length) {
            applyOper(arr, opers[iOpers], arr[index], index, resultString, result);
            if (resultStr.equals("NOTFOUND")) {
                iOpers++;
                index = 0;
                result = arr[index];
                resultString = "";
                applyOper(arr, opers[iOpers], arr[index], index, resultString, result);
            } else {
                return resultString;
            }
        }
    }
    static String applyOper(int[] arr, String oper, int one, int index, String resultStr, int result) {
        switch(oper) {
            case "*": 
                result = result * arr[index]; 
                resultStr = resultStr + '*' + arr[index]; 
            case "+": 
                result = result + arr[index]; 
                resultStr = resultStr + '+' + arr[index]; 
            case "-": 
                if (result > arr[index]) {
                    result = result - arr[index]; 
                    resultStr = resultStr + '-' + arr[index]; 
                } else {
                    resultStr = "NOTFOUND";
                    return resultString;
                }
            default: break;
        }
        index += 1;
        if (index >= arr.length) {
            if (result % 101 == 0) {
                return resultStr;
            }
            resultStr = "NOTFOUND";
            return resultStr;
        }
        return applyOper(arr, oper, arr[index], index, resultStr, result); 
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        String result = arithmeticExpressions(arr);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
