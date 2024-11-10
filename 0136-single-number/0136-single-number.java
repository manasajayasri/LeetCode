class Solution {
    public int singleNumber(int[] nums) {
         int single = 0; 
        for (int num : nums) {
            single = single ^ num; 
        }
        return single;
    }
}

/* When you use the XOR operation on two identical numbers, the result is 0. For example:

1⊕1=0
1⊕1=0
2⊕2=0
2⊕2=0
3⊕3=0
3⊕3=0
Now, if you use the XOR operation on a series of numbers where each number appears twice except for one, every pair of identical numbers will cancel each other out, leaving only the unique number. Here’s why:

The XOR operation is both commutative and associative. This means the order in which you apply it doesn't matter.
Let’s consider a simple array to see how it works: 
[2,3,2]
[2,3,2]

Start XOR-ing from the beginning:
2⊕3=1
2⊕3=1 (This intermediate result doesn’t represent a real number from the array; it’s just part of the process.)
Continue with the next number:
1⊕2=3
1⊕2=3
The last result, 3
3, is the number that doesn’t have a duplicate and thus doesn't get canceled out.

So in a longer list where every number except one appears twice, the XOR operation will cancel all pairs, and only the unique number will remain. This unique number is what the function returns.

In practice, you don’t have to worry about the intermediate results or even fully understand how they come about. Just know that if you XOR all numbers together, the one that isn't a duplicate will be the result at the end */

