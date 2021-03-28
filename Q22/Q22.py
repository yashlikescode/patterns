#Pattern to be Made :
# if  N_Pattern = 5
#  
#  print ->
#           0 1 2 3 4 
#           1 2 3 4 5
#           2 3 4 5 6
#           3 4 5 6 7
#           4 5 6 7 8


def printPattern(N_pattern):
    start_ind = 0
    end_ind = N_pattern
    
    while start_ind<N_pattern:
        for printInd in range(start_ind,end_ind):
            print (printInd, end=' ')
        print('\r')
        start_ind = start_ind + 1
        end_ind = end_ind + 1








if __name__ == '__main__':
    N_pattern = int(input("Please enter the number of rows :"))

    printPattern(N_pattern)
