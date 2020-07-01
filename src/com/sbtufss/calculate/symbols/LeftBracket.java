package com.sbtufss.calculate.symbols;

import com.sbtufss.calculate.enums.SymbolPriority;

public class LeftBracket extends Symbol {

    @Override
    public String flag() {
        return "(";
    }

    @Override
    public SymbolPriority priority() {
        return SymbolPriority.USELESS;
    }

    @Override
    public int numOfSymbol() {
        return 0;
    }

    @Override
    public double cal(double[] values) {
        return 0;
    }

}
