I have a dream,  
I have a dream that, anyone in the world, who is stuck in patterns will get help from this repository.
Dear people of world, please have a look at the patterns given below and write code to print that code after taking an input from user,
Each folder in this repository, contains codes of corresponding patterns,  


If the patterns are not visible   
use that pencil logo on top right corner to see the patterns  

##Please write code to whichever language you know and make them available for learners.
##Pleaase add more patterns if you like.  


Following patterns should be printed when user input is "5":  

Q1)  
   \*****  
   \****  
   \***  
   \**  
   \*  


Q2)  
\*****  
 \****  
  \***  
   \**  
    \*  


Q3)  
\*  
\**  
\***  
\****  
\*****  
 

Q4)  
    \*  
   \**  
  \***  
 \****  
\*****  


Q5)  
\*********  
 \*******  
  \*****  
   \***  
    \*  


Q6)  
    \*  
   \***  
  \*****  
 \*******  
\*********  
 

Q7)  
\*  
\**  
\***  
\****  
\*****  
\****  
\***  
\**  
\*  


Q8)  
    \*  
   \**  
  \***  
 \****  
\*****  
 \****  
  \***  
   \**  
    \*  


Q9)  
    \*  
   \***  
  \*****  
   \***  
    \*  

<pre>
Q10)  
*****  
*   *  
*   *  
*   *  
*****  


Q11)  
    1
   1 2
  1 2 3 
 1 2 3 4
1 2 3 4 5


Q12)  
1 2 3 4 5
 1 2 3 4
  1 2 3 
   1 2
    1


Q13)  
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1


Q14)
***** *****
****   ****
***     ***
**       **
*         *

*         *
**       **
***     ***
****   ****
***** *****


Q15)
**********
 ********
  ******
   ****
    **
    **
   ****
  ******
 ********
**********

```c++
#include <iostream>

int main(){
    int input = 0;
    std::cin >> input;
    
    int size = input * 2;
    char array[size];
    
    // finds the two mid points
    int leftStars = (size/2)-1;
    int rightStars = size/2;
    
    for(int c1=0; c1<size; c1++){
        array[c1] = '*';
    }
    
    for(int c2=0; c2<size; c2++){
        //subtracts stars from out to in (->**<-)
        if (c2>0 && c2<(size/2)){
            array[c2-1] = ' ';
            array[size-c2] = ' ';
        }
        //adds stars to left and right of midpoints (<-**->)
        if (c2>(size/2) && c2<size){
            array[leftStars-1]='*';
            array[rightStars+1] = '*';
            leftStars--;
            rightStars++;
        }
        // prints the array for each line
        for(int c3=0; c3<size; c3++){
            std::cout << array[c3];
            }
            std::cout << std::endl;
    }
    return 0;
}
```