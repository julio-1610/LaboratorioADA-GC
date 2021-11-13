# Ejercicio02

import math
def maxSearch(a, target):
  # Busca un elemento mayor cercano al que se desee
  # dentro del array utilizando la búsqueda binaria
  N = len(a)
  L = 0
  R = N - 1
  max = -1;
  while L <= R:
    mid = L + math.floor((R - L) / 2)
    if (a[mid] == target):
      return a[mid]
    if a[mid] < target:
      L = mid + 1
    elif a[mid] > target:
      max = a[mid]
      R = mid - 1
  return max

# TEST
arr = [2, 3, 5, 6, 8, 10, 12]
res = maxSearch(arr, 7)
print(res)