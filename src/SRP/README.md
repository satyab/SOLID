 Problem
 
 1. Journal class is taking responsibility of persisting and loading journal entries.
 2. Journal class will become GOD object handling everything related to Journals.
 3. If there are multiple objects like journal and in future persistence logic changes then there will be change in all files will have to make changes to add new logic of persistence.
 
 Solution
 
 1. Journal class only deals with save and removing journal entries.
 2. Persistence class takes responsibility of saving and loading journals to/from the file.