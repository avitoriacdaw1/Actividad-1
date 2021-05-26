import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void testCalcularPeriodo() {
		CalcularPeriodo odo = new CalcularPeriodo();
		LocalDate fec = LocalDate.of(1492, Month.OCTOBER, 12);
		String tes = CalcularPeriodo.calcularPeriodo("El descubrimiento de America", fec);
		System.out.println(tes);
		String res = "El descubrimiento de America ocurrio hace 528 anos, 7 meses y 13 dias.";
		assertEquals(res,tes);
	}

}
