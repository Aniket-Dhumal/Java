import java.util.Arrays;

public class GoodSubsequences {
    public static int countGoodSubsequences(String s) {
        final int MOD = 1000000007;
        int n = s.length();
        
        // Initialize the count of characters
        int[] charCount = new int[26];
        
        // Calculate the frequency of each character
        for (char c : s.toCharArray()) {
            int charIdx = c - 'a';
            charCount[charIdx]++;
        }
        
        // Initialize the dynamic programming array
        int[] dp = new int[n + 1];
        
        // Initialize the base case for empty subsequence
        dp[0] = 1;
        
        // Initialize an array to store the last index of each character
        int[] lastIdx = new int[26];
        Arrays.fill(lastIdx, -1);
        
        // Iterate through each character and calculate dp values
        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % MOD;
            
            int charIdx = s.charAt(i - 1) - 'a';
            
            // If the current character appeared before, subtract the previous contribution
            if (lastIdx[charIdx] != -1) {
                dp[i] = (dp[i] - dp[lastIdx[charIdx] - 1] + MOD) % MOD;
            }
            
            // Update the last index of the current character
            lastIdx[charIdx] = i - 1;
        }
        
        // Calculate the total count of good subsequences
        int totalGoodSubsequences = (dp[n] - 1 + MOD) % MOD;
        
        return totalGoodSubsequences;
    }

    public static void main(String[] args) {
        String[] testCases = {"abca", "abcd", "baab"};
        for (String inputString : testCases) {
            int result = countGoodSubsequences(inputString);
            System.out.println("Input: " + inputString + ", Output: " + result);
        }
    }
}
