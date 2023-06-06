package hello.proxy.reflection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

@Slf4j
public class ReflectionPractice {

    @Test
    void test1() throws Exception {
        Object obj = new Car("carA", 0);
//        obj.goForward(); compile error
        Class carClass = Car.class;

        Method goForward = carClass.getMethod("goForward");

        goForward.invoke(obj, null); //메서드를 실행시킬 객체, 해당 메서드에 넘길 인자

        Method getPosition = carClass.getMethod("getPosition");
        int position = (int)getPosition.invoke(obj, null);

        log.info("position={}", position);
    }



    public static class Car {
        private final String name;
        private int position;

        public Car(String name, int position) {
            this.name = name;
            this.position = position;
        }

        public void goForward() {
            this.position++;
        }
        public void goBack() {
            this.position--;
        }
        public int getPosition() {
            return position;
        }
    }


}
