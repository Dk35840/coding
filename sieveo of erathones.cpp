//Print the prime numbers usng sieveo of eratosthenes
// sieveo of erathones is used to print prime number from 1 o upto n in the given number n
// 1.Naive solution.
// basic steps

#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int soe(int n) {
    
   
   bool prime[n+1];
   
   memset(prime,true,sizeof(prime));
   
   for(int i=2;i*i<=n;i++)
   {
       if(prime[i]==true)
            for(int j=i;j<=n/2;j++)
                {  prime[j*i]=false;
                     
                }
   }
   
   
   for(int i=2;i<=n;i++)
   {
       
       if(prime[i])
       {
           cout<<i<<',';
       }
   }
}

int main()
{
    
    
    int n=100;
   soe(n);
    
}