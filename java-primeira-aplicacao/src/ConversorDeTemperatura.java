public class ConversorDeTemperatura {
    public static void main(String[] args) {
        double temperatura = 24.5;
        double temperaturaConvertida = (temperatura * 1.8) + 32;
        String resultado = """
                A temperatura %.1fºC convertida para Fahrenheit (ºF) é:
                %.2fºF.
                """.formatted(temperatura, temperaturaConvertida);
        System.out.println(resultado);
    }
}
