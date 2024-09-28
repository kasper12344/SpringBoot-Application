package dk.javato.panel.views.sider;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dk.javato.panel.views.MainLayout;

@PageTitle("Sider")
@Route(value = "my-view2", layout = MainLayout.class)
public class SiderView extends Composite<VerticalLayout> {

    public SiderView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
