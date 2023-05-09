# Ultimo_Ejercicio_Del_Examen_Maximo

# Respuesta del enunciado:
Todos los barcos tienen un comportamiento en común: los métodos alarma() y
mensajeSocorro(), ¿qué implicaciones tiene esa afirmación a hora de construir
barco? Explícalo con tus propias palabras.

En este caso , cuando se refiere a que los barcos tienen un comportamiento en común se refiere a que existirán funciones que serán empleadas con un carácter obligatorio en todas las clases de barco.
Este efecto se puede lograr implementando una interfaz.

```java
public interface Barco {
    public abstract void alarma();
    public abstract void mensajeSocorro(String mensaje);
}
```

Del barco portaaviones se desea almacenar el número de aviones y el número de
marinos. También queremos los métodos get y set de los atributos
correspondientes, ¿Son realmente necesarios? ¿Se utilizan en algún momento?
Explícalo con tus propias palabras.


El uso de getters y setters tiene gran importancia ya que como norma general los atributos de las clases se declaran de tipo privado y la única forma en la que podemos acceder a ellos , ya sea para solicitar su
valor o asignar uno es haciendo uso de los mismos. Además un setter también puede ser empleado para controlar la información que le asignamos a un campo de nuestra clase (comprobación de errores.)

```java
public class BarcoPortaAviones implements Barco {

    private int cantidadDeAviones;
    private int cantidadDeMarinos;

    public BarcoPortaAviones() {
   	 super();
    }

    public BarcoPortaAviones(int cantidadDeAviones, int cantidadDeMarinos) {
   	 this.setCantidadDeAviones(cantidadDeAviones);
   	 this.setCantidadDeMarinos(cantidadDeMarinos);
   	 System.out.println("Cantidad de aviones: " + this.getCantidadDeAviones() + " Cantidad de marinos :"
   			 + this.getCantidadDeMarinos());
    }

    public int getCantidadDeAviones() {
   	 return cantidadDeAviones;
    }

    public void setCantidadDeAviones(int cantidadDeAviones) {
   	 this.cantidadDeAviones = cantidadDeAviones;
    }

    public int getCantidadDeMarinos() {
   	 return cantidadDeMarinos;
    }

    public void setCantidadDeMarinos(int cantidadDeMarinos) {
   	 this.cantidadDeMarinos = cantidadDeMarinos;
    }

    @Override
    public void alarma() {
   	 System.out.println("Soy un portaaviones");

    }

    @Override
    public void mensajeSocorro(String mensaje) {
   	 alarma();
   	 System.out.println(mensaje);

    }

}
```


