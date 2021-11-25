package learningPackage;

import java.math.BigDecimal;

public class SimpleIntrest {

	private BigDecimal principal;
	private BigDecimal interestRate;

	public SimpleIntrest(String principal, String interestRate) {

		this.principal = new BigDecimal(principal);
		this.interestRate = new BigDecimal(interestRate);

	}

	BigDecimal calculateTotalValue(int Year) {

		BigDecimal totalAmount = principal
				.add(principal.multiply(interestRate).multiply(new BigDecimal(Year)).divide(new BigDecimal(100)));
		return totalAmount;
	}

}
