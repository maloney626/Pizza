package edu.ycp.cs320.pizza.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.ListBox;

import edu.ycp.cs320.pizza.shared.Pizza;
import edu.ycp.cs320.pizza.shared.Size;

public class PizzaView extends Composite {
	private Pizza model;
	private InlineLabel sizeLabel;
	private InlineLabel toppingLabel;
	private ListBox sizeComboBox;
	
	
	
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
		
		sizeComboBox = new ListBox();
		layoutPanel.add(sizeComboBox);
		layoutPanel.setWidgetLeftWidth(sizeComboBox, 169.0, Unit.PX, 65.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(sizeComboBox, 25.0, Unit.PX, 26.0, Unit.PX);
	}
	public void setModel(Pizza model){
		this.model=model;
	}
	public void update(){
		if(sizeComboBox.getItemCount()==0){
			Size[] sizes=Size.values();
			for(Size s:sizes){
				sizeComboBox.addItem(s.toString());
			}
		}
		//set pizza's current size in the combo box
		Size pizzaSize=model.getSize();
		sizeComboBox.setSelectedIndex(pizzaSize.ordinal());
	}
	
}
