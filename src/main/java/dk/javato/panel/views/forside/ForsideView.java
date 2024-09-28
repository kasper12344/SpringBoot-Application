package dk.javato.panel.views.forside;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dk.javato.panel.views.MainLayout;

@PageTitle("Forside")
@Route(value = "", layout = MainLayout.class)
public class ForsideView extends Composite<VerticalLayout> {

    public ForsideView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
