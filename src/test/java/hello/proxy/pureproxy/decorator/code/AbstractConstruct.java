package hello.proxy.pureproxy.decorator.code;

public abstract class AbstractConstruct {
    private Component component;

    public AbstractConstruct(Component component) {
        this.component = component;
    }
}
