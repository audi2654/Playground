#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,max=0;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
   for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(a[i][j]>max)
      {
        max=a[i][j];
    }
    }
  }
  cout<<"The maximum element is "<<max;
}