# Patterns
Laboratorio # 3 - Ingenieria de Software 2

## Presentado por:

* Juan Camilo Monterrosa Sanchez 
* Jhonatan Sandoval Velasco

# Punto # 1

  En la carpeta **AirportTransport** se encuentra la implementacion del patron _Strategy_, en el cual encontrará las siguientes clases:
  *  **AirportTransport.java:** Aqui se encuentra el main, donde se ejecuta el algoritmo solicitado, que consta de una seleccion del transporte (Estrategia) segun los indicadores "_tiempo_" y "_presupuesto_" para una distancia fija al aeropuerto de 20km.
  *   **Strategy.java:** Es la interface de la estragia donde se instancia el metodo "_transport_".
  *   **Choose:** Se ejecuta el metodo _transport_ de la estrategia solicitada.
  *   **BicycleStrategy.java:** Implementando la interface _Strategy_, suponiendo que no tiene costo el transporte en bicileta y que se mueve a una velocidad promedio de 15km/h el metodo _transport_ indica el transporte seleccionado, el dinero que cuesta, el tiempo que se demora el viaje y dinero restante el presupuesto inicial. 
  *   **BusStrategy.java:** Similar a la estategia _BicycleStrategy_, pero con un precio de 2400 (coste de transmilenio a la fecha) y una mayor velocidad promedio (50km/h).
  *   **TaxiStrategy.java:** Similar a las estrategias anteriores, pero con un precio de 250 pesos por minuto y una mayor velocidad promedio (80km/h). Para esta clase, por el algoritmo implementado en la calse _AirportTransport.java_ el usuario podria ingresar un tiempo en el cual requiera de tomar un taxi, pero un presupuesto insuficiente para pagar la tarifa, por lo cual en la implementacion del metodo _transport_ nos vemos obligados a ofrecerle una alternativa seleccionando entre los otrso dos transportes disponibles, dependiendo nuevamente de los indicadores "_tiempo_" y "_presupuesto_".
  
# Punto # 2

  Se encuentra en la carpeta **PaisaPizzas**, aqui se creó una clase para cada tipo de pizza nueva en donde se agregaron los valores de cada ingrediente, los cuales son heredados desde la clase _Pizza.java_ la cual refiere tanto los _toppings_ como los pasos de la creacion de cada pizza. Luego se creó la clase _PaisasPizzaStore.java_ la cual hereda de _PizzaStore.java_ todos los procesos, y en donde se selecciona el tipo de pizza que se realizará; Finalmente se agregaron todas las caracteristicas de la tienda y los tipos de pizza a la clase _DependentPizzaStore,java_.
  
# Punto # 3

En la carpeta **BuilderPattern** se encuentra la implementacion del patron _Builder_, en el cual encontrará las siguientes clases:
*   **IBuilder.java:** Es una interfezas que instancia el metodo build.
*   **UserAccount.java:** Esta clase contiene los atributos de la cuenta y sus respectivos getters y setters.
*   **UserAccountBuilder.java:** Esta clase implementa la interfaz _IBuilder_ y es donde se instancian todos los metodos de creacion de la cuenta, los cuales cuales reciben los parametros que el usuario desee ingresar; cada metodo devuelve el builder. Todo esto se ejecuta desde el metodo _build()_ implementado de la interfaz.
*   **BuilderPattern.java:** Aqui se encuentra el main de la aplicacion, donde, primero creamos el builder new UserAccountBuilder(accountNumber) que por defecto necesita el número de cuenta. Luego usamos el builder y vamos enviando los parametros uno por uno.

# Punto # 4
  
  Implementamos los antioparametros que se encuentran en los archivos **input kludge.py** y **Poltergeist antipattern** respectivamente, ambos codigos se encuentran comentados con la explicacion de su funcionamiento.
  
# Punto # 5

  En la carpeta **Decorator pattern** se encuentra la implementacion del patron _Decorator_, en el cual encontrará las siguientes clases:
  *   **Coffee.java:** Es una interfezas que instancia el metodo _CalculateSophistication_.
  *   **ComponentDecorator.java:** Esta clase implementa la interfaz Coffee, donde se da la estructura del Decorador, con su respectivo constructor, getter, setter e implementacion del metodo _CalculateSophistication_, que para este caso es simplemente retornar un String con el tipo de sofisticacion para cada implemento adicional.
  * **BaseCoffee.java:** Implementa el metodo _CalculateSophistication_ de la interfaz Coffee, la cual devulve la clase de sofisticacion que corresponde a un cafe simple.
  * **Milk.java:** Esta es un componente decorador, que se puede agregar sobre la base referidad a la clase _BaseCoffee.java_ donde su metodo _CalculateSophistication_ retorna lo que corresponde a un cafe Elementary. 
  * **CookTime.java:** Similar a la anterior donde su metodo _CalculateSophistication_ retorna lo que corresponde a un cafe Basic o Sophisticated dependiendo de si lo agregado anteriormente al cafe fue leche (se comprueba mediante su tipo de sofisticacion).
  * **Mocha.java:** Similar a la clase  donde su metodo _CalculateSophistication_ retorna lo que corresponde a un cafe Advanced.
  * **Figure .java:** Similar a la clase  donde su metodo _CalculateSophistication_ retorna lo que corresponde a un cafe Advanced puesto que en el ejemplo se implementa junto Mocha, lo que no sugiere ningun cambio en el tipo de sofisticacion.
  * **Main.java:** Se prueban todos los tipos de sofisiticacion, mediante la crecacion de un cafe de tipo Coffee intanciado como un BaseCoffee, y para cada "decoracion" nueva, se agrga lo respectivo a esta. 
  
  
