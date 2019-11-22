# ParameterizedMessage

Pass string resources between ViewMode and View without context in ViewModel

## Requirements
* Java 8
* Android SDK
* Gradle

## Building
Build tool is gradle

### Assemble
Run `./gradlew assemble`

### Run unit tests
Run `./gradlew test`

### Run lint
Run `./gradlew lint`

### Run jacoco tests
Run `./gradlew test`

### Examples

With or without parameters

```java
    new ParameterizedMessage(R.string.key1).getMessage(context);
    new ParameterizedMessage(R.string.key2, new Object[]{parameter}).getMessage(context);
    new ParameterizedMessage("value3").getMessage();
    new ParameterizedMessage("value4 %s", new Object[]{parameter}).getMessage();
```