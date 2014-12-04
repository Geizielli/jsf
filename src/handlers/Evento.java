package handlers;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
public class Evento {
	public void trocaTexto(ActionEvent e) {
		UIComponent uic = e.getComponent();

		if (((String) uic.getAttributes().get("value"))
				.equals("Hue hue hue br!")) {
			uic.getAttributes().put("value", "E os gringo pira!!");
			uic.getAttributes().put("styleClass", "btn btn-warning");
		} else {
			uic.getAttributes().put("value", "Hue hue hue br!");
		}
	}

	public void mudancaDeValor(ValueChangeEvent vce) {
		System.out.println(vce.getOldValue());
		UIComponent uic = vce.getComponent().findComponent("valorAlterado");
		uic.getAttributes().put(
				"value",
				((String) vce.getNewValue())
						+ ". Não adianta reclamar, eles é que mandam.");

	}
}
