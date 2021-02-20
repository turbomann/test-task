package com.haulmont.testtask.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

import java.util.UUID;

@Theme(ValoTheme.THEME_NAME)
public class MainUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        layout.setSizeFull();
        layout.setMargin(true);
        horizontalLayout.addComponent(new ComboBox());

        layout.addComponent(new Label("Hello this is first UI "));
        layout.addComponent(new CheckBox("This is checkBox"));
        layout.addComponent(new Button("new button"));

        layout.addComponent(new ColorPicker());
        layout.addComponent(new ColorPickerArea());
        setContent(layout);
    }
}