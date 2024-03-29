package pl.javasolutions.aspects;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class KontrolaMagazynu {

    @Pointcut("execution(* pl.javasolutions.api.IKucharz.pobierzSkladnikZMagazynu(..))")
    public void pointCut(){};

    @Before("pointCut()")
    public void sprawdzSkladnikiMagazynu(){
        System.out.println("Sprawdzam stan magazynu");
    }

    @AfterThrowing ("pointCut()")
    public void zasygnalizujemyBrakiWMagazynie(){
        System.out.println("Braki w magazynie!!!");
    }
}
