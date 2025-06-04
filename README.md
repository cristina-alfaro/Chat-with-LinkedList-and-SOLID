# 💬 Programa de Chat en Java

Este es un programa de chat simple implementado en **Java**, que utiliza **listas enlazadas** para gestionar el historial de mensajes. El proyecto ha sido desarrollado siguiendo los **principios SOLID**, lo que garantiza un diseño orientado a objetos limpio, escalable y fácil de mantener.

## 🧠 Características principales

- 📜 Historial de mensajes usando estructuras de datos (listas enlazadas)
 🧱 Arquitectura modular con separación clara por paquetes:
  - `application`: punto de entrada del sistema
  - `datastructure`: estructuras de datos personalizadas
  - `model`: clases de dominio como `User`, `Message` y `Chat`
  - `service`: lógica de negocio del chat y gestión de usuarios
- 📐 Basado en principios SOLID
- 💡 Ideal para prácticas de:
  - Programación orientada a objetos (POO)
  - Estructuras de datos
  - Buenas prácticas de diseño de software

## 📁 Estructura del proyecto

```bash
src/
└── com.kodigo.jd20.chat/
├── application/
│ └── Main.java
├── datastructure/
│ ├── MessageLinkedList.java
│ └── MessageNode.java
├── model/
│ ├── Chat.java
│ ├── IMessage.java
│ ├── Message.java
│ ├── TextMessage.java
│ └── User.java
└── service/
├── ChatService.java
└── UserService.java
