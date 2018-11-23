# Planificación de Procesos

## 1- FIFS (First In First Served)

Conocido como FCFS (First Come First Served). Este algoritmo emplea una cola de procesos, asignando un lugar a cada proceso por el orden de llegada. Cuando el proceso llega es puesto en su lugar en la cola después del que llegó antes que él y se pone en estado de listo. Cuando un proceso comienza a ejecutarse no se interrumpe su ejecución hasta que termina de hacerlo.

Algunas de las características de este algoritmo es que es no apropiativo y justo en el sentido formal, aunque injusto en el sentido de que: los trabajos largos hacen esperar a los cortos y los trabajos sin importancia hacen esperar a los importantes. Por otro lado es predecible pero no garantiza buenos tiempos de respuesta y por ello se emplea como esquema secundario.

### Como funciona

https://www.youtube.com/watch?v=y92nrgoKAHY

### Ventajas

- Optimiza: utilización
- Muy fácil de implementar (cola FIFO)

### Desventajas

- No optimiza: el tiempo de espera, retorno, rendimiento. Muy variables en función del orden de llegada y de la duración de intervalos de CPU.
- No adecuado para sistemas interactivos.

## 2- SJF (SHortest Job First)

El algoritmo SJF (Shortest-Job-First) se basa en los ciclos de vida de los procesos, los cuales transcurren en dos etapas o periodos que son: ciclos de CPU y ciclos de entrada/salida, también conocidos por ráfagas.

La palabra shortest (el más corto) se refiere al proceso que tenga el el próximo ciclo de CPU mas corto. La idea es escoger entre todos los procesos listos el que tenga su próximo ciclo de CPU más pequeño.
El SJF se puede comportar de dos formas:

Con Desalojo: Si se incorpora un nuevo proceso a la cola de listos y este tiene un ciclo de CPU menor que el ciclo de CPU del proceso que se está ejecuando,entonces dicho proceso es desalojado y el nuevo proceso toma la CPU.
Sin desalojo: Cuando un proceso toma la CPU, ningún otro proceso podrá apropiarse de ella hasta que que el proceso que la posee termine de ejecutarce.

El SJF se considera como un algoritmo óptimo, porque da el mínimo tiempo de espera promedio para un conjunto de procesos, así como las estimaciones de CPU. Su dificultad radica en que materialmente es un algoritmo imposible de implementar .


### Como funciona

- Asociar a casa proceso el tiempo de ráfaga de CPU: una vez llega cada proceso se le asigna tiempo de ráfaga de CPU, que son las unidades de tiempo que requieren para que  el proceso  se ejecute completamente.
- Selecciona el proceso con menor ráfaga de CPU: antes de ejecutar cada proceso el algoritmo prioriza cual es el proceso mas corto a ejecutar. 
- En caso de empate aplicar FIFO: si llega a presentarce empate en dos o mas procesos de rafaga de CPU, el algoritmo cambia a priorizar primero en entrar primero en salir, algoritmo FIFO. 
- Algoritmo no expulsivo: una vez se empieza a ejecutar cada proceso no será interrumpido hasta finalizar. 

### Ventajas

- Asocia a cada proceso un tiempo aproximado de utilización de CPU
- Asigna la CPU al proceso con menor tiempo asociado
- Cuando un proceso consigue la CPU la conserva hasta que
- Decide liberarla (no existe expulsión)

### Desventajas

- Estimación del tiempo de utilización de CPU por parte de un proceso (a veces se modela con técnicas estadísticas)

## 3- ROUND-ROBIN

El Round Robin es uno de los algoritmos más antiguos, sencillos y equitativos en el reparto de la CPU entre los procesos lo que significa que evita la monopolización de uso de la CPU, y es muy válido para entornos de tiempo compartido.

El algoritmo consiste en definir una unidad de tiempo pequeña, llamada "quantum" o "cuanto" de tiempo, la cual es asignada a cada proceso que está en estado listo. Si el proceso agota su quantum (Q) de tiempo, se elige a otro proceso para ocupar la CPU. Si el proceso se bloquea o termina antes de agotar su quantum también se alterna el uso de la CPU.

Es por ello que surge la necesidad de un reloj en el sistema. El reloj es un dispositivo que genera periódicamente interrupciones. Esto es muy importante, pues garantiza que el sistema operativo (en concreto la rutina de servicio de interrupción del reloj) coja el mando de la CPU periódicamente. El quantum de un proceso equivale a un número fijo de pulsos o ciclos de reloj. Al ocurrir una interrupción de reloj que coincide con la agotación del quantum se llama al despachador, el cual le cede el control de la CPU al proceso seleccionado por el planificador.

Un proceso puede abandonar la CPU por 2 criterios:

Libremente, si su tiempo de ejecución en la CPU es < Q (quantum).
Después de una interrupción, si su tiempo de ejecución en la CPU es > Q (quantum) o si el proceso se bloquea.

### Como funciona

Es un algoritmo de planificación de procesos simple de implementar, dentro de un sistema operativo se asigna a cada proceso una porción de tiempo equitativa y ordenada, tratando a todos los procesos con la misma prioridad.
Periódicamente, se genera una interrupción de reloj.
Se asigna un quantum de tiempo (10-100 ms.) de igual duración a todos los procesos listos para ser ejecutados. 

### Ventajas

- Es equitativo.
- Sencillo de implementar.
- Las prioridades no cambian.
- Es un algoritmo muy predecible.
- Como administrador de procesos están su facilidad en el manejo.

### Desventajas

- Puede haber pospuesta indefinida.
- Un Quantum corto disminuye el rendimiento de la CPU.
- Un Quantum muy largo empobrece los tiempos de respuesta.
