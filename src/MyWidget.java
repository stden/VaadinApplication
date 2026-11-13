import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.ClientWidget;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 24.11.12
 * Time: 2:14
 * To change this template use File | Settings | File Templates.
 */
@ClientWidget(client.VMyWidget.class)
public class MyWidget extends AbstractComponent {
    @Override
    public void changeVariables(Object source, Map<String, Object> variables) {
        super.changeVariables(source, variables);
    }
}
