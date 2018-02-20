package pcworld;

import com.alejandrogallardo.pcworld.*;

public class PcWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);
        
      //computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //computadora clon
        Computadora compuClon = new Computadora("Computadora Clon", monitorDell, tecladoToshi, ratonToshi);
        
      //orden 1 
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuClon);
        //imprimir orden 1
        orden1.mostrarOrden();
        
      //orden 2
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuClon);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
      //imprimir orden 2
        orden2.mostrarOrden();
	}

}
