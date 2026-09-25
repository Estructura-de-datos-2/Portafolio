package datos.unidad1.recursividad;

public class Recursividad {

    public static void saludo(int total, String nombre) {

        if (total <= 0)
            return;
        else
            System.out.println("Hola " + nombre);

        saludo(total - 1, nombre);
    }


/**
nombre:José Emmanuel Arredondo Escalante
fecha: 25 de septimbre de 2026
se hizo la funcionalidad de cuenta regresiva

**/
public static void cuentaRegresiva(int n){

	if (n < 1 ){
		return;

	}else{
		System.out.println(n + " ");
		cuentaRegresiva(n-1);
	}

}
/**
nombre:José Emmanuel Arredondo Escalante
fecha: 25 de septimbre de 2026
se hizo la funcionalidad de suma de un arregloo

**/

public static int sumaRecursiva(int[] datos, int n) {

        if (n < 1) {
            return 0;
        } else {
            return datos[n -1] + sumaRecursiva(datos, n -1);
        }
    }

public static void main(String[] a) {

        //saludo(10, "Emmanuel");
        //cuentaRegresiva(100);
	
	int [] datos={1,2,3,4,5};
	
	int resultado=sumaRecursiva(datos,datos.length);
        
        System.out.println("total de la suma :" + resultado);

    }

}
