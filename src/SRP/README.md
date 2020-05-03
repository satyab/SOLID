 Problem
 
 1. Journal class is taking responsibility of persisting and loading journal entries.
 
 Solution
 
 1. Journal class only deals with save and removing journal entries.
 2. Persistence class takes responsibility of saving and loading journals to/from the file.