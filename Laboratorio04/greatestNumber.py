# Ejercicio01
def greatestNumber(array): 
  # Buscará dentro del array el mayor número
  max = array[0]
  for i in array:                         #O(n)
    if (i != array[0] and i > max):       
      max = i
  return max
  # Complejidad de O(n)
res = greatestNumber([2, 1 , 4, 5, 7])
print(res)
