# Ejercicio03
def twoSum(array):
  # Recorre todo el array buscando 2 números que sumen 10
  # retorna True si los encuentra
  for i in range(len(array)):                     #O(n)
    for j in range(len(array)):                   #O(n)
      if (i != j and array[i] + array[j] == 10):
        return True
  
  return False
  # Complejidad de O(n²)

res = twoSum([1, 6, 3, 5, 7])
print(res)
