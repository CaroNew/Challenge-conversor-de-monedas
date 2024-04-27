package api.conversor.models;

public record CurrencyConversor(String target_code, String conversion_rate) {

    @Override
    public String conversion_rate() {
        return conversion_rate;
    }

    @Override
    public String target_code() {
        return target_code;
    }

    @Override
    public String toString() {
        return "CurrencyConversor{" +
                "target_code='" + target_code + '\'' +
                ", conversion_rate='" + conversion_rate + '\'' +
                '}';
    }
}
