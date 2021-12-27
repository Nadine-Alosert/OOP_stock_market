Student name: Nadine Alosert
Student number: 190075882

Skype Name: live:nadinealosert
https://join.skype.com/invite/dRoKYWthV8mr

LEVEL YOU WISH THE MINI-PROJECT TO BE MARKED FOR: 1 / 2 / 3 

Now complete the statements below for each level you wish to be marked. Replace all text in square brackets.

LEVEL ONE

My code demonstrates inheritance in the following way...

I have a superclass called [Investment]

This superclass is extended into at least three subclasses called [share1, share2 , share3]

For each of the named subclasses complete the following...

Subclass 1.

Subclass [share1] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [maxEarningsForShare,minEarningsForShare,discountRate,growthRate]

These/this new properties/property are used by the subclass in the following way: [maxEarningsForShareused to give a maximum expected earnings collected by the workers within that share per period of time so that the simulator can give advice to the user, used in lines 11,19,25-26,30,91,98.
minEarningsForShare used to give a minimum expected earnings collected within the workforce per share per period of time so that the simulator can give advice to the user, used in lines 12,20,34-35,39,92,101. discountRate used as constants for calculations within methods in lines 13,63,78. growthRate used as constants for calculations within methods in lines 14,,63,78]

Subclass [share1] extends the superclass by overriding the following methods (there must be at least one): [share1: volumeChange(i) lines 42-57, openPriceChange(i) lines 59-72, closePriceChange(i) lines 74-87, EPSChange(i) lines 89-115.]

These overridden methods are used in the working code in the following places: [class main 191-206]

Subclass 2.

Subclass [share2] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [maxValueForShare,minValueForShare, discountRate, growthRate]

These/this new properties/property are used by the subclass in the following way: [maxValueForShare is used to give a maximum expected value of a share when they change per period of time so that the simulator can give advice to the user, used in lines 11,18,25-26,30,67,89.
minValueForShareis used to give a minimum expected value of a share when they change per period of time so that the simulator can give advice to the user, used in lines 12,19, 34-35,39,64,86. discountRate used as constants for calculations within methods in lines 13,62,84. growthRate used as constants for calculations within methods in lines 14,62,84]

Subclass [share2] extends the superclass by overriding the following methods (there must be at least one): [share2: volumeChange(i) lines 42-57, openPriceChange(i) lines 59-79, closePriceChange(i) lines 81-100, EPSChange(i) lines 102-114]

These overridden methods are used in the working code in the following places: [class main lines 207-223]
Subclass 3.

Subclass [share3] extends the superclass by adding at least one property and its getters and setters. The name(s) of the added properties are [discountRate, growthRate]

These/this new properties/property are used by the subclass in the following way: [the properties are used as constants used in calculations in other methods within the class, found in lines 11 and 12 and used in lines 42,45,48,51,67,70,73,76)

Subclass [share3] extends the superclass by overriding the following methods (there must be at least one): [subclass share3: overridden methods volumeChange(i) lines 18-34, openPriceChange(i) lines 36-60, closePriceChange(i) lines 62-85, EPSChange(i) lines 87-100]

These overridden methods are used in the working code in the following places: [class main lines 224-240]


LEVEL TWO

[Polymorphism is when in inheritance, each subclass, each object has similar properites but display some similar and some different behaviours than each other.The objects must have the same superclass.So the subtype objects can be swapped when the supertypes are expected (subtitution principle)
so the variables holding objects of different types are also known as polymorphic varaibles Eg Van and Car are both vehicles but van may use diesel fuel and car may use petrol fuel.]

[subclass share1: overridden methods volumeChange(i) lines 42-57, openPriceChange(i) lines 59-72, closePriceChange(i) lines 74-87, EPSChange(i) lines 89-115. 
Accessed in class main lines 86,118,194-198.The latter show subtitution principle 
Subclass share2: overridden methods volumeChange(i) lines 42-57, openPriceChange(i) lines 59-79, closePriceChange(i) lines 81-100, EPSChange(i) lines 102-114.
Accessed in class main lines 87,140,311-315.The latter show subtitution principle
Subclass share3: overridden methods volumeChange(i) lines 18-34, openPriceChange(i) lines 36-60, closePriceChange(i) lines 62-85, EPSChange(i) lines 87-100.
Accessed in class main lines 88,163,228-232.The latter show subtitution principle

example of subtitution principle from my code: Investment varX = new shareX(args); subclass instance of supertype.
The methods are overriden to show polymorphism, each method acts and calculates different aspect of the market for each share and hence gives diffferent advice to the user due to differently overriden methods)

[Polymorphism is necessary in my code because each share of type Investment have similar attributes and methods shared between them but each share and their value changes 
and since this is a stock market simulation, each share can change and it will change differently each time thus, using polymorphisim will imitate this
change and uncertainty found within stock markets and hence the user will have to predict and use advice given by the simulation at times when the stock drops or not and hence make their decision to buy or sell based on their prediction sicne the stock prices change actively.
So polymorphism with methods overriden, each subclass can show different behaviours yet be under the same umbrella of the superclass Investment]


LEVEL THREE

[Class user uses arraylist found in lines 19, 29-34. It is accessd from class main,in lines 39-70,84]


ANYTHING ELSE

[ inherited properties from super class:
String symbol was used to easily and clearly represent the name of the company via abbreviation given by the user ,String nameOfShare was used to show the name of that specifc share 
from the given company used for clarity and so its userfriendly and can be recognised easily when buying or selling shares, int timeInMonths is used so that the user can choose after how many months since the start to see the change in 
price of the share , int volume is a common variable used in stock terms which indicates the amount of shares bought and this significant to calulate how much the user owns of the stock , double open was used because that's also a commonly used
keyword used in stock markets which indicates the starting price of the shares and it can change which can hence affect the net change and can affect the user's decision whether to buy, sell or neither, double close was used because that's also a commonly used
keyword used in stock markets which indicates the closing or final price of the shares. This is the final price after bidings applied (affecting the net change) and this determines whether the user wants to buy, sell or neither, double EPS is used because its an 
abbreviation to earnings per share so its the earnings of the employees within that share in that company which can be valuable for the user to determine whether this share is worth investing in or not, double NCP was used to show the percentage change between the
opening price and closing price per chosen share at a selected time period, final double discountRate was used as a constant for calculating the next new open and close prices of the shares after a period of time, final double growthRate was used as a constant for 
calculating the next new open and close prices of the shares after a period of time
]
