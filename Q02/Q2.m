% Taking user input
n = input("Enter Number of Rows: ");

% Printing rows
for i = 1:n
    
    % Printing Spaces
    for j = 1:i-1
        fprintf(" ")
    end
    
    % Printing Stars
    for j = n+1-i:-1:1
        fprintf("*")
    end
    fprintf("\n")
end
