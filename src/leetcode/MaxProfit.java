package leetcode;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = { 2, 2, 5 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int indexMin = -1, indexMax = -1, totalProfit = 0;

		if (prices.length < 2)
			return 0;

		if (prices[1] > prices[0]) {
			indexMin = 0;
		} else if (prices[1] < prices[0]) {
			indexMax = 0;
		}
		for (int i = 1; i < prices.length; i++) {
			if (i == prices.length - 1) {
				if (prices[i] > prices[i - 1]) {
					indexMax = i;
				} else {
					indexMin = i;
				}
			}

			else if (prices[i] == prices[i - 1] && prices[i] == prices[i + 1]) {
				// Do nothing
			}

			else if (prices[i] >= prices[i - 1] && prices[i] >= prices[i + 1]) {
				indexMax = i;
			} else if (prices[i] <= prices[i - 1] && prices[i] <= prices[i + 1]) {
				indexMin = i;
			}

			if (indexMax > 0 && indexMin >= 0 && indexMax > indexMin) {
				totalProfit += prices[indexMax] - prices[indexMin];
				indexMax = indexMin = -1;
			}
		}
		return totalProfit;

	}
}
