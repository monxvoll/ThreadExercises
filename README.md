# Ejercicios de Multihilos en Java

Este repositorio contiene una serie de ejercicios prácticos diseñados para explorar y dominar el uso de hilos, concurrencia y paralelismo en Java. 

## Contenido de los Ejercicios

### 1. Contador Concurrente con Sincronización
- Implementar una clase `Contador` con métodos sincronizados.
- Crear tres hilos que incrementen un contador compartido.
- Utilizar `join()` para coordinar la finalización de los hilos.
- **Objetivo:** Practicar la sincronización para evitar condiciones de carrera.

### 2. Cálculo de Factoriales con Hilos Anidados
- Dividir el cálculo de un factorial grande en subtareas manejadas por varios hilos.
- Combinar los resultados parciales en el hilo principal.
- **Objetivo:** Aprender a dividir tareas y coordinar resultados parciales.

### 3. Hilo de Temporizador con Interrupción
- Implementar un temporizador de 10 segundos.
- Permitir que el usuario lo interrumpa antes de finalizar.
- **Objetivo:** Practicar el uso de interrupciones y control de ejecución de hilos.

### 4. Búsqueda Concurrente en una Lista
- Dividir una lista en partes para buscar un elemento en paralelo.
- Coordinar la finalización cuando un hilo encuentra el elemento.
- **Objetivo:** Optimizar tareas de búsqueda y comunicación entre hilos.

### 5. Problema Productor-Consumidor
- Implementar un buffer compartido entre productor y consumidor.
- Usar `wait()` y `notify()` para coordinar el acceso al recurso compartido.
- **Objetivo:** Dominar la coordinación entre hilos.

### 6. Simulación de Carreras de Hilos
- Simular una carrera entre cinco hilos, donde cada hilo avanza de manera aleatoria.
- Finalizar la carrera cuando uno de los hilos gane.
- **Objetivo:** Practicar el uso de hilos y simular condiciones de competencia.

### 7. Barrera Cíclica
- Implementar una barrera donde varios hilos esperan a que todos lleguen antes de continuar.
- **Objetivo:** Coordinar la ejecución sincronizada en fases específicas.

### 8. Cálculo Paralelo de Promedio y Desviación Estándar
- Calcular el promedio en un hilo y la desviación estándar en otro.
- Usar `join()` para coordinar las dependencias entre los hilos.
- **Objetivo:** Coordinar tareas dependientes entre hilos.

## Requisitos Previos
- Java 8 o superior.
- Conocimientos básicos sobre programación en Java.
- Familiaridad con conceptos de concurrencia y multithreading.

## Cómo Usar Este Repositorio
1. Clona el repositorio:
   ```bash
   git clone https://github.com/monxvoll/ThreadExercises.git
   ```
