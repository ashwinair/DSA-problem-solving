package Array;

//You are given an m x n integer grid accounts where accounts[i][j]is the amount of money
//the ith customer has in the jth bank.Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
public class richestWealth {
    public void main() {
        int[][] nums = {{1, 2, 3}, {3, 2, 1}};
        maximumWealth(nums);
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;


        for (int[] account : accounts) {
            int temp = 0;
            for (int i : account) {
                temp += i;
            }
            maxWealth = Math.max(maxWealth, temp);
        }
        return maxWealth;
    }
}
