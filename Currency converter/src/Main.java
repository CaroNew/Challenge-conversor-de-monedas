import api.conversor.models.CurrencyConversor;
import api.conversor.utils.SearchCurrency;
import api.conversor.utils.Calculator;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        boolean stop = true;
        String currency1 = "";
        String currency2 = "";
        float monto = 0;

        //7. menu de usuario
        Scanner keyboard = new Scanner(System.in);
        SearchCurrency currency;
        CurrencyConversor search;

        String msj = """
                **************************************
                ---------------------------------------
                | Bienvenido al conversor de monedas! |
                ---------------------------------------
                
                Ingrese la opción deseada:
                
                1. Dólar (USA) -> Peso (ARG)
                2. Peso (ARG) -> Dólar (USA)
                3. Dólar (USA) -> Real (BR)
                4. Real (BR) -> Dólar (USA)
                5. Libra (UK) -> Peso (ARG)
                6. Peso (ARG) -> Libra (UK)
                7. Salir
                *************************************** 
                """;
        String msj2 = "Ingrese el monto a convertir: ";

        while (stop) {
            System.out.println(msj);
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    currency1 = "USD";
                    currency2 = "ARS";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 2:

                    currency1 = "ARS";
                    currency2 = "USD";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 3:
                    currency1 = "USD";
                    currency2 = "BRL";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 4:
                    currency1 = "BRL";
                    currency2 = "USD";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 5:
                    currency1 = "GBP";
                    currency2 = "ARS";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 6:
                    currency1 = "ARS";
                    currency2 = "GBP";
                    System.out.println(msj2);
                    monto = keyboard.nextFloat();
                    break;
                case 7:
                    stop = false;
                    break;

            }

            if (!currency1.isEmpty()){
                currency = new SearchCurrency(currency1, currency2);
                search = currency.search();
                float result = new Calculator().currencyCalculator(monto, search.conversion_rate());
                System.out.println("\nEl monto es: " + search.target_code() + " " + result + "\n");
            }

        }

    }
}