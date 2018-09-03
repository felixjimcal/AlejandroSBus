package buskata;

public class Calculator {


    public int calcula(Ruta... rutas)
    {
        int value = 0;

        if(rutas[0].paradas[0] == rutas[1].paradas[0])
        {
            value = 1;
        }

        return value;
    }
}
