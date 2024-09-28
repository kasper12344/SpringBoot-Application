package dk.javato.panel.views.database;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dk.javato.panel.views.MainLayout;

@PageTitle("Database")
@Route(value = "my-view3", layout = MainLayout.class)
public class DatabaseView extends Composite<VerticalLayout> {

    public DatabaseView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
