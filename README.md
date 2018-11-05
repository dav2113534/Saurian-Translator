# Saurian-Translator


-You will need two private Strings in your Saurian class. One String holds the word or phrase in its English form and the other holds the word or phrase in its Saurian form.-

You will need a public default constructor that sets default values to the English and Saurian Strings. 

You will need a public overloaded constructor that accepts two parameters. One parameter is a String that is the phrase and the other parameter is a boolean to be used to determine if the first parameter was a phrase in English or Saurian. 

You will need a public getter method for each of the English and Saurian Strings. You will need a pubilc setter method for each of the English and Saurian Strings as well. 

Note that if the setEnglilsh() method updates the English String it should also translate and update the Saurian String. This is also true for the setSaurian() method. 

You will need a method, translateSaurToEng(String saurianToEnglish) that has no return type i.e. it is void. It should update the data in the class accordingly. Similarly, you will need a method, translateEngToSaur(String englishToSaur) that has no return type i.e. it is void. These translation methods will rely on the char arrays that have been provided in the Saurian.java class.