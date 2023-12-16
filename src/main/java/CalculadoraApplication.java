import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CalculadoraApplication {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        BigDecimal resultado = calculadora.somar(BigDecimal.ONE, BigDecimal.TEN);
        System.out.println("O Resultado foi: " + resultado);
    }
}