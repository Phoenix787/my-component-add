package ru.bk.xenia;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {


    public DemoView() {
        PaperNumberInput btn = new PaperNumberInput();
        btn.setLabel("Количество");
        add(btn);
    }
}
