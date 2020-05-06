#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n;
  cin>>m>>n;
  int a[m][n];
  int row[m],col[n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
      cin>>a[i][j];
  }
   for(int i=0;i<m;i++) {
     int sum=0;
    for(int j=0;j<n;j++) {
      sum+=a[i][j];
    }
     row[i]=sum;
  }
  for(int i=0;i<n;i++) {
    int sum=0;
    for(int j=0;j<m;j++) {
      sum+=a[j][i];
    }
     col[i]=sum;
  }
  cout<<"Sum of rows is ";
  int rmax=0;
  for(int i=0;i<m;i++)
  {
    cout<<row[i]<<" ";
    if(row[i]>row[rmax])
      rmax=i;
  }
  cout<<"\nRow "<<rmax+1<<" has maximum sum\n";
  int cmax=0;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
  {  cout<<col[i]<<" ";
  	if(col[i]>col[cmax])
      cmax=i;
  }
   cout<<"\nColumn "<<cmax+1<<" has maximum sum\n";
}