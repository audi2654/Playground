#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,d1=0,d2=0;
  cin>>n;
  int a[5][5];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    //cout<<a[i][j];
  }
  }
  for(int i=0;i<n;i++)
  {
    d1+=a[i][i];
    d2+=a[i][n-i-1];
  }
  if(d1==d2)
    cout<<"Yes";
  else
    cout<<"No";
}