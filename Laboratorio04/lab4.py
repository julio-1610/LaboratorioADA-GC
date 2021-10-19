# Ejercicio01
def greatestNumber(array): #O(n)
  # Buscará dentro del array el mayor número
  max = array[0]
  for i in array:
    if (i != array[0] and i > max):
      max = i
  return max
res = greatestNumber([2, 1 , 4, 5, 7])
print(res)

# Ejercicio02
def every_other(array):
  for index, num in enumerate(array):
    if index % 2 == 0:
      for ob in array:
        print(str(num) + " + " + str(ob))
  # Complejidad de O(n²)
every_other([1, 2, 3, 4, 5])

# Ejercicio03
def twoSum(array):
  for i in range(len(array)):
    for j in range(len(array)):
      if (i != j and array[i] + array[j] == 10):
        return True
  
  return False
  # Complejidad de O(n²)

res = twoSum([1, 6, 3, 5, 7])
print(res)

# Ejercicio04
def find_needle(needle, haystack):
  nindex = 0
  hindex = 0

  found_needle = True
  while hindex < len(haystack):
    if needle[nindex] == haystack[hindex]:
      while needle_index < len(needle):
        if needle[nindex] != haystack[hindex + nindex]:
          found_needle = False
          break

      nindex += 1
    if found_needle: 
      return True

    hindex += 1

  return False
  # Complejidad de O(n²)

res = find_needle("fgh", "abcdefghi")
print(res)
      
      
