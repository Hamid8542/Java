package W1D5;

public class CoffeeBag {
	
	// Defining class constants
	
		static final double pricePerPound = 5.99;
		static final double taxRate = 7.25;

		public double totalPrice(int bagWeight, int numberOfBags, double pricePerLb) {
			return bagWeight * numberOfBags * pricePerLb;
		}

		public double totalPriceWithTax(double totalPrice, double taxRate) {

			return totalPrice + totalPrice * taxRate;
		}

	}



