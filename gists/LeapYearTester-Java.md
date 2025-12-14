# Library code to check whether the input year is leap

## No need for those ugly-looking if-else
## No need for those so-long conditionals within if-blocks
Here we have a super simple and sleak utility code:
<pre>
    static boolean isLeapYear(int year) {
        if(year%400 == 0) return true;
        if(year%100 == 0) return false;
        if(year%4 == 0) return true;
        return false;
    }
</pre>