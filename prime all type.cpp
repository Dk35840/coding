//Print the prime numbers 

// 1.Naive solution.
// basic steps

#include <iostream>
using namespace std;
int pm(int a) {
    
    for(int i=2; i<=a/2;i++){
        if(a%i==0)
         return 0 ;
       
            
    }
    
 
   return 1;
    
}

int main()
{
    
    
    int n=18;
    pm(n)>0?cout<<"true":cout<<"false";
    
}