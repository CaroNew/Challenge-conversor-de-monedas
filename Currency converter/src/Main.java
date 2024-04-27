import api.conversor.models.CurrencyConversor;
import api.conversor.utils.SearchCurrency;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        boolean stop = true;
        //https://v6.exchangerate-api.com/v6/2b2163007b1c842b2f47d4b3/latest/USD
        //Seteando la monedas
        SearchCurrency currency = new SearchCurrency("GBP", "ARS");
        //Haciendo la busqueda
        CurrencyConversor search = currency.search();

        System.out.println(search.toString());


        //7. menu de usuario
        Scanner keyboard = new Scanner(System.in);

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

        while (stop) {
            System.out.println(msj);
            int opcion = keyboard.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                case 6:
                    System.out.println("opcion 6");
                    break;
                case 7:
                    stop = false;
                    System.out.println("Adiós!");
                    break;
            }

        }
    }
}