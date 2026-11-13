import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 24.11.12
 * Time: 2:13
 * To change this template use File | Settings | File Templates.
 */
public class VaadinApplication extends Application {
    @Override
    public void init() {
        Window window = new Window("VaadinApplication");
        window.addComponent(new Label("Hello, world!"));
        setMainWindow(window);
    }
}
