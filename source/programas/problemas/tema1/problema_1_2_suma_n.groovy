BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in))
println "Introduzca un número"
n=Integer.parseInt(bfr.readLine())
suma=0
for (i in 0..n){
    suma = suma + i
}
println "La suma total es $suma"