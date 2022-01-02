package com.gmail.xlinaris.springworkspace.Shop.frontend;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("main")
public class MainView extends VerticalLayout {
    public MainView() {
        var title=new Text("Title");
        var text=new Text("some text");
        add(title, text);
    }
}
