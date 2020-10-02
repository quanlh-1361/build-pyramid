rows=int(input("Enter the number of rows: "))
for i in range(1, rows):
  k=0
  for space in range(1, rows-i):
    print("  ", end='')
  space+=1
  while (k != 2 * i - 1):
    print("* ", end='')
    k+=1
  i+=1
  print("\n")
