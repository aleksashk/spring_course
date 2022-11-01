package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {
    @Pointcut("execution(* asdf*(..))")
    public void allAddMethods(){}
}
