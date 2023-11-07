import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes da classe Calculadora")
public class CalculadoraTest {

  @Test
  @DisplayName("Teste do metodo somar")
  public void testeSomar() {
    Calculadora cal = new Calculadora();
    assertEquals(34, cal.somar(32, 2));
  }

  @Test
  @DisplayName("Teste do metodo subtrair")
  public void TesteSbtrair() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("Teste do metodo dividir")
  public void testeDividir() {
    Calculadora cal = new Calculadora();
    assertEquals(3, cal.dividir(6, 2));
  }

  @Test
  @DisplayName("Teste de excecao do metodo dividir")
  public void testeDividirExcecao() {
    Calculadora cal = new Calculadora();
    assertThrows(ArithmeticException.class, () -> {
      cal.dividir(3, 0);
    });
  }
}

