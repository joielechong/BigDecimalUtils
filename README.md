BigDecimalUtils [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-BigDecimalUtils-green.svg?style=true)](https://android-arsenal.com/details/1/3002)
=======
A Small BigDecimal Comparison and Calculation Utility for Java and Android.

Much of the comparison code (if not all) are heavily taken from [Representing money](http://www.javapractices.com/topic/TopicAction.do?Id=13).

Why 
--------------
We need to work with BigDecimal when working with monetary value because double or float [are not recommended](http://www.javapractices.com/topic/Topic213.cjp) since they always carry small rounding differences.

So we need to make comparison and calculation of BigDecimal. 

We can use **compareTo** method for comparison, but it too error prone and lacks readability.

Furthermore, doing calculation with BigDecimal is so unnatural.

How It Work
------------------------
- Import library to your code:
```java
	import static com.github.joielechong.BigDecimalUtils.*;
```
- Doing comparison:
```java
    if(is(income).lt(amount)) {
      // ....
    }else {
      // ...
    }
```
- Do calculation:
```java
    remain = calculate(income).min(expense);
```    

Other methods currently in this library
------------------------
```java
      is(bigdecimal).eq(four);    // Equal
      is(bigdecimal).gt(two);     // Greater than
      is(bigdecimal).gteq(one);   // Greater than equal
      is(bigdecimal).lt(two);     // Less than
      is(bigdecimal).lteq(two);   // Less than equal
 
      calculate(bigdecimal).min(bigdecimal)   // subtraction
      calculate(bigdecimal).plus(bigdecimal)  // addition
      calculate(bigdecimal).div(bigdecimal)   // division
```
      
      
Currently comparison support only String and BigDecimal:
```java
      is(bigdecimal).eq(bigdecimal);    // BigDecimal and BigDecimal
      is(bigdecimal).eq("1000");        // BigDecimal and String
      is("1000").lt("2000");            // String and String
      is("1000").lt(bigdecimal);        // String and BigDecimal
```
       
Calculation support some of int, long, float, and BigDecimal (please check the library):
```java
      calculate(bigdecimal).min("500")  // String and String
      calculate("1000").min("500")      // String and String
      calculate(100).min("500")         // int and String
      calculate(1l).min("500")          // long and String
```
#Todo
Add robust check for numeric string input.

#Credits

> Joielechong | [www.rilixtech.com](http://www.rilixtech.com/) | [twitter](https://twitter.com/joielechong)

> Hirondelle Systems | [http://www.javapractices.com/](http://www.javapractices.com/)

#License

    Copyright 2016 Joielechong, Rilixtech.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
