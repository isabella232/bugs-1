package de.mosmann.vaadinbugs.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {
        ComboBox<String> stringComboBox = new ComboBox<>();
        stringComboBox.setInvalid(true);
        stringComboBox.setErrorMessage("show this error message");
        add(stringComboBox);

        Button button = new Button("Click me",
                e -> {
                    stringComboBox.setInvalid(!stringComboBox.isInvalid());
                    Notification.show(bean.getMessage());
                });
        add(button);
    }

}
