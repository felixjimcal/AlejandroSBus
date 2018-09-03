package feature;

import buskata.Calculator;
import buskata.Ruta;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class ConocerTotalParadasFeature {

    @Test
    public void NumeroDeParadasParaQueTodosLosConductoresTengaTodosLosCotilleos()
    {

        Ruta ruta1 = new Ruta(3,1,2,3);
        Ruta ruta2 = new Ruta(3,2,3,1);
        Ruta ruta3 = new Ruta(4,2,3,4,5);

        Calculator calculator = new Calculator();
        int total_stops = calculator.calcula(ruta1, ruta2, ruta3);
        Assert.assertThat( total_stops,is(5));
    }



}
