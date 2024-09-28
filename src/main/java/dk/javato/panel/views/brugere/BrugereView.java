package dk.javato.panel.views.brugere;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dk.javato.panel.views.MainLayout;

@PageTitle("Brugere")
@Route(value = "my-view", layout = MainLayout.class)
public class BrugereView extends Composite<VerticalLayout> {

    public BrugereView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
