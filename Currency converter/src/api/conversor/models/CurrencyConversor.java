package api.conversor.models;

public record CurrencyConversor(String target_code, String conversion_rate) {

    @Override
    public String toString() {
        return "CurrencyConversor{" +
                "target_code='" + target_code + '\'' +
                ", conversion_rate='" + conversion_rate + '\'' +
                '}';
    }
}
