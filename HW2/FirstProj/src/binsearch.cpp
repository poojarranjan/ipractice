#include <iostream>
using namespace std;

class binsearch{
public:
int binarysearch(int a[],int first, int last, int p )//complexity is 0(log n)
{
	int mid=(first+last)/2;
	if(p==a[mid])
	cout<<"Element found at position"<<mid;
	else if (p>a[mid])
	binarysearch(a,mid+1,last,p);
	else
	binarysearch(a,first,mid-1,p);
	return mid;

}
};
int main3() {
	int a[10], i,p,first=0,last=9;
	cout<<"\nEnter the array elements123";
	for(i=0;i<10;i++)
	{
	cin>>a[i];
	}

	cout<<"\nEnter the element to be searched\n";
cin>>p;

binsearch b;
b.binarysearch(a,first,last,p);
return 0;

}
