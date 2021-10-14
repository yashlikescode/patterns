n = input("Enter Number of Rows: ");
for i = 1:n
    for j = n+1-i:-1:1
        fprintf("*")
    end
    fprintf("\n")
end
