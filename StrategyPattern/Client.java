package StrategyPattern;

import StrategyPattern.interfaces.IStrategy;

public class Client
{
    public static void main(String[] args)
    {
        IStrategy addStrategy = new OperationAdd();

        Context context = new Context(addStrategy);

        System.out.println(context.getValue(2, 3));
    }
}
