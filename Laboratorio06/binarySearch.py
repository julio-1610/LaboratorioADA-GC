import math
def binarySearch(a, target):
  # Busca un elemento dentro del array utilizando
  # la búsqueda binaria
  N = len(a)
  L = 0
  R = N - 1
  while L <= R:
    mid = L + math.floor((R - L) / 2)
    if (a[mid] == target):
      return mid
    if a[mid] < target:
      L = mid + 1
    else:
      R = mid - 1
  return -1

# TEST
arr = [2, 3, 3, 4, 5, 7, 8, 9]
res = binarySearch(arr, 7)
print(res)