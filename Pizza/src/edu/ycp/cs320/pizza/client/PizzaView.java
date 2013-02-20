package edu.ycp.cs320.pizza.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.ListBox;

public class PizzaView extends Composite {
	public PizzaView() {
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		Label sizeLabel = new Label("Size");
		layoutPanel.add(sizeLabel);
		layoutPanel.setWidgetLeftWidth(sizeLabel, 29.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(sizeLabel, 25.0, Unit.PX, 18.0, Unit.PX);
		
		Label toppingLabel = new Label("Toppings");
		layoutPanel.add(toppingLabel);
		layoutPanel.setWidgetLeftWidth(toppingLabel, 29.0, Unit.PX, 56.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(toppingLabel, 94.0, Unit.PX, 18.0, Unit.PX);
		
		ListBox comboBox = new ListBox();
		layoutPanel.add(comboBox);
		layoutPanel.setWidgetLeftWidth(comboBox, 169.0, Unit.PX, 65.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(comboBox, 25.0, Unit.PX, 26.0, Unit.PX);
	}
}
