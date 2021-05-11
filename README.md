# Staircase
Staircase is a command line application that is built on JAVA 8.

## Technology Stack
JAVA8
Eclipse

## Usage
From root folder of this project, execute:
```bash
java ./src/staircase/main.java
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