import javax.swing.JOptionPane;

/**
 * El conversor de moneda tendrá una variable double que será la que se ingrese por pantalla
 * y una variable yesNo que será un entero que se utilizará para que el programa continue mientras
 * esta misma no sea distinta de 0
 * @author juanp
 *
 */

public class ConversorMoneda {
	double valorEntrada;
	int yesNo;
	
	/**
	 * Se realizó un try catch para capturar una excepción en caso de ingresar un valor string o no ingresar un valor
	 */
	
	public void ingreseValor() {
		try {
			this.valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor en pesos Colombianos"));
			System.out.println(valorEntrada);
			}
		catch (NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un número", "alert", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "Programa terminado", "alert", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
	}
		
	/**
	 * Se realizaron todas las posibles opciones de cambio y la l´gica detrás de ello
	 */
	
	public void opcionesDeCambio() {
		Object[] valores = { "De peso a Dólar", "De peso a Euro", "De peso a Libras", "De peso a Yen", "De peso a Won Coreano", "De Dólar a peso", "De Euro a peso", "De Libras a peso", "De Yen a peso", "De Won Coreano a peso"  };
		Object valorSeleccionado = JOptionPane.showInputDialog(null,"Elige uno", "Menu",JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
		
		if (valorSeleccionado == "De peso a Dólar") {
			this.valorEntrada = this.valorEntrada*0.00024;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (valorSeleccionado == "De peso a Euro") {
			this.valorEntrada = this.valorEntrada*0.00022;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (valorSeleccionado == "De peso a Libras") {
			this.valorEntrada = this.valorEntrada*0.00019;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (valorSeleccionado == "De peso a Yen") {
			this.valorEntrada = this.valorEntrada*0.035;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			
		}else if (valorSeleccionado == "De peso a Won Coreano") {
			this.valorEntrada = this.valorEntrada*0.31;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		}else if (valorSeleccionado == "De Dólar a peso") {
			this.valorEntrada = this.valorEntrada*4129.68;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		}else if (valorSeleccionado == "De Euro a peso") {
			this.valorEntrada = this.valorEntrada*4481.96;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		}else if (valorSeleccionado == "De Libras a peso") {
			this.valorEntrada = this.valorEntrada*5245.15;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		}else if (valorSeleccionado == "De Yen a peso") {
			this.valorEntrada = this.valorEntrada*28.59;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		
		}else if (valorSeleccionado == "De Won Coreano a peso") {
			this.valorEntrada = this.valorEntrada*3.17;
			JOptionPane.showMessageDialog(null, "Su valor es "+valorEntrada, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null, "Programa terminado", "alert", JOptionPane.INFORMATION_MESSAGE);
		}
		this.valorEntrada = 0;
	}
	
	/**
	 * Cuando se le pregunte al usuario si desea continuar, este método retornará true o false y
	 * en el método main habrá una variable llamada verdad que, mientras sea true, el ciclo while
	 * seguirá repitiendose
	 * @return
	 */
	
	public boolean confirmarOpcion() {
		this.yesNo = JOptionPane.showConfirmDialog(null,"Desea continuar", "Mensaje", JOptionPane.YES_NO_OPTION);
		while (this.yesNo == 0) {
			System.out.println(this.yesNo);
			return true;
		}
		JOptionPane.showMessageDialog(null, "Programa terminado", "alert", JOptionPane.INFORMATION_MESSAGE);
		return false;
	}	
}
	

