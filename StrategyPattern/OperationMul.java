package StrategyPattern;

import StrategyPattern.interfaces.IStrategy;

public class OperationMul implements IStrategy
{
    @Override
    public int doOperation(int num1, int num2)
    {
        return num1 * num2;
    }
}
