package pl.kremiec.calculatorapp.Guis;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class CalculatorGui extends VerticalLayout {

    TextField firstNumberField;
    TextField secondNumberField;
    TextArea resultField;
    Button button;

    @Autowired
    CalculatorGui(){

        addFields();

        button.addClickListener(buttonClickEvent ->
                allCombinations(Double.parseDouble(firstNumberField.getValue()),Double.parseDouble(secondNumberField.getValue())));



    }

    public void addFields(){
        firstNumberField = new TextField("First number");
        secondNumberField = new TextField("Second number");
        resultField = new TextArea("Result");
        resultField.setWidth("75%");
        button = new Button("Click!");

        add(firstNumberField);
        add(secondNumberField);
        add(resultField);
        add(button);
    }

    public void allCombinations(double a, double b){

        String result = String.format("%.2f + %.2f = %.2f\n",a,b,a+b) +
                        String.format("%.2f - %.2f = %.2f\n",a,b,a-b) +
                        String.format("%.2f * %.2f = %.2f\n",a,b,a*b) +
                        String.format("%.2f / %.2f = %.2f",a,b,a/b);

        resultField.setValue(result);

    }
}
