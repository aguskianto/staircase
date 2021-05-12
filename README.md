# Staircase
Staircase is a command line application that is built on JAVA 8.

## Technology Stack
JAVA8
Eclipse

## Unique Features
1. Use stream instead of array so memory usage is optimized. Program can be used for high throughput.
2. Big O is optimized as the complexity is O(n) using: 
```bash
new char[max_height_value - i]).replace('\0', ' ')
new char[i]).replace('\0', '#')
```
to generate ' ' or '#' further enhance the performance of application
3. Streaming means when there is a value on the stream, program tends to execute data though the whole process has not finished yet. This means minimal latency in processing.

## Usage
From root folder of this project, execute:
```bash
java ./src/com/staircase/main.java
```

This command will print out hint on command prompt:
```bash
###################################################
                Staircase Program                  
###################################################

Please input a number between 1 to 100 to continue.
To quit the program type exit or press Ctrl + C

```

Any input as integer between 1 - 100 will print staircase.
For example, input of 5 will output:
```bash
    #
   ##
  ###
 ####
#####
```

## Error Handling
Input will only be between 1 - 100.

Any input out of range but integer number, will output: 
```bash
Argument must be between 1 to 100
```

Any input not with type integer will automatically break the program in command prompt.