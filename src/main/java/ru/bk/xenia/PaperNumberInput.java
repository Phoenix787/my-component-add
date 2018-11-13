package ru.bk.xenia;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.icon.IronIcon;
import com.vaadin.flow.dom.Element;

@Tag("paper-number-input")

@HtmlImport("bower_components/paper-number-input/paper-number-input-icons.html")
@HtmlImport("bower_components/paper-number-input/paper-number-input.html")
public class PaperNumberInput extends Component {

    public PaperNumberInput() {
        Element element = getElement();
        element.setAttribute("min", "1");
        element.setAttribute("max", "12");
        element.setAttribute("value", "2");
        element.getStyle().set("max-width", "140px");
        element.setProperty("stepUpIcon", "integer-input:step-up");
        element.setProperty("stepDownIcon", "integer-input:step-down");

    }

    public void setLabel(String labelText) {
        getElement().setAttribute("label", labelText);
    }

}