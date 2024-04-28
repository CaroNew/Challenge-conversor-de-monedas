package api.conversor.models;

import java.util.Scanner;

public class ConversorMenu {
    private String currency1 = "";
    private String currency2 = "";
    private float monto = 0;

    String menuMsg = """
                **************************************
                
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                | Bienvenido al conversor de monedas! |
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                
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
    String amountMsg = "Ingrese el monto a convertir: ";
    public boolean printMenu () {
        Scanner keyboard = new Scanner(System.in);
        String option;
        boolean stop = true;


        System.out.println(menuMsg);
        option = keyboard.nextLine();

        switch (option) {
            case "1":
                this.currency1 = "USD";
                this.currency2 = "ARS";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "2":
                this.currency1 = "ARS";
                this.currency2 = "USD";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "3":
                this.currency1 = "USD";
                this.currency2 = "BRL";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "4":
                this.currency1 = "BRL";
                this.currency2 = "USD";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "5":
                this.currency1 = "GBP";
                this.currency2 = "ARS";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "6":
                this.currency1 = "ARS";
                this.currency2 = "GBP";
                System.out.println(amountMsg);
                this.monto = keyboard.nextFloat();
                break;
            case "7":
                stop = false;
                System.out.println("Adiós!");
                break;
            default:
                System.out.println("Por favor, ingrese una opción válida\n");
        }

        return stop;
    }

    public String getCurrency1() {
        return currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public float getMonto(){
        return monto;
    }
}
