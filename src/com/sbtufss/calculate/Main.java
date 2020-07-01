package com.sbtufss.calculate;

import com.sbtufss.calculate.symbols.MathPow2Symbol;
import com.sbtufss.calculate.symbols.MathPowSymbol;

/**
 * @author han.xue
 * @date 2020-07-01 16:10:10
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.getSymbolManager().add(new MathPowSymbol());
        calculator.getSymbolManager().add(new MathPow2Symbol());
        calculator.handleStr("(2 + 3.2)+3^2*( 40- 5+(-1)*4)");
        calculator.handleStr("2^2");
    }
}
