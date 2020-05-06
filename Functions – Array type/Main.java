#include<iostream>
using namespace std;
int arrayType(int n, int *a)
{
  int odd=0,even=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int res = arrayType(n,a);
  if(res==1)
    cout<<"The array is Even";
  else if(res==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  return 0;
   
}