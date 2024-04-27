package api.conversor.utils;

public class Calculator {

    public float currencyCalculator(float monto, String rate){
        float currentRate = 0;

        try {
            currentRate = Float.parseFloat(rate);
            return monto * currentRate;
        } catch (NumberFormatException e){
            System.out.println("Error de conversion: " + e.getMessage());
        }

        return 0;
    }
}
