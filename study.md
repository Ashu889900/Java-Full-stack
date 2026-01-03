## things to remember 

optional class does not replace stream api methods it specially for expected output like the stream may return null its bad practice to use exception in place of optional classes  and its standard practice to use function of optional class like ( orElse(), is Present(), ifPresent())

the things we add in pom file gets reflected in effective pom file, the maven uses effective pom to refelct the changes in our project

jdbc life cycle consist of :
                * import packages
                * Load drivers 
                * Establish connection
                * Create statement 
                * Execute statement 
                * Execute Process
                * Close resources

when trying to print result statement in jdbc we need to move the pointer of column to fist column using object.next() otherwis it will result in error.

## things i noticed 

In JDK 25 now we can now skip writing public static void in main funtion 

        we can now directly use main() or void main() it implicitly calls those identifiers ;
        
