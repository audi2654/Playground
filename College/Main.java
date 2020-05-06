#include<iostream>
using namespace std;
struct College{
  char name[100];
  char city[100];
  int establishmentYear;
  float passPercentage;
};
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of colleges";
  cin>>n;
  struct College c[n];
  for(int i=0;i<n;i++){
 	cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
   // cin.getline(c[i].name,100);
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    //cin.getline(c[i].city,100);
    cout<<"\nEnter year of establishment";
    cin>>c[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>c[i].passPercentage;
  }
  cout<<"\nDetails of colleges\n";
  for(int i=0;i<n;i++){
  cout<<"College:"<<i+1<<"\n";
    cout<<"Name:"<<c[i].name<<"\n";
    cout<<"City:"<<c[i].city<<"\n";
    cout<<"Year of establishment:"<<c[i].establishmentYear<<"\n";
    cout<<"Pass percentage:"<<c[i].passPercentage<<"\n";
  }
}