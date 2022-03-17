x = input("Enter Height: ");
for i = 1:x
    for j = 1:x
        if i == 1 || i == x || j == 1 || j == x
            fprintf("*");
        else
            fprintf(" ");
        end
    end
    fprintf("\n");
end