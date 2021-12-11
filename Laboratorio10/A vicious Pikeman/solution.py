# Ejercicio 4

def solution(N, T, tasks):
	total, penalty = 0, 0
	for i, t in enumerate(tasks):
		if total + t > T:
			return i, penalty
		total += t
		penalty = (penalty + total) % 1000000007
	return N, penalty

def main(N, T, tasks):
	A = tasks[0]
	B = tasks[1]
	C = tasks[2]

	lis = [tasks[3]]
	for _ in range(1, N):
		lis.append(((A * lis[-1] + B) % C) + 1)
	return solution(N, T, sorted(lis))

# TEST
print(main(1, 3, [2, 2, 2, 1]))
print(main(2, 10, [2, 2, 2, 2]))