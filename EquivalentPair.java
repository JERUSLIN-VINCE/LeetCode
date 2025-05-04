PROBLEM: Number of Equivalent Domino Pairs
Statement:
      Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either
      (a == c and b == d),or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
     Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
Example:
      Input: prices[] = [7, 10, 1, 3, 6, 9, 2]
      Output: 8
     Explanation: You can buy the stock on day 2 at price = 1 and sell it on day 5 at price = 9. Hence, the profit is 8.

Solution:
     class EquivalentPair{
    public int maximumProfit(int prices[]) {
        int maxprofit=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
           if(prices[i]<min){
               min=prices[i];
           }
           else{
               int profit=prices[i]-min;
               maxprofit=Math.max(profit,maxprofit);
           }
            
           
        }
        return maxprofit;
    }
}
