package com.techin.aopdemo.aspect;

import com.techin.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    @Around("execution(* com.techin.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(
            ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        // print out method we are advising on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n==========>>>>>> Executing @Around on method: " + method);

        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = theProceedingJoinPoint.proceed();

        // get end time stamp
        long end = System.currentTimeMillis();

        // compute duration and display it
        long duration = end - begin;
        System.out.println("\n==========>>>>> Duration: " + duration / 1000.0 + " seconds");

        return result;
    }

    @After("execution(* com.techin.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toString();
        System.out.println("\n==========>>>>>> Executing @After (finally) on method: " + method);

    }

    // add a new advice for @AfterReturning on the findAccounts method
    @AfterReturning(
            pointcut = "execution(* com.techin.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result" )
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toString();
        System.out.println("\n==========>>>>>> Executing @AfterReturning on method: " + method);

        // print out the results of method call
        System.out.println("\n==========>>>>>> result is: " + result);

        // let's post=process the data ... let's modify it .....

        // convert the accounts names to uppercase
        convertAccountsNamesToUpperCase(result);

        System.out.println("\n==========>>>>>> result is: " + result);
    }

    private void convertAccountsNamesToUpperCase(List<Account> result) {

        // loop through accounts
        for (Account tempAccount : result) {

            // get uppercase version of names
            String theUpperName = tempAccount.getName().toUpperCase();

            // update the name on the account
            tempAccount.setName(theUpperName);
        }
    }


    @Before("com.techin.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint theJoinpoint) {
        System.out.println("\n=========>>>>> Executing @Before advice on addSillyMember()");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinpoint.getSignature();

        System.out.println("Method: " + methodSignature);

        // display method arguments

        // get args
        Object[] args = theJoinpoint.getArgs();

        // loop thru args
        for (Object tempArg : args) {
            System.out.println(tempArg);

            if (tempArg instanceof Account) {

                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;

                System.out.println("account name: " + theAccount.getName());
                System.out.println("account name: " + theAccount.getLevel());
            }
        }
    }
}
