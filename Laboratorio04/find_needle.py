# Ejercicio04
def find_needle(needle, haystack):
  # Buscará una secuencia de caracteres dentro de otra
  # retorna True si se encuentra
  nindex = 0
  hindex = 0

  found_needle = True
  while hindex < len(haystack):                         #O(n)
    if needle[nindex] == haystack[hindex]:
      while nindex < len(needle):
        if needle[nindex] != haystack[hindex + nindex]: #O(n)
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
