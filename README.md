# SubtractAndAdd
Subtracting-Adding sequence via recursive meth.
This README's purpose is to give details about how code works.
Firstly we made an initial call in our main method by calling the subtactAndAdd(number, number, false) method, so we prepared a stage for it. The first number represents the number that will be decremented or added.
2) The second one is used to track the end of the sequence and false represents that "isAdding" is false, so we will start with subtracting.
3) Inside the subratctAndAdd method we start by printing the current number because if we don't the method itself won't work.
4)First if the condition is to check whether we are in adding phase, and; also, if our number equals the original number. If that's the case the method will stop the recursion.
5)If the first condition hasn't been met we look for the next condition. This condition will work if isAdding is true or the number is smaller than or equal to zero and the recursive call will 
start adding 5 until it becomes the original number.
6) If the second condition hasn't been met, we'll pass to the third one which works when the number is greater than zero, and it will start doing subtracting with a continuous recursive call.
and stop subtracting if the number becomes zero or a minus number.
The purpose of the recursive calls is to track the alteration between adding and subtracting and also printing the sequence at each step, yet the most important update the number after 
every recursive call so that we can make a loop without using one and reach our desired result.
