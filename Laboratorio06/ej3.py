# Ejercicio03

import math
def minArray(a):
  # Busca el menor elemento dentro del array ordenado (rotado o no) 
  # utilizando la búsqueda binaria
  N = len(a)
  L = 0
  R = N - 1
  while L <= R:
    mid = L + math.floor((R - L) / 2)
    if(a[mid] < a[mid - 1]):
      return a[mid]

    if a[mid] > a[R]:
      L = mid + 1
    elif a[mid] < a[R]:
      R = mid - 1


# TEST
arr = [6, 7, 9, 15, 19, 2, 3]
res = minArray(arr)
print(res)
