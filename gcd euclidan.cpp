// program for finding gcd using euclidian therom
//An efficient solution is to use Euclidean algorithm which is the main algorithm used for this purpose. 
//The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number.


#include <iostream>
using namespace std;
int gcd(int a, int b) {
    
    // this is for case 0
    if(a==0||b==0)
    {
        return 0;
    }
    
    
    //it is the base case 
    //from there it exist
    if(a==b)
    {
        return a;
    }
    
    
    //a is greater 
    if(a>b)
     {
         return gcd(a-b,b);
     }
     
     // if b is greater 
     else return gcd(b-a,a);
    
}

int main()
{
    
    int m=9;
    int n=8;
    cout<<gcd(m,n);
}