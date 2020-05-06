#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string a;
  getline(cin,a);
  char b[a.length()];
  int k=0;
  for(int i=0;i<a.size();i++)
  {
    if(((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z')))
      b[k++]=a[i];
  }
  b[k]='\0';
  cout<<b;
  
}