package demo.critters;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

@Component
public class Harry implements InitializingBean, DisposableBean, Lifecycle {
    public Harry() {
        System.out.println("I'm Harry!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Harry - afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Harry - destroy()");
    }

    @Override
    public void start() {
        System.out.println("Harry - start()");
    }

    @Override
    public void stop() {
        System.out.println("Harry - stop()");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
