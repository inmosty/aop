package hello.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
public class Pointcuts {
    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder(){}   //pointcut signature

    //클래스 이름 패턴이 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService(){}

    //allOrder() && allService()
    @Pointcut("allOrder() && allService()")
    public void orderAndService(){}
}
