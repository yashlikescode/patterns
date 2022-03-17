x = input("Enter Height: ")
for i = 1:x
    for j = 1:i
        fprintf("*");
    end
    fprintf("\n");
end
for i = 1:x-1
    for j = 1:x-i
        fprintf("*");
    end
    fprintf("\n");
end