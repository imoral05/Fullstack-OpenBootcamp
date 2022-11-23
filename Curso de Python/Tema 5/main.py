def EsAnoBisiesto(ano: int):
    if ano % 400 == 0 or ((ano % 100) != 0 and ano % 4 == 0):
        print(f"El año {ano} es bisiesto")
    else:
        print(f"El año {ano} no es bisiesto")


EsAnoBisiesto(2400)
