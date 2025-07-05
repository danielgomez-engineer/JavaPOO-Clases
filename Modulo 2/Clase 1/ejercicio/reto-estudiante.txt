Reto de Programación - Clase 1: Modelando un Estudiante

este es el reto práctico de la Clase 1 del Módulo 2.

Vamos a aplicar lo aprendido sobre clases, objetos, atributos, métodos, encapsulamiento, constructores, getters y setters. 
El objetivo es que desarrollen un programa simple pero funcional que modele un estudiante.

Requisitos:

1. Crear una clase llamada `Estudiante` con los siguientes atributos **privados**:

   - nombre (String)
   - edad (int)
   - carrera (String)
   - promedio (double)
   - codigo (String)

2. Agregar lo siguiente:

Un constructor **parametrizado**  
Métodos **getters y setters** para todos los atributos:

Un método `mostrarInformacion()` que imprima todos los datos del estudiante  

Un método `esEstudianteDestacado()` que retorne `true` si el promedio es mayor o igual a 4.5  

Un método `subirPromedio(double puntos)` que aumente el promedio, sin pasarse de 5.0  

Un método `evaluarDesempeño()` que retorne un mensaje dependiendo del promedio del estudiante:
- "Excelente" si el promedio ≥ 4.5  
- "Bueno" si el promedio ≥ 3.5  
- "Aceptable" si el promedio ≥ 3.0  
- "Insuficiente" si el promedio < 3.0

3. Desde la clase `Main`, debes:

Crear al menos **2 o 3 objetos** de tipo `Estudiante`  
Usar **setters** y **getters**  
Mostrar la información de cada estudiante  
Mostrar si el estudiante es **destacado o no**  
Subir el promedio a uno de ellos  
Mostrar el resultado del método `evaluarDesempeño()` para cada uno

Un reto mas: (opcional):

- Crear un `ArrayList<Estudiante>` para guardar varios estudiantes
- Recorrerlos con un `for-each` y mostrar su información
- Mostrar cuántos estudiantes son destacados


¡Éxitos! Practicar es clave para dominar la programación.
