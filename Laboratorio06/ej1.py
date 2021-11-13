# Ejercicio 01

import math
def isSqrt(x):
  # Dice si un número es cuadrado utilizando la búsqueda binaria
  arr = [];
  for i in range(x):
    arr.append(i);
  N = len(arr)
  L = 0
  R = N - 1
  while L <= R:
    mid = L + math.floor((R - L) / 2)
    if (arr[mid] * arr[mid] == x):
      return True
    if arr[mid] * arr[mid] < x:
      L = mid + 1
    else:
      R = mid - 1
  return False

# TEST
res = isSqrt(16)
print(res)
res = isSqrt(20)
print(res)