import api.conversor.models.CurrencyConversor;
import api.conversor.utils.SearchCurrency;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {


    public static void main(String[] args) {
        //https://v6.exchangerate-api.com/v6/2b2163007b1c842b2f47d4b3/latest/USD
        //Seteando la monedas
        SearchCurrency currency = new SearchCurrency("GBP", "ARS");
        //Haciendo la busqueda
        CurrencyConversor search = currency.search();

        System.out.println(search.toString());


        //7. menu de usuario

    }
}