# Mentefacto conceptual: Patrones de Diseño GoF

## Concepto central
Los Patrones de Diseño GoF son soluciones reutilizables para problemas frecuentes del diseño de software orientado a objetos.
Fueron propuestos por la Gang of Four: Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides.

## Definición general
Un patrón de diseño no es código terminado, sino una guía conceptual para resolver problemas comunes de diseño.
Permiten usar un lenguaje común entre desarrolladores y mejorar la mantenibilidad del software.

## Clasificación
Los patrones GoF se clasifican en tres grupos principales:
1. Patrones creacionales.
2. Patrones estructurales.
3. Patrones de comportamiento.

## Mentefacto textual
Patrones de Diseño GoF
- Son: soluciones reutilizables, buenas prácticas y modelos de diseño orientado a objetos.
- No son: librerías, algoritmos específicos ni código obligatorio.
- Se clasifican en: creacionales, estructurales y de comportamiento.
- Sirven para: reducir acoplamiento, mejorar cohesión, facilitar mantenimiento y permitir extensión.
- Se relacionan con: SOLID, programación orientada a objetos y arquitectura de software.

## Patrones creacionales
Propósito: gestionan la creación de objetos evitando depender directamente de clases concretas.
Ejemplos: Factory Method, Abstract Factory, Singleton, Builder y Prototype.
Ejemplo en Java: crear distintos tipos de notificadores sin acoplar el sistema a una clase específica.

## Patrones estructurales
Propósito: organizan la composición entre clases y objetos para formar estructuras flexibles.
Ejemplos: Adapter, Decorator, Facade, Composite, Proxy, Bridge y Flyweight.
Ejemplo en Java: usar Adapter para conectar una API externa con una interfaz esperada por el sistema.

## Patrones de comportamiento
Propósito: definen formas de comunicación y asignación de responsabilidades entre objetos.
Ejemplos: Strategy, Observer, Command, Template Method, Iterator, State, Chain of Responsibility, Mediator, Memento, Visitor e Interpreter.
Ejemplo en Java: en este proyecto se aplica una idea similar a Strategy con PoliticaDescuento, DescuentoClienteRegular y DescuentoClienteVip.

## Relación con SOLID
- SRP: separa responsabilidades.
- OCP: permite extender sin modificar clases existentes.
- LSP: permite sustituir implementaciones.
- ISP: favorece interfaces pequeñas.
- DIP: promueve depender de abstracciones.

## Representación tipo mentefacto
Concepto central: Patrones GoF.
Supraordinada: buenas prácticas de diseño orientado a objetos.
Isoordinadas: reutilización, flexibilidad, bajo acoplamiento y mantenibilidad.
Exclusiones: no son frameworks, no son librerías y no son código final.
Subordinadas: creacionales, estructurales y comportamiento.

## Conclusión
Los patrones GoF son importantes porque permiten diseñar software más claro, mantenible y extensible. Complementan los principios SOLID mediante soluciones probadas para problemas comunes.
