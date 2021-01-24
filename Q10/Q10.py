def pattern(n):
	for i in range(n):
		if i==0 or i==n-1:
			for j in range(n):
				print(*,end='')
			print()

		else:
			for j in range(n):
				if j==0 or j==n-1:
					print(*,end='')
				else:
					print(' ',end='')
			print()





n=int(input())
pattern(n)


