import buskata.BusDriver;
import buskata.Calculator;
import buskata.GossipExchanger;
import buskata.Ruta;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class CalculatorShould {

    @Test
    public void TodosLosCotilleosSonConocidosEnLaPrimeraParada()
    {

        Calculator calculator = new Calculator();

        Ruta ruta1 = new Ruta(3);
        Ruta ruta2 = new Ruta(3);

        int total_paradas = calculator.calcula(ruta1, ruta2);

        Assert.assertThat(total_paradas, is(1));
    }



}
