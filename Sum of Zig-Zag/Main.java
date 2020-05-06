#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
  int sum=0;
    for(int j=0;j<n;j++){
  		sum+=a[0][j];
		sum+=a[n-1][j];
    }
  for(int i=1;i<n-1;i++)
    sum+=a[i][i];
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}