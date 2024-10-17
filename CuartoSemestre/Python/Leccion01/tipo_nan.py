from decimal import Decimal
import math

# NaN = not a number
a = float('nan')
print(f'a = {a}')
#aplicación de math
a = float('nan')
print(f'Es NaN (Not a number)?: {math.isnan(a)}')
#modulo decimal
a = Decimal('nan')
print(f'Es NaN (Not a number)?: {math.isnan(a)}')