package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	@Test
	public void constructorShouldCreateObjectWhenValidData() {

		Financing f = new Financing(100000.0, 2000.00, 80);

		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());

	}

	@Test
	public void constructorShouldThrowillegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(180000.0, 2000.00, 80);
		});

	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.00, 80);

		f.setTotalAmount(90000.0);
		Assertions.assertEquals(90000.0, f.getTotalAmount());

	}

	@Test
	public void setTotalAmountShouldThrowillegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.00, 80);
			f.setTotalAmount(190000.0);

		});

	}
	
	
	@Test
	public void setIncomeShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.00, 80);

		f.setIncome(2100.0);
		Assertions.assertEquals(2100.00, f.getIncome());

	}

	@Test
	public void setIncomeShouldThrowillegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.00, 80);
			f.setIncome(1800.0);

		});

	}
	
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.00, 80);

		f.setMonths(85);
		Assertions.assertEquals(85, f.getMonths());

	}

	@Test
	public void setMonthsShouldThrowillegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.00, 80);
			f.setMonths(65);

		});

	}
	
	@Test
	public void entryShouldCalculatedEntryCorrctly() {
		Financing f = new Financing(100000.0, 2000.00, 80);
	Assertions.assertEquals(20000.00,f.entry());
	}
	
	
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing f = new Financing(100000.0, 2000.00, 80);
		Assertions.assertEquals(1000.0,f.quota());
	}

}
