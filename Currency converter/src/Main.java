import api.conversor.models.ConversorMenu;
import api.conversor.models.CurrencyConversor;
import api.conversor.utils.SearchCurrency;
import api.conversor.utils.Calculator;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        SearchCurrency currency;
        CurrencyConversor search;
        ConversorMenu menu;
        boolean stop = true;
        String currency1 = "";
        String currency2 = "";
        float monto = 0;

        menu = new ConversorMenu();

        while (stop) {
            //7. menu de usuario
            stop = menu.printMenu();
            currency1 = menu.getCurrency1();
            currency2 = menu.getCurrency2();
            if (!currency1.isEmpty()){
                currency = new SearchCurrency(currency1, currency2);
                search = currency.search();
                float result = new Calculator().currencyCalculator(menu.getMonto(), search.conversion_rate());
                System.out.println("\nEl monto es: " + search.target_code() + " " + result + "\n");
            }

        }

    }
}