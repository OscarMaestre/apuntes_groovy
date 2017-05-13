:heading: value

.. contents::

TODO: Put intro here

Primeros pasos
=================================

Instalación de Grooy
------------------------------

Instalación

El primer programa
---------------------------

El primer programa típico suele ser este

.. literalinclude:: programas/hola_mundo.groovy
   :language: groovy
   
Y el resultado que veremos será el siguiente:

.. program-output:: groovy programas/hola_mundo.groovy

De la misma forma que podemos imprimir algo en pantalla con ``println`` podemos pedir al usuario que introduzca algo usando un objeto.

Bucles
---------------

Son tan sencillos como esto:

.. literalinclude:: programas/bucle1.groovy
   :language: groovy
   
Y el resultado que veremos será el siguiente:

.. program-output:: groovy programas/bucle1.groovy

Se puede definir una variable usando ``def``. **No es necesario indicar el tipo**, los tipos pueden cambiar. Si no ponemos el tipo, una variable aceptará almacenar cualquier cosa. Sin embargo, si indicamos el tipo, la variable exigirá que pasemos datos del tipo indicado. Obsérvese  el siguiente programa

.. literalinclude:: programas/variables1.groovy
   :language: groovy
   
Y obsérvese el resultado que veremos que será algo como lo siguiente:

.. program-output:: groovy programas/variables1.groovy
   :returncode: 1



Se pueden usar variables en el bucle como en el programa siguiente:

.. literalinclude:: programas/bucle_it.groovy
   :language: groovy
   
Cuyo resultado es:

.. program-output:: groovy programas/bucle_it.groovy


También se pueden hacer bucles de otra formas como usar el método ``upto`` en objetos ``Integer``. Tambiéne puede usar el método ``times`` de objetos ``Integer`` para ejecutar bucles. En este caso, se usa la variable interpolada ``$it`` para ver el resultado del bucle.

.. literalinclude:: programas/bucles_upto.groovy
   :language: groovy
   
Cuyo resultado es:

.. program-output:: groovy programas/bucles_upto.groovy

Como era de esperar un bucle que empieza por 0 y se ejecuta 4 veces implica que el contador del bucle vaya de 0 a 3.

Si deseamos bucles en los cuales no avancemos de 1 en 1 se puede usar el método ``step()``, como muestra el programa siguiente.

.. literalinclude:: programas/bucles_step.groovy
   :language: groovy
   
Cuyo resultado es:

.. program-output:: groovy programas/bucles_step.groovy

Problemas propuestos
======================

Saludo
--------
*Escribir un programa que pregunte al usuario su nombre y despues le salude*

Programa propuesto:

.. literalinclude:: programas/problemas/tema1/problema_1_1.groovy
   :language: groovy

Salida:

.. command-output:: echo "Pepe" | groovy programas/problemas/tema1/problema_1_1.groovy
   :shell:


Write a program that asks the user for her name and greets her with her name.
Modify the previous program such that only the users Alice and Bob are greeted with their names.
Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
Write a program that asks the user for a number n and gives him the possibility to choose between computing the sum and computing the product of 1,…,n.
Write a program that prints a multiplication table for numbers up to 12.
Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can easily represent is fine too.)
Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. I counts only as one try if they input the same number multiple times consecutively.
Write a program that prints the next 20 leap years.
Write a program that computes 