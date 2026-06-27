# Mentefacto conceptual: Enterprise Integration Patterns EIP

## Concepto central
Los Enterprise Integration Patterns, conocidos como EIP, son patrones de integración empresarial usados para comunicar aplicaciones, servicios y sistemas distribuidos mediante mensajes.
Su propósito es facilitar la integración entre sistemas con tecnologías, formatos, protocolos o responsabilidades diferentes.

## Definición general
Los EIP describen soluciones para problemas comunes de integración entre aplicaciones empresariales.
Se usan en arquitecturas basadas en mensajería, eventos, microservicios, colas y sistemas distribuidos.

## Problemas que resuelven
- Comunicación entre sistemas desacoplados.
- Transformación de datos entre formatos diferentes.
- Enrutamiento de mensajes hacia destinos correctos.
- Filtrado de mensajes innecesarios.
- División y unión de mensajes.
- Manejo de errores en mensajería.
- Evitar procesamiento duplicado de mensajes.
- Integración entre aplicaciones heredadas y modernas.

## Conceptos fundamentales
- Message: unidad de información enviada entre sistemas.
- Headers: metadatos del mensaje, como identificador, origen, destino, fecha o tipo.
- Payload: contenido principal del mensaje.
- Message Channel: canal por donde viajan los mensajes.
- Message Endpoint: punto de conexión entre una aplicación y el sistema de mensajería.

## Categorías principales
- Canales de mensajería.
- Construcción de mensajes.
- Enrutamiento de mensajes.
- Transformación de mensajes.
- Endpoints de mensajería.
- Administración y monitoreo.

## Patrones esenciales
- Message Channel: transporta mensajes entre aplicaciones.
- Point-to-Point Channel: un mensaje es consumido por un solo receptor.
- Publish-Subscribe Channel: un mensaje puede llegar a varios suscriptores.
- Message Translator: cambia el formato de un mensaje.
- Message Filter: descarta mensajes que no cumplen una condición.
- Content-Based Router: enruta mensajes según su contenido.
- Recipient List: envía el mensaje a varios destinatarios.
- Splitter: divide un mensaje grande en varios mensajes pequeños.
- Aggregator: une varios mensajes relacionados.
- Dead Letter Channel: almacena mensajes que no pudieron procesarse.
- Idempotent Receiver: evita procesar dos veces el mismo mensaje.

## Relación con microservicios y tecnologías modernas
Los EIP permiten integrar microservicios de forma desacoplada.
Se relacionan con tecnologías como RabbitMQ, Apache Kafka, ActiveMQ, Azure Service Bus, AWS SQS, Apache Camel y Spring Integration.
También ayudan a mejorar tolerancia a fallos, escalabilidad y comunicación basada en eventos.

## Mentefacto textual
Enterprise Integration Patterns
- Son: patrones de integración empresarial y soluciones para comunicación entre sistemas.
- No son: una tecnología específica, un lenguaje ni una herramienta única.
- Resuelven: desacoplamiento, transformación, enrutamiento, filtrado, errores y duplicidad.
- Se componen de: Message, Headers, Payload, Message Channel y Message Endpoint.
- Se relacionan con: microservicios, eventos, colas y sistemas distribuidos.

## Representación tipo mentefacto
Concepto central: Enterprise Integration Patterns.
Supraordinada: arquitectura e integración de aplicaciones empresariales.
Isoordinadas: mensajería, desacoplamiento, enrutamiento, transformación y tolerancia a fallos.
Exclusiones: no son una herramienta única, no son un framework específico y no son un lenguaje.
Subordinadas: canales, mensajes, endpoints, routers, filtros, traductores, splitters y aggregators.

## Conclusión
Los Enterprise Integration Patterns son importantes porque permiten diseñar integraciones empresariales más ordenadas, escalables y resistentes. Ayudan a conectar sistemas diferentes sin generar alto acoplamiento.
