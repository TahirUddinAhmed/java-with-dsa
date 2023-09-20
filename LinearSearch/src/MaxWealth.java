public class MaxWealth {
    public static void main(String[] args) {
        int[][] acc = {
                {1,2,3},
                {3,2,1},
                {4, 8, 12}
        };
        System.out.println(maximumWealth(acc));
    }

    static int maximumWealth(int[][] accounts) {
      if(accounts.length == 0) {
          return 0;
      }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int add = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                add += accounts[i][j];
            }
            // when you come out of the column
            if(add > ans) {
                ans = add;
            }
        }

        return ans;
    }
}
