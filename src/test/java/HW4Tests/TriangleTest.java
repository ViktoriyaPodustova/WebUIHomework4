package HW4Tests;

import HomeWork4.TriangleArea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class TriangleTest {
    @Test
    @DisplayName("Положительная проверка вычисляемой площади треугольника по формуле Герона")
    void givenSidesOfTriangleWhenCallHeronsFormulaThenAreaOfTriangle() {
        double result = TriangleArea.HeronsFormula(3, 4, 5);
        Assertions.assertEquals(result,6.0);
    }
    @Test
    @DisplayName("Негативная проверка с использованием нулевого значения")
    void HeronsFormulaTest1(){
        double result = TriangleArea.HeronsFormula(0, 4, 5);
        Assertions.assertEquals(result,0.0);
    }
    @Test
    @DisplayName("Проверка вырожденного треугольника")
    void HeronsFormulaTest2(){
        double result = TriangleArea.HeronsFormula(3, 4, 8);
        Assertions.assertEquals(result,0.0);
    }
    @Test
    @DisplayName("Негативная проверка с использованием отрицательного значения")
    void HeronsFormulaTest3(){
        double result = TriangleArea.HeronsFormula(3, -7, 5);
        Assertions.assertEquals(result,0.0);
    }
}
