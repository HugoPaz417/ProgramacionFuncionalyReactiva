def integracion(f: Double=>Double, a: Double, b: Double): Double = {
  val metSim = (b - a) * (f(a) + 4 * f((a+b)/2) + f(b)) / 6
  metSim
}
def errorIntegral(vE: Double, vO: Double):Double = math.abs(vE-vO)

def integracion_n1(x: Double): Double = -math.pow(x,2)+(8*x)-12
val valorEsperado_n1 = 7.33
val valorObtenido_n1 = integracion(integracion_n1,3,5)
errorIntegral(valorEsperado_n1,valorObtenido_n1)


def integracion_n2(x: Double): Double = 3*math.pow(x,2)
val valorEsperado_n2 = 8
val valorObtenido_n2 = integracion(integracion_n2,0,2)
errorIntegral(valorEsperado_n2,valorObtenido_n2)


def integracion_n3(x: Double): Double = (x+2*math.pow(x,2)-math.pow(x,3)+5*math.pow(x,4))
val valorEsperado_n3 = 3.333
val valorObtenido_n3 = integracion(integracion_n3,-1,1)
errorIntegral(valorEsperado_n3,valorObtenido_n3)


def integracion_n4(x: Double): Double = (2*x+1)/(math.pow(x,2)+x)
val valorEsperado_n4 = 1.09861
val valorObtenido_n4 = integracion(integracion_n4,1,2)
errorIntegral(valorEsperado_n4,valorObtenido_n4)


def integracion_n5(x: Double): Double = math.pow(2.718,x)
val valorEsperado_n5 = 1.71828
val valorObtenido_n5 = integracion(integracion_n5,0,1)
errorIntegral(valorEsperado_n5,valorObtenido_n5)


def integracion_n6(x: Double): Double = 1/(math.sqrt(x-1))
val valorEsperado_n6 = 0.828427
val valorObtenido_n6 = integracion(integracion_n6,2,3)
errorIntegral(valorEsperado_n6,valorObtenido_n6)


def integracion_n7(x: Double): Double = 1/(1+math.pow(x,2))
val valorEsperado_n7 = 0.785398
val valorObtenido_n7 = integracion(integracion_n7,0,1)
errorIntegral(valorEsperado_n7,valorObtenido_n7)
