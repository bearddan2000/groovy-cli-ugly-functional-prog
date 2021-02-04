#!/usr/bin/env groovy

class Ugly {
    /*This function divides a by greatest divisible power of b*/
    def maxDivide(final int a, final int b)
    {
        if(a%b != 0) return a;
        final BigDecimal c = a/b;
        return maxDivide(c.intValue(), b);
    }

    /* Function to check if a number is ugly or not */
    def isUgly(final int no)
    {
        final int a = maxDivide(no, 2);
        final int b = maxDivide(a, 3);
        final int c = maxDivide(b, 5);

        return (c == 1)? 1 : 0;
    }

    /* Function to get the nth ugly number*/
    def getNthUglyNo(final int n, final int i, final int count /* ugly number count */)
    {
        /*Check for all integers untill ugly count becomes n*/
        if (n < count) return i-1;
        if (isUgly(i) == 1) return getNthUglyNo(n, i+1, count+1);
        else return getNthUglyNo(n, i+1, count);
    }

	/* Driver program to test above
	functions */
	def main(String[] args)
	{
		final int input = 10;
		println("[INPUT] "+ input);
		final int output = getNthUglyNo(input,1,1);
		println("[OUTPUT] "+ output);
	}
}
new Ugly().main()
