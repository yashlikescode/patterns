x = input("Enter Height: ")
for i = 1:x
    for j = 1:i-1
        fprintf(" ");
    end
    for j = 1:x-i
        fprintf("*");
    end
    for j = 1:x-i+1
        fprintf("*");
    end
    fprintf("\n");
end