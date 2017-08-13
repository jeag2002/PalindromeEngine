Java project created in Eclipse Mars 2 Release (4.5.2)

Java jdk1.8.0_101 (64 bits)
Maven 3.3
JUnit 4.9

Create jar executing maven command:

mvn install 

(after all system generate a jar named PalindromeEngine-0.0.1-SNAPSHOT.jar)

Example of Execution (Windows 10 64Bits Version):

java -jar .\PalindromeEngine-0.0.1-SNAPSHOT.jar uk.mclaren.palindrome.Main sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop

Architechture:

1)Find the three most large palindromes of a input string (of maximum size of 2^31+1 bytes); beginning
with the size of the string and ending with the size of 2

2)Filter all the palindromes that are "embedded" into other palindromes larger previosly found

