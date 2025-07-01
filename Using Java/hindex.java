import java.util.Scanner;

public class hindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of papers: ");
        int n = scanner.nextInt();

        int[] citations = new int[n];

        System.out.println("Enter the citation count for each paper:");
        for (int i = 0; i < n; i++) {
            citations[i] = scanner.nextInt();
        }

        Solution sol = new Solution();
        int hIndex = sol.hIndex(citations);

        System.out.println("The H-Index is: " + hIndex);

        scanner.close();
    }
}

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] h = new int[n + 1];

        for (int c : citations) {
            if (c >= n) {
                h[n]++;
            } else {
                h[c]++;
            }
        }

        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += h[i];
            if (count >= i) {
                return i;
            }
        }

        return 0;
    }
}
