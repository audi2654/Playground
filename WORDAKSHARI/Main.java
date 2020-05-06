#include<iostream>
#include<cstring>
#include<string>
using namespace std;
int main(){
string s[10];
int count;
for(int i=0;i<10;i++){
  cin>>s[i];
  if(s[i][0]=='#'){
   	count=i;
    break;
  }
}
count++;
string res[count];
res[0]=s[0];
int n=1;
for(int i=0;i<count;i++)
{
    	if(s[i][0] == res[n-1].back())
        {
        	res[n]=s[i];
          	n++;
        }
}
for(int i=0;i<n;i++)
  cout<<res[i]<<"\n";
}