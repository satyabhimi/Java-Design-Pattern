package StrategyPattern;

import StrategyPattern.interfaces.IStrategy;

public class Context
{
    private IStrategy strategy;

    public Context(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    int getValue(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
