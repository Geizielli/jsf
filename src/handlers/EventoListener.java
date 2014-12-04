package handlers;

import javax.faces.component.UIComponent;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class EventoListener implements ActionListener {

	@Override
	public void processAction(ActionEvent e) throws AbortProcessingException {
		UIComponent uic = e.getComponent();
		uic.getAttributes().put("value", "Gringo Wins!");
		uic.getAttributes().put("disabled", true);
		
		UIComponent hueUic = uic.findComponent("huebr");
		hueUic.getAttributes().put("value", "Account Disabled!");
		hueUic.getAttributes().put("disabled", true);
	}
	
}
