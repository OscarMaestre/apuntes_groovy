BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in))
print "Introduzca su nombre:"
linea=bfr.readLine()
if ( (linea=="Alice") || (linea=="Bob") ){
    println "Hola $linea"
} else {
    println "Hola"
}