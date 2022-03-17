x = input("Enter Height: ");
count = 1;
for i = 1:x
    for j = 1:x-i
        fprintf(" ");
    end
    for j = 1:i
        fprintf("%d ",count);
        count = count + 1;
    end
    fprintf("\n");
    count = 1;
end