def greatestNumber(array): #O(n²)
  for i in array:
    isIValTheGreatest = True
    for j in array:
      if j > i:
        isIValTheGreatest = False
    if isIValTheGreatest:
      return i
    
# Ejercicio01
def greatestNumb(array): #O(n)
  # Buscará dentro del array el mayor número
  max = array[0]
  for i in array:
    if (i != array[0] and i > max):
      max = i
  return max

# Ejercicio02
def every_other(array):
  for index, num in enumerate(array):
    if index % 2 == 0:
      for ob in array:
        print(str(num) + " + " + str(ob))

  # Complejidad de O(n²)

# Ejercicio03
def twoSum(array):
  for i in range(len(array)):
    for j in range(len(array)):
      if (i != j and array[i] + array[j] == 10):
        return True
  
  return False

res = twoSum([1, 8, 9, 2, 7, 3])
print(res)
