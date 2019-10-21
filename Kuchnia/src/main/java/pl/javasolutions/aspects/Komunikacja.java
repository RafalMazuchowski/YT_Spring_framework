package pl.javasolutions.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Komunikacja {

    @Pointcut("args(argumentInt)")
    public void pointcutInt(int argumentInt){
    }

    @Pointcut("target(pl.javasolutions.api.IKucharz)")
    public void pointcutTarget(){
    }

    @Pointcut("@target(annotation)")
    public void pointcutTargetAnnotation(Deprecated annotation){
    }

    @Pointcut("within(pl.javasolutions.impl.Kucharz)")
    public void pointcutWithin(){
    }

    /*
    @Before("pointcutInt(arg)")
    public void porada(int arg){
        System.out.println("PORADA: "+ arg);
    }*/

    /*
    @Before("pointcutTarget()")
    public void porada(){
        System.out.println("PORADA: ");
    }*/

    /*
    @Before("pointcutTargetAnnotation(anno)")
    public void porada(Deprecated anno){
        System.out.println("PORADA: " + anno);
    }*/

    /*
    @Before("pointcutWithin()")
    public void porada() {
        System.out.println("PORADA: ");
    }*/


    @Before("!pointcutWithin() && pointcutInt(arg)")
    public void porada(int arg) {
        System.out.println("PORADA: ");
    }



    /*@After("execution(* pl.javasolutions.api.IKucharz.pobierzSkladnikZMagazynu(..))")
    public void poinformujOPobraniuSkladnikow(){
        System.out.println("Pobrano składniki");
    }

    @Around("execution(* pl.javasolutions.api.IKucharz.wydajPizze(..))")
    public void wydaniePizzy(ProceedingJoinPoint joinPoint){

        try {

            System.out.println("KOMUNIKUJEMY, ŻE PIZZA JEST GOTOWA");
            joinPoint.proceed();
            System.out.println("KOMUNIKUJEMY, ŻE WYDANO PIZZE");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }*/

}
