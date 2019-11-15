import re
"""
Un posible indice de un problema 
es que la rutina de validación (regex en este caso)
se define ad-hoc para este tipo de 
entradas específicas. 
Esto no significa inmediatamente que haya un problema, 
pero puede significar que hay un error mas a fonfo.

Tras varias pruebas, queda bastante claro 
que esto definitivamente es un input kludge. 
Cualquier dirección de correo electrónico válida 
con un sufijo de dominio menos común
(email@ddress.co, por ejemplo) sería rechazada.

Además, pasarían direcciones de 
correo electrónico no válidas (@ .com, por ejemplo).
"""
regex = '^\w*([\.-]?\w+)*@\w+([\.-]?\w+)*(\.(com|edu|net|org))+$'

def check(email):

    if (re.search(regex, email)):
        print("Valid Email")

    else:
        print("Invalid Email")


if __name__ == '__main__':

    email = "@gmail.com" #invalida pero admitida
    check(email)

    email = "my.ownsite@ourearth.org" #valida
    check(email)

    email = "ankitrai326@unal.co" #valida pero rechazada
    check(email)
