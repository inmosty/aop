package hello.aop.exam.internalcall;

import hello.aop.exam.internalcall.aop.CallLogAspect;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(CallLogAspect.class)
@SpringBootTest
@Slf4j
class CallServiceV3Test {
    @Autowired CallServiceV3 callServiceV3;

    @Test
    public void external(){
        //log.info("target = {}",callServiceV0.getClass());
        callServiceV3.external();
    }

}