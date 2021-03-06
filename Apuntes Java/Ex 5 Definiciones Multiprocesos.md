# DEFINICIONES Y EJEMPLOS DE MULTIPROCESOS

Un concepto que está estrechamente ligado a esta funcionalidad es justamente el de Multiprocesamiento, también llamado Multiproceso, en el cual tenemos la acción de dos o más Unidades de Procesamiento en las cuales están abocados, en cada una de ellas, una cantidad determinada de procesos, realizando cada una de ellas una parte o un todo del mismo.

Conocemos entonces al Multiproceso, tal como su nombre lo indica, a la aptitud para hacer uso de dos o más procesos que concurren en un mismo sistema, diferenciándose lógicamente de aquellos sistemas en los que solamente pueden realizar un proceso único en un instante específico.

La capacidad de Multitarea permite entonces hacer que una Unidad Central de Procesamiento pueda ser compartida por una gran cantidad de procesos que estén corriendo al mismo tiempo, mientras que en las últimas tecnologías propuestas, donde tenemos Múltiples CPU, podemos contar con la realización de distintas etapas del mismo proceso dividiéndose estas tareas en cada uno de los núcleos que se posean.

... Fuente https://sistemas.com/multiproceso.php

## APLICACIÓN

### ¿Qué es una aplicación?

Aplicación informática: Es un programa informático hecho para permitir a un usuario realizar uno o varios tipos de trabajo.

Una solución informática para la automatización de ciertas tareas complicadas como pueden ser la contabilidad, la redacción de documentos, o la gestión de un almacén. Algunos ejemplos de programas de aplicación son los procesadores de textos, hojas de cálculo, y base de datos.

Tales aplicaciones desarrolladas «a medida» suelen ofrecer una gran potencia ya que están exclusivamente diseñadas para resolver un problema específico. Otros, llamados paquetes integrados de software, ofrecen menos potencia pero a cambio incluyen varias aplicaciones, como un programa procesador de textos, de hoja de cálculo y de base de datos.

Otros ejemplos de programas de aplicación pueden ser: programas de comunicación de datos, multimedia, presentaciones, diseño gráfico, cálculo, finanzas, correo electrónico, compresión de archivos, presupuestos de obras, gestión de empresas, etc.

## SERVICIO / PROCESO

### ¿Qué es un servicio? ¿Qué es un proceso? ¿Cuales son las diferencias entre ambos?

### Su descripción rápida sería que un servicio no es más que programa o aplicación en ejecución en segundo plano, 
algo con lo que a nivel de usuarios no deberemos interacturar pero que es totalmente necesario para el funcionamiento del sistema, algo que está ahí trabajando pero que no percibimos.

A diferencia de los procesos, los servicios no se pueden cerrar o eliminar, lo único que podemos hacer es detenerlos o reiniciarlos, pero en ningún caso “matarlos”.

Por poner un ejemplo de servicios con los que cuenta Windows, los cuales están trabajando de forma constante en segundo plano y no somos conscientes de ello, podemos poner como ejemplo el cliente DNS, cliente DHCP el actualizador de zona horaria, el administrador de sesiones, servicio de archivos sin conexión, cola de impresión, servicios de escritorio remoto que permiten una conexión al equipo, etc.

Estos ejemplos que indicamos al final no son más que aplicaciones que pueden estar en ejecución o no, pero son aplicaciones destinadas al funcionamiento del sistema operativo y no al manejo de un usuario, por ejemplo, cuando nuestro sistema operativo detecta una conexión de red y tenemos la red configurada en modo automático, el equipo lanzará una solicitud de asignación de IP a través de la red hasta encontrar el servidor de DHCP que se la proporcione, pues bien, toda la tarea e intercambio de información lo está realizando el servicio de DHCP de Windows, que al final no será más que una aplicación que se ejecutará en un momento dado.

### Podríamos decir que un proceso es una aplicación con la que podemos trabajar conscientemente y sobre la que tendremos el control,
mientras que un servicio es una aplicación con la que trabajará el propio sistema operativo y sobre la que no tenemos más control que únicamente detenerla o ponerla en ejecución, los procesos los percibimos y trabajamos con ellos a diario, mientras que los servicios están en la sombra trabajando para el correcto funcionamiento de Windows.

## HILO

### ¿Qué es un hilo de ejecución?

También llamado hebra, proceso ligero, flujo, subproceso o “thread”. Es programa en ejecución que comparte la imagen de memoria y otros
recursos del proceso con otros hilos. Desde el punto de vista de programación: Función cuya ejecución se puede lanzar en paralelo con otras. Un proceso puede contener uno o más hilos.

Esto le da al procesador un grado mayor de flexibilidad en la forma en que administra las tareas. Los hilos son las unidades de instrucciones de procesamiento más pequeñas que el sistema operativo le da al procesador. Usar múltiples hilos para correr un solo programa es más eficiente pues el programa en cuestión puede llevar a cabo múltiples tareas al mismo tiempo.

Objetivo:
Los procesos son divididos en hilos. Un solo programa puede estar conformado por uno o más procesos que, a su vez, se dividen en hilos. Los hilos de un proceso comparten comandos y código y acceden a los recursos del sistema de forma simultánea para completar sus tareas más rápidamente.

## PROGRAMACIÓN CONCURRENTE

### ¿Qué es la programación concurrente?

Hace referencia a las técnicas de programación que son utilizadas para expresar la concurrencia entre tareas y solución de los problemas de comunicación y sincronización entre procesos. La programación concurrente es la ejecución simultánea de múltiples tareas interactivamente. Estas tareas pueden ser un conjunto de procesos o hilos de ejecución creados por un único programa. Las tareas se pueden ejecutar en una sola CPU (multiprogramación), en varios procesadores, o en una red de computadores distribuidos.

### Ventajas

- Permite optimizar el uso de recursos en sistemas mono/multiprocesador.
- Fiable administración de los datos en sistemas con gran información
- Mejor aprovechamiento de la CPU
- Permite el desarrollo de aplicaciones que no se vean afectadas en tiempo real
- Permite compartir recursos entre tareas lentas y tareas rápidas para que las tareas lentas no retrasen mucho a las rápidas.
- Velocidad de ejecución.
- Menores tiempos de respuesta.

### Desventajas

- Consumos de recursos cuando hay excesos de hilos o procesos
- Dificultad de desarrollo.
- Dificultad de verificación.
- En programas con pocas instrucciones en mas lento
- Si se aplica mal puede llevar a resultados erroneos.

### "Un programa es concurrente si puede soportar dos o más acciones en progreso.

### Un programa es paralelo si puede soportar dos o más acciones ejecutándose simultáneamente."

## PROGRAMACIÓN PARALELA

### ¿Qué es la programación paralela?

La computación paralela es el uso de múltiples recursos computacionales para resolver un problema. Se distingue de la computación secuencial en que varias operaciones pueden ocurrir simultáneamente.

En el sentido más simple, la computación paralela es el uso simultáneo de múltiples recursos computacionales para resolver un problema computacional:

Un problema se divide en partes discretas que se pueden resolver simultáneamente
Cada parte se descompone en una serie de instrucciones
Las instrucciones de cada parte se ejecutan simultáneamente en diferentes procesadores
Se emplea un mecanismo global de control/coordinación

### Ventajas

- Resuelve problemas que no se podrían realizar en una sola CPU
- Resuelve problemas que no se pueden resolver en un tiempo razonable
- Permite ejecutar problemas de un orden y complejidad mayor
- Permite ejecutar código de manera más rápida (aceleración)
- Permite ejecutar en general más problemas
- Obtención de resultados en menos tiempo
- Permite la ejecución de varias instrucciones en simultáneo
- Permite dividir una tarea en partes independientes

### Desventajas

- Mayor consumo de energía
- Mayor dificultad a la hora de escribir programas
- Dificultad para lograr una buena sincronización y comunicación entre las tareas
- Retardos ocasionados por comunicación ente tareas
- Número de componentes usados es directamente proporcional a los fallos potenciales
- Condiciones de carrera
- Múltiples procesos se encuentran en condición de carrera si el resultado de los mismos depende del orden de su llegada
- Si los procesos que están en condición de carrera no son correctamente sincronizados, puede producirse una corrupción de datos

... Fuente http://ferestrepoca.github.io/paradigmas-de-programacion/paralela/paralela_teoria/index.html

## PROGRAMACIÓN DISTRIBUIDA

### ¿Qué es la programación distribuida?

La programación distribuida es un paradigma de programación enfocado en desarrollar sistemas distribuidos, abiertos, escalables, transparentes y tolerantes a fallos. Este paradigma es el resultado natural del uso de las computadoras y las redes.

Casi cualquier lenguaje de programación que tenga acceso al máximo al hardware del sistema puede manejar la programación distribuida, considerando una buena cantidad de tiempo y código.

La programación distribuida típicamente cae en alguna de las varias arquitecturas básicas o arquitecturas: cliente-servidor, 3-tier, n-tier, objetos distribuidos, entre otras además de ser base para la pragmaticidad. Los lenguajes específicamente diseñados para programación distribuida son: Ada, Alef, E, Erlang, Limbo y Oz.

### Las aplicaciones distribuidas independientemente  de su arquitectura, comparten ciertas caracteristicas como son:

- Concurrencia, todas las aplicaciones distribuidas son utilizadas por varios usuarios concurrentemente, es decir las transacciones, el uso de los equipos, los bloqueos a recursos, son factores determinantes para diseñar la arquitectura de manera eficiente.

- Topologia de red, aunque los anchos de banda cada vez son mas amplios, se debe tener en cuenta eel tipo de red (LAN o WAN), y si la aplicacion debe ser accesible a traves de Internet, determinando la distribucion de sus procesos, teniendo presente el tipo de red que soportara el trafico de datos.

- Ubicacion de la logica, hay que tener presente que las aplicaciones distribuidad intervienen varios procesos, por lo que es necesario decidir en cual de los posibles procesos fisicos se situa cada componente logico de la aplicacion.

- Homogeneidad de las plataformas, en las aplicaciones distribuidas los sistemas operativos o los lenguajes de programacion utilizados son factores a tener en cuenta, a la hora de decidir el modo de transferencia de datos entre procesos, donde la utilizacion de los estandares son muy utiles en el desarrollo de las aplicaciones.

- Seguridad, mantener los procesos de una forma u otra, conlleva al aumento de la vulnerabilidad de las aplicaciones distribuidas, es importante establecer politicas de seguirdad que impida en acceso no autorizado a los procesos, buen diseño de la infraestructura de red, ajuste de los requerimientos, etc.

