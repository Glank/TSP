package pcc.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ComponentList extends JPanel{
	private static final long serialVersionUID = -6026254558990722756L;
	
	private Vector<Component> components;
	private JScrollPane scroller;
	private JPanel grid;
	
	public ComponentList(){
		components = new Vector<Component>();
		scroller = new JScrollPane();
		setLayout(new BorderLayout());
		add(scroller, BorderLayout.CENTER);
		updateGrid();
	}
	
	@Override
	public void removeAll(){
		components.clear();
		updateGrid();
	}
	
	@Override
	public Component add(Component component){
		components.add(component);
		updateGrid();
		return component;
	}
	
	@Override
	public void remove(Component component){
		components.remove(component);
		updateGrid();
	}
	
	private void updateGrid(){
		grid = new JPanel();
		grid.setLayout(new GridLayout(components.size(), 1));
		for(Component component:components)
			grid.add(component);
		scroller.setViewportView(grid);
	}
}
