InputStreamReader isr   =   new InputStreamReader(System.in)
BufferedReader    bfr   =   new BufferedReader (isr)

def nombre  =   bfr.readLine()
println "Hola $nombre"