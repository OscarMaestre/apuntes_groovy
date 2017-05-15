BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in))
print "Introduzca un número:"
n=Integer.parseInt(bfr.readLine())
print "Introduzca 's' para hacer la suma o 'p' para hacer el producto:"
operacion=bfr.readLine()
if (operacion=='s'){
    suma=0
    for (i in 1..n){
        suma = suma + i
    }
    println "La suma desde 1 hasta $n es:$suma"
}
if (operacion=='p'){
    producto=1
    for (i in 1..n){
        producto = producto * i
    }
    println "El producto desde 1 hasta $n es $producto"
}