# Mentefacto conceptual: Enterprise Integration Patterns EIP

## Concepto central
Los Enterprise Integration Patterns, conocidos como EIP, son patrones de integración empresarial usados para comunicar aplicaciones, servicios y sistemas distribuidos mediante mensajes.
Su propósito es facilitar la integración entre sistemas que pueden tener tecnologías, formatos, protocolos o responsabilidades diferentes.

## Definición general
Los EIP describen soluciones para problemas comunes de integración entre aplicaciones empresariales.
Se usan especialmente en arquitecturas basadas en mensajería, eventos, microservicios, colas y sistemas distribuidos.

## Problemas que resuelven
- Comunicación entre sistemas desacoplados.
- Transformación de datos entre formatos diferentes.
- Enrutamiento de mensajes hacia destinos correctos.
- Filtrado de mensajes innecesarios.
- División y unión de mensajes.
- Manejo de errores en mensajería.
- Procesamiento idempotente para evitar duplicados.
- Integración entre aplicaciones heredadas y modernas.

## Conceptos fundamentales
Message: unidad de información enviada entre sistemas. Puede representar una orden, evento, solicitud, respuesta o documento.
Headers: metadatos del mensaje, como identificador, origen, destino, fecha o tipo.
Payload: contenido principal del mensaje, es decir, los datos que procesa el receptor.
Message Channel: canal por donde viajan los mensajes, permitiendo desacoplar emisor y receptor.
Message Endpoint: punto de conexión de una aplicación con el sistema de mensajería.

## Categorías principales
- Canales de mensajería.
- Construcción de mensajes.
- Enrutamiento de mensajes.
- Transformación de mensajes.
- Endpoints de mensajería.
- Administración y monitoreo del sistema.

## Patrones esenciales
Message Channel: canal que permite transportar mensajes entre aplicaciones.
Point-to-Point Channel: canal donde un mensaje es consumido por un solo receptor.
Publish-Subscribe Channel: canal donde un mensaje puede ser recibido por varios suscriptores.
Message Translator: transforma el formato de un mensaje para que otro sistema lo entienda.
Message Filter: descarta mensajes que no cumplen una condición.
Content-Based Router: envía mensajes a diferentes destinos dependiendo de su contenido.
Recipient List: envía el mismo mensaje a varios destinatarios.
Splitter: divide un mensaje grande en varios mensajes pequeños.
Aggregator: une varios mensajes relacionados en un solo resultado.
Dead Letter Channel: canal para mensajes que no pudieron ser entregados o procesados.
Idempotent Receiver: evita procesar dos veces el mismo mensaje aunque llegue repetido.

## Relación con microservicios y tecnologías modernas
Los EIP son importantes en arquitecturas modernas porque permiten integrar microservicios de forma desacoplada.
Se relacionan con tecnologías como RabbitMQ, Apache Kafka, ActiveMQ, Azure Service Bus, AWS SQS, Apache Camel y Spring Integration.
En microservicios ayudan a reducir dependencias directas, mejorar tolerancia a fallos y facilitar comunicación basada en eventos.

## Mentefacto textual
Enterprise Integration Patterns
- Son: patrones de integración empresarial, soluciones para comunicación entre sistemas y guías para mensajería.
- No son: una tecnología específica, un lenguaje de programación ni una herramienta única.
- Resuelven: desacoplamiento, transformación, enrutamiento, filtrado, errores y duplicidad de mensajes.
- Se componen de: Message, Headers, Payload, Message Channel y Message Endpoint.
- Se relacionan con: microservicios, eventos, colas, sistemas distribuidos e integración empresarial.

## Representación tipo mentefacto
Concepto central: Enterprise Integration Patterns.
Supraordinada: arquitectura e integración de aplicaciones empresariales.
Isoordinadas: mensajería, desacoplamiento, enrutamiento, transformación y tolerancia a fallos.
Exclusiones: no son una herramienta única, no son un framework específico y no son un lenguaje.
Subordinadas: canales, mensajes, endpoints, routers, filtros, traductores, splitters y aggregators.

## Conclusión
Los Enterprise Integration Patterns son importantes porque permiten diseñar integraciones empresariales más ordenadas, escalables y resistentes. Ayudan a conectar sistemas diferentes sin generar alto acoplamiento.
