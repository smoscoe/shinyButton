
public class Week2 {

	public static void main(String[] args) {
		// 
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoney = true;
		
		double costOfMilk = 1.69;
		double moneyInWallet = 15.45;
		int thirstLevel = 6;
		
		boolean shouldBuyIceCream = isHotOutside && hasMoney;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoney && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
		}
}