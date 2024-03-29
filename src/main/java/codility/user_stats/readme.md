## Microservices User Visits Aggregation

The system you work with on a daily basis runs multiple microservices. You have been asked to prepare an aggregation that represents number of user visits to all microservices, for use by data analysis.

The architect you are working with has already designed the API, which consists of a single class: `VisitCounter`. `VisitCounter` has a single method, `count()`. It returns `Map<Long, Long>` - this map should contain the number of visits by the user with a given ID. This method accepts an array of `Map<String, UserStats>`. Every Map represents the total number of visits per user to a given microservice.

There are some problems, however:

1. The Map key, which is a string, should be parseable to Long - but it may not be. You must skip any such faulty entries.
2. For some keys, `UserStats` may be null. You must skip any such faulty entries.
3. `UserStats` has a single field, `visitCount`, of type `Optional<Long>`. A getter for this field is also implemented. This field will never be null; however it might be empty. You must skip any such faulty entries.

Remember that you may receive some invalid input: null, empty maps, and so on. Handle it all appropriately and return an empty map. You may use Java 8 Streams API to implement your solution.
