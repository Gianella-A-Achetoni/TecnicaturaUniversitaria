from abc import ABC, abstractmethod 

class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
           self.ancho = ancho
        else :
            self.ancho = 0
            print('Valor erroneo para el ancho: {ancho}' )
           
        if self._validar_valores(alto):
            self.alto = alto
        else:
            self.alto = 0
            print("Valor erroneo para el alto: {alto}")
        
    #get and setter ancho
    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
           self._ancho = ancho
        else:
            print('Valor erroneo de ancho: ', ancho)
        
    #get and setter alto
    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
           self._alto = alto
        else:
            print('Valor erroneo de alto: ', alto)
    def __str__(self):
        return f'Figura Geometrica [Alto: {self._alto} y ancho: {self._ancho} ]'
    
    @abstractmethod
    def calcular_area():
        pass
    
    def _validar_valores(self, valor):
        return True if 0 < valor < 10 else False