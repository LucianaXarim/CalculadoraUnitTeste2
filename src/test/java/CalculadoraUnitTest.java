import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;

public class CalculadoraUnitTest {

    //junit bilioteca java para escrita de testes unitarios

    //private Calculadora calculadora;

//    @BeforeEach
//    public void setup(){
//     Calculadora calculadora = new Calculadora();
//    }


    @Test
    public void somardoisNumeros(){
        Calculadora calculadora = new Calculadora();
        BigDecimal resultado = calculadora.somar(BigDecimal.ONE, BigDecimal.TEN);

        //Assertions.assertEquals(11, resultado.longValue());
        Assert.assertEquals(11,resultado.longValue() );


//        if (resultado.longValue() == 11) {
//            System.out.println("A soma passou no teste");
//        }else {
//            //System.out.println("A soma foi reprovada no teste");
//            throw new RuntimeException("A soma foi reprovada no teste") ;
//        }
    }

    @Test
    public void soma_de_um_mais_dez_deve_ser_igual_a_onze() {
        Calculadora calculadora = new Calculadora();
        BigDecimal resultado = calculadora.somar(BigDecimal.ONE, BigDecimal.TEN);

        Assert.assertEquals(11, resultado.longValue());
    }

    @Test
    public void soma_de_zero_mais_dez_deve_ser_igual_a_dez() {
        Calculadora calculadora = new Calculadora();
        BigDecimal resultado = calculadora.somar(BigDecimal.ZERO, BigDecimal.TEN);

        Assert.assertEquals(10, resultado.longValue());
    }

}
