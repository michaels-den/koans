#include <iostream>
#include <vector>

using namespace std;
int check(int final_number);

// *************************************************
// *         Project Euler Problem #4              *
// *             Zacher Becker                     *
// *************************************************


int main()
{
  int int_one, int_two, final_number;

  //Nested loop to iterate through all possibilities Starting at highest and decrementing
  // to guarantee you stop at the highest valued-palindrome
  for (int_one = 999; int_one > 800; int_one--) {
    for(int_two = 999; int_two >800; int_two--) {
      final_number = int_one * int_two;
        if( check(final_number) == 1) {
           cout << "palindrome found.  we got: " << final_number << endl;
           cout << "This is a product of " << int_one << " * " << int_two << "\n";
           goto finished;
        }
    }
   }
  
 finished:
  
  return 0;
}



// Pass in each product and check the number if palindrome
int check(int final_number) {

  // Separate each product integer into a vector, so we can check each digit
  // by itself.  (This actually reverses the number, putting the LSD in front).
  // But that doesn't matter here since we are looking for a palindrome
  vector <int> vect;
  while(final_number > 0){
    vect.push_back(final_number % 10);
    final_number = final_number / 10;
  }

  // Now that we have 6 separate digits, check to see that the first and last digit
  // are the same, so too the 2nd and 5th, and 3rd and 4th.  Return when found
  if(vect.at(0) == vect.at(5) && vect.at(1) == vect.at(4) && vect.at(2) == vect.at(3)) {
    return 1;
  }
  
  return 0;
}
