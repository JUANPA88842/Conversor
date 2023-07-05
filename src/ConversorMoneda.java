import javax.swing.JOptionPane;

public class ConversorMoneda {
	int valorEntrada;
	
	public void ingreseValor() {
		this.valorEntrada = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor en pesos Colombianos"));
		System.out.println(valorEntrada);
	}
	
	public void opcionesDeCambio() {
		Object[] valores = { "De peso a Dólar", "De peso a Euro", "De peso a Libras", "De peso a Yen", "De peso a Won Coreano", "De Dólar a peso", "De Euro a peso", "De Libras a peso", "De Yen a peso", "De Won Coreano a peso"  };
		Object valorSeleccionado = JOptionPane.showInputDialog(null,"Elige uno", "Menu",JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
		
	}
	
}
