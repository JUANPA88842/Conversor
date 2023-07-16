import javax.swing.JOptionPane;

/**
 * Clase principal donde se ejecuta el programa
 * En el método main esta el cuadro de diálogo para elegir que tipo de conversor se utilizará
 * Estará el ciclo while para correr el programa mientras la variable verdad sea true, o sea, mientras no se presione cancelar
 * @author juanp
 *
 */

public class Principal extends ConversorMoneda{
	
	public static void main(String[] args) {
		boolean verdad = true;
		
		Object[] valores = { "Conversor de moneda", "Conversor de temperatura" };
		Object valorSeleccionado = JOptionPane.showInputDialog(null,"Elige uno", "Menu",JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
		
		while (verdad) {
			if (valorSeleccionado == "Conversor de moneda") {
				ConversorMoneda conversorMoneda = new ConversorMoneda();
				conversorMoneda.ingreseValor();
				conversorMoneda.opcionesDeCambio();
				verdad = conversorMoneda.confirmarOpcion();
			}else {
				JOptionPane.showMessageDialog(null, "Programa terminado", "aviso", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
	}
}
