package pl.kremiec.calculatorapp.Guis;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class CalculatorGui extends VerticalLayout {

    TextArea textArea;
    Button button;

    @Autowired
    CalculatorGui(){

        textArea = new TextArea();
        button = new Button("Click");

        button.addClickListener(buttonClickEvent -> textArea.setValue("test value 123\nsecond line"));

        add(textArea);
        add(button);


    }
}
