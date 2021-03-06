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

Una posibilidad es esta, pero exige que la entrada se teclee:

.. literalinclude:: programas/problemas/tema1/problema_1_1.groovy
   :language: groovy

Una variante quizá más aceptable sea esta, que permite que enviemos texto desde otro fichero que pueda actuar como "entrada tecleada" haciendo cosas como ``cat fich.txt | groovy problema.groovy``

Saludo selectivo
-----------------------
Modificar el programa anterior para que solo se salude con sus nombres a los usuarios Alice o Bob. El resto de personas simplemente verán el mensaje "Hola".

.. literalinclude:: programas/problemas/tema1/problema_1_1_2_saludo_selectivo.groovy
   :language: groovy

Suma de números
--------------------
Escribir un programa que pida al usuario un número *n* e imprima la suma de números desde 1 hasta *n*.

.. literalinclude:: programas/problemas/tema1/problema_1_2_suma_n.groovy
   :language: groovy


Operaciones selectivas
---------------------------
Crear un programa que pida al usuario un numero *n* y le ofrezca la posibilidad de hacer la suma o el producto de los valores comprendidos entre 1 y *n*.


.. literalinclude:: programas/problemas/tema1/problema_1_3_operaciones_selectivas.groovy
   :language: groovy

Write a program that prints a multiplication table for numbers up to 12.
Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can easily represent is fine too.)
Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small. At the end the number of tries needed should be printed. I counts only as one try if they input the same number multiple times consecutively.
Write a program that prints the next 20 leap years.
Write a program that computes 