package com.gmail.xlinaris.springworkspace.Shop.frontend;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("main")
public class MainView extends VerticalLayout {
    public MainView() {
        var titleHL = new HorizontalLayout();
        var textHL = new HorizontalLayout();
        var title=new Text("Title");
        var titleButton = new Button("Кнопка", buttonClickEvent -> title.setText("кнопка нажата"));
        var text=new Text("some text");

        titleHL.add(title, titleButton);
        textHL.add(text);
        add(titleHL, textHL);
    }
}
