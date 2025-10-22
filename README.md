# Sistema de Mesa de Ayuda

## Descripción
Este proyecto es un sistema de escritorio para la gestión de una Mesa de Ayuda, desarrollado como parte de un proyecto universitario. La aplicación permite administrar y configurar los flujos de trabajo para la resolución de incidencias, optimizando el soporte y la asignación de tareas dentro de una organización.
El sistema está diseñado para ser modular y escalable, permitiendo una gestión detallada de los diferentes componentes que intervienen en un proceso de soporte, como la definición de tipos de casos, la asignación a sectores específicos y la configuración de las tareas e instancias que componen cada flujo.

## Funcionalidades Principales
El sistema ofrece una interfaz gráfica para realizar operaciones de alta, baja, modificación y consulta (ABMC) sobre las siguientes entidades:
- Gestión de Sectores: Permite administrar los diferentes departamentos o áreas de la organización que pueden intervenir en la resolución de un caso.
- Gestión de Tipos de Caso: Define las distintas categorías de problemas o solicitudes que los usuarios pueden reportar (ej. "Falla de hardware", "Problema de software").
- Gestión de Tipos de Tarea: Administra las acciones o pasos específicos que se pueden realizar para resolver una incidencia (ej. "Diagnosticar problema", "Solicitar repuesto").
- Gestión de Tipos de Instancia: Permite modelar las diferentes etapas o estados por los que puede pasar un caso durante su ciclo de vida.
- Configuración de Flujos de Trabajo (Configuración de Tipo de Caso): Es la funcionalidad central del sistema. Permite asociar un Tipo de Caso con una secuencia ordenada de Tipos de Instancia, creando un flujo de trabajo personalizado para la resolución de cada categoría de problema.

## Tecnologías Utilizadas
- Lenguaje de Programación: Java.
- Interfaz Gráfica: Java Swing para la construcción de la interfaz de usuario de escritorio.
- Base de Datos: MySQL, utilizada para la persistencia de todos los datos de la aplicación.
- Mapeo Objeto-Relacional (ORM): Hibernate, para gestionar la comunicación entre la aplicación y la base de datos, mapeando los objetos Java a las tablas relacionales.
- Gestión de Dependencias y Construcción: El proyecto utiliza Apache Ant para la compilación y empaquetado de la aplicación.

## Estructura del Proyecto
El repositorio está organizado de la siguiente manera:
- src/: Contiene todo el código fuente de la aplicación, dividido en:
- Controller: Contiene los controladores que gestionan la lógica de negocio y la interacción con la interfaz de usuario.
- DTO: (Data Transfer Objects) Clases utilizadas para transferir datos entre las capas de la aplicación.
- Interfaces: Contiene todas las clases que definen la interfaz gráfica de usuario (formularios Swing).
- entidades: Clases que modelan las entidades del dominio (ej. Sector, TipoCaso).
- main: Clases principales de la aplicación, incluyendo el experto y la fachada de persistencia.
- lib/: Incluye todas las librerías y dependencias necesarias para el proyecto, como el conector de MySQL y los JARs de Hibernate.
- Base de datos SQL/: Contiene el script mesa_ayuda.sql para la creación de la estructura de la base de datos.

## Instalación y Ejecución
### Configurar la Base de Datos:
- Asegúrate de tener un servidor MySQL en funcionamiento.
- Ejecuta el script mesa_ayuda.sql para crear la base de datos y las tablas necesarias.
- Actualiza el archivo de configuración de Hibernate (src/hibernate.cfg.xml) con tus credenciales de base de datos (URL, usuario y contraseña).

### Ejecutar la Aplicación:
- Abre el proyecto en un IDE compatible con Java (como NetBeans o IntelliJ IDEA).
- Ejecuta la clase principal main/Main.java para iniciar la aplicación.
