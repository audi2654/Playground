#include<iostream>
using namespace std;
struct Employee{
	char name[100];
  	int eId;
  	int age;
  	char desi[100];
  	float sal;
};
int main(){
Employee e;
  cout<<"Enter name:\n";
  cin>>e.name;
  cout<<"Enter ID:\n";
  cin>>e.eId;
  cout<<"Enter age:\n";
  cin>>e.age;
  cout<<"Enter designation:\n";
  cin>>e.desi;
  cout<<"Enter Salary:\n";
  cin>>e.sal;
  cout<<"Employee Details\n";
  cout<<"Name of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.eId;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.desi;
  cout<<"\nSalary of the Employee : "<<e.sal;
  return 0;
}