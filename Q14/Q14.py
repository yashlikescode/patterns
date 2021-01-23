def pattern(n):
	f=1
	for i in range(n):
		cnt=0

		for j in range(1,2*n+2):
			if j>n-i and cnt<f:
				print(" ",end='')
				cnt+=1
			else:
				print("*",end='')
		print()
		f+=2

	print('\n')
	x=2*n-1

	for i in range(n):
		cnt=0

		for j in range(1,2*n+2):
			if j > i+1 and cnt< x:
				print(" ",end='')
				cnt+=1

			else:
				print("*",end='')

		x-=2
		print()



n=int(input())
pattern(n)

