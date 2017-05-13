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
   
Y obsérvese el resultado que veremos que será algo como siguiente:

.. program-output:: groovy programas/variables1.groovy




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