/*
 * bubblesort.cpp
 *
 *  Created on: Feb 7, 2014
 *      Author: Pooja
 */
#include <iostream>
using namespace std;

class bubble //complexity is 0(n2)
{
public:
	void bubblesort(int a[])
	{
		int j,temp;
		for(j=0;j<6;j++)
		{
			if (a[j]>a[j+1])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}

		}
for(j=0;j<6;j++){
	cout<<a[j]<<"\n";
}

	}
	};

int main() {

	int a[6];
	bubble b;

	//cout<<"Enter the elements of the array\n";

	for(int i=0;i<6;i++)
	{

		cout<<"Enter the "<<i<<"th element";
		cin>>a[i];
	}
	cout<<"the array after sorting is\n";
	b.bubblesort(a);

	return 0;
}



