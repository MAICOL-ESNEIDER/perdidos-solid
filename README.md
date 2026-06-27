# perdidos-solid

Proyecto Java desarrollado para la evidencia GA1-AA1-EV03: Aplicación de principios SOLID y representación conceptual de patrones GoF y EIP.

Este proyecto implementa un caso de uso de procesamiento de pedidos aplicando principios de diseño orientado a objetos, separación de responsabilidades, uso de interfaces, inyección de dependencias por constructor y políticas de descuento intercambiables.

---

## Objetivo del proyecto

Aplicar los principios SOLID en un proyecto Java sencillo, mantenible, extensible y desacoplado.

El sistema permite procesar pedidos de clientes, calcular descuentos según una política definida, guardar el pedido y enviar una notificación.

---

## Principios SOLID aplicados

### 1. SRP - Single Responsibility Principle

Cada clase tiene una única responsabilidad:

- Pedido: representa los datos de un pedido.
- ProcesarPedidoService: coordina el caso de uso de procesamiento.
- PedidosRepositoryEnMemoria: guarda pedidos en memoria.
- NotificadorPedidoConsola: notifica pedidos por consola.
- DescuentoClienteRegular y DescuentoClienteVip: calculan descuentos.

Esto facilita el mantenimiento porque cada clase tiene un motivo claro para cambiar.

### 2. OCP - Open/Closed Principle

El sistema está abierto para extensión y cerrado para modificación.

Se pueden agregar nuevas políticas de descuento creando nuevas clases que implementen PoliticaDescuento, sin modificar ProcesarPedidoService.

### 3. LSP - Liskov Substitution Principle

Cualquier implementación de PoliticaDescuento, PedidosRepository o NotificadorPedido puede reemplazar a otra sin romper el funcionamiento del sistema.

Ejemplo: DescuentoClienteRegular y DescuentoClienteVip pueden usarse donde el sistema espera una PoliticaDescuento.

### 4. ISP - Interface Segregation Principle

Las interfaces son pequeñas y específicas:

- ProcesarPedidoUseCase: define el procesamiento de pedidos.
- PedidosRepository: define operaciones de persistencia.
- NotificadorPedido: define la acción de notificar.
- PoliticaDescuento: define el cálculo del descuento.

Esto evita que las clases implementen métodos que no necesitan.

### 5. DIP - Dependency Inversion Principle

ProcesarPedidoService depende de abstracciones y no de implementaciones concretas.

El servicio recibe sus dependencias por constructor:

- PedidosRepository
- NotificadorPedido
- PoliticaDescuento

Esto permite cambiar repositorios, notificadores o políticas de descuento sin modificar el servicio principal.

---

## Clases e interfaces solicitadas en el reto

### ProcesarPedidoUseCase

Interfaz que representa el caso de uso principal del sistema.

### PedidosRepository

Interfaz encargada de la persistencia de pedidos. Permite guardar y listar pedidos.

### NotificadorPedido

Interfaz encargada de notificar cuando un pedido fue procesado.

### PoliticaDescuento

Interfaz que representa una política de descuento intercambiable.

### DescuentoClienteRegular

Implementación de PoliticaDescuento. Aplica un descuento del 5%.

### DescuentoClienteVip

Implementación de PoliticaDescuento. Aplica un descuento del 15%.

### ProcesarPedidoService

Servicio de aplicación que implementa ProcesarPedidoUseCase.

Responsabilidades:

1. Validar datos de entrada.
2. Calcular descuento usando PoliticaDescuento.
3. Crear el pedido.
4. Guardar el pedido usando PedidosRepository.
5. Notificar usando NotificadorPedido.

No instancia dependencias concretas internamente.

---

## Estructura principal del proyecto

perdidos-solid/
- README.md
- scripts/run.sh
- docs/
- src/main/java/co/sena/pedidos/application/
- src/main/java/co/sena/pedidos/domain/
- src/main/java/co/sena/pedidos/infrastructure/
- src/main/java/co/sena/pedidos/presentation/

---

## Requisitos

- Java JDK 17 o superior.
- Git instalado.
- Git Bash, PowerShell o terminal compatible.

Este proyecto fue probado con Java 25.

---

## Instrucciones de ejecución

Desde la raíz del proyecto ejecutar:

./scripts/run.sh

El script realiza:

1. Limpieza de la carpeta out.
2. Compilación de archivos Java.
3. Ejecución de la clase principal Main.

---

## Ejemplo de salida esperada

Notificación enviada: el pedido PED-001 del cliente Cliente Regular fue procesado por un total de $95000.00
Notificación enviada: el pedido PED-002 del cliente Cliente VIP fue procesado por un total de $170000.00

=== Pedidos procesados ===
Pedido{id='PED-001', cliente='Cliente Regular', subtotal=100000, descuento=5000.00, total=95000.00}
Pedido{id='PED-002', cliente='Cliente VIP', subtotal=200000, descuento=30000.00, total=170000.00}

Total de pedidos guardados: 2

---

## Validación de cumplimiento del reto

| Requisito | Cumplimiento |
|---|---|
| Código fuente en Java | Sí |
| Interfaces y clases solicitadas | Sí |
| Separación de responsabilidades | Sí |
| Uso de abstracciones | Sí |
| Inyección de dependencias por constructor | Sí |
| Políticas de descuento intercambiables | Sí |
| Servicio sin dependencias concretas | Sí |
| Sin condicionales para seleccionar descuento | Sí |
| Interfaces pequeñas y específicas | Sí |
| README con explicación y ejecución | Sí |

---

## Flujo Git aplicado

El proyecto usa una estrategia basada en Git Flow:

- main: rama estable.
- develop: rama de integración.
- feature/solid-core: implementación Java.
- feature/documentacion: documentación.
- feature/mentefactos: mentefactos GoF y EIP.

---

## Autor

Maicol Esneider Posada Callejas  
Programa: Análisis y Desarrollo de Software  
Ficha: 3223873  
SENA - Medellín
