#include <iostream>
#include <string>
using namespace std;
void findAllAnagrams(string X, string Y)
{

	int m, n;

	if ((m = Y.length()) > (n = X.length()))
		return;

	unordered_multiset<char> window;

	unordered_multiset<char> set;


	for (int i = 0; i < m; i++)
		set.insert(Y[i]);
	for (int i = 0; i < n; i++)
	{

		if (i < m)
			window.insert(X[i]);
	
		else
		{

			if (window == set)
			{
				cout << "Anagram " << X.substr(i - m, m) <<
					" present at index " << i - m << '\n';
			}
			auto itr = window.find(X[i - m]);
			if (itr != window.end())
				window.erase(itr);


			window.insert(X[i]);
		}
	}

	if (window == set)
	{
		cout << "Anagram " << X.substr(n - m, m) <<
			" present at index " << n - m << '\n';
	}
}

int main()
{
	string X = "XYYZXZYZXXYZ";
	string Y = "XYZ";

	findAllAnagrams(X, Y);

	return 0;
}
