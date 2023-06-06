package hello.proxy.pureproxy.concreteProxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteLogic {
    public String operation() {
        log.info("ConcreteLogic start");
        return "data";
    }
}
