#include<iostream>

int main()

{

 // Type your code here

 int n,i;

 i=0;

 std::cin>>n;

 do{

   n=n/10;

   i++;

 }while(n>0);

 std::cout<<i;

}