from FiguraGeometrica import FiguraGeometrica;
from Color import Color;

class Rectangulo(FiguraGeometrica,Color):
    def __init__(self, ladob, ladoa, color):
        FiguraGeometrica.__init__(self,ladoa,ladob)
        Color.__init__(self,color)
    
    def calcula_elarea(self):
        return self.alto * self.ancho
    
    def __str__(self):
        return f'{FiguraGeometrica.__str__(self)}, {Color.__str__(self)}'