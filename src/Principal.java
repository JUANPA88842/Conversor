import javax.swing.JOptionPane;

public class Principal extends ConversorMoneda{
	public static void main(String[] args) {
		Object[] valores = { "Conversor de moneda", "Conversor de temperatura" };
		Object valorSeleccionado = JOptionPane.showInputDialog(null,"Elige uno", "Menu",JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
		
		if (valorSeleccionado == "Conversor de moneda") {
			ConversorMoneda conversorMoneda = new ConversorMoneda();
			conversorMoneda.ingreseValor();
			
			
		}else {
			System.out.println("temperatura");
		}
		
		
		
		
		
		
	}
}
