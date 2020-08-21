//Compile --> C:\jsc bruteforce.js

function validar(s)
{
       var newpass = md5(s);
       print("String = "+s);

       if(newpass == "50919e396d88764943bb964e9424680c")  return true;
       else return false;
}

var base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
var contrasenia;
var longitud=base.length, i, j;// k, l, m;
var claves=0;
var passw=new Array(3);
print("MD5 BruteForcer");
Bucle5:
for(i=0; i<longitud; i++)
{
    passw[0]=base.charAt(i);
    
    for(j=0; j<longitud; j++)
    {
        passw[1]=base.charAt(j);
        
        for(k=0; k<longitud; k++)
        {
            passw[2]=base.charAt(k);
                
                contrasenia=passw[0]+""+passw[1]+""+passw[2];
                claves++;
                
                if(validar(contrasenia))
                {
                   print("PASS ENCONTRADO!!= " + contrasenia);
                   break Bucle5;
                }
        }
    }
}

print("No encontramos Nada Sorry");
