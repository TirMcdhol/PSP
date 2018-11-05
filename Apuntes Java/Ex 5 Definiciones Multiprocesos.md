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

