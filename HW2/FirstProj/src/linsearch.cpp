#include <iostream>
using namespace std;

int main2() {
	int i,x;
	int a[10]={5,7,2,3,7,9,8,0,78,89};
	cout<<"The original array is\n";

	for(i=0;i<10;i++)
	{
		cout<<a[i]<<"\n";
	}
	cout<<"Enter the element to be searched\n";
	cin>>x;

	for (i=0;i<10;i++)
	{
		if (a[i]==x)
		cout<<"Element found at position"<<i+1;
	}
	return 0;
}
