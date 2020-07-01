package com.sbtufss.calculate.symbols;

import com.sbtufss.calculate.enums.SymbolPriority;

/**
 * @author han.xue
 * @date 2020-07-01 17:19:19
 */
public class MathPow2Symbol extends Symbol {
    @Override
    public String flag() {
        return "^";
    }

    @Override
    public SymbolPriority priority() {
        return SymbolPriority.CUSTOM;
    }

    @Override
    public int numOfSymbol() {
        return 2;
    }

    @Override
    public double cal(double[] values) {
        return Math.pow(values[0], values[1]);
    }
}
