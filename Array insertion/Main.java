#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],m,p;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>p;
  if(p>n)
    cout<<"Invalid Input";
  else
  {
  p--;
  cout<<"Enter the value to insert\n";
  cin>>m;
for(int i=n+1;i>p;i--)
  a[i]=a[i-1];
 a[p]=m;
  cout<<"Array after insertion is\n";
  for(int i=0;i<n+1;i++)
    cout<<a[i]<<"\n";
  }
  return 0;
}