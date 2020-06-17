Feature: Test if addition of two number is a even number

Scenario Outline: Add two number and check if their result is even number
Given take first number <x>
Then take Second number <y>
When we add them
Then verify if the result is even number 
Examples:
|x|y|
|2|5|
|4|9|
