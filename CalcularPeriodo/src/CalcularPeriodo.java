import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);
		LocalDate dat = LocalDate.of(1990, Month.JANUARY, 1);
		LocalDate loc = LocalDate.of(2000, Month.DECEMBER, 25);
		LocalDate loco = LocalDate.of(2000, Month.DECEMBER, 24);
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de America", fecha);
		calcularPeriodo("El ano nuevo de 1990", dat);
		calcularPeriodo("La navidad del 2000", loc);
		calcularPeriodo("Antes de navidad del 2000", loco);
		
	}
	
	public static String calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrio hace %d anos, %d meses y %d dias.", anyos, meses, dias);
         
        System.out.println(texto);
        return texto;
    }
 
}
