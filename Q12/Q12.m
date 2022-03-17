x = input("Enter Height: ");
count = 1;
for i = 1:x
    for j = 1:i-1
        fprintf(" ");
    end
    for j = 1:x-i+1
        fprintf("%d ",count);
        count = count + 1;
    end
    fprintf("\n");
    count = 1;
end