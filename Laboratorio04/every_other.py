# Ejercicio02
def every_other(array):
  # Cuando encuentre un número par dentro del array
  # mostraŕa las sumas con los demás números del mismo
  for index, num in enumerate(array):       #O(n)
    if index % 2 == 0:
      for ob in array:                      #O(n)
        print(str(num) + " + " + str(ob))

  # Complejidad de O(n²)
every_other([1, 2, 3, 4, 5])
