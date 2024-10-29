# Random Number Generator

This Java program generates a list of 10,000 unique random numbers between 1 and 10,000 (inclusive). Every time you run the program, it produces a new randomized order of these numbers.

## Purpose
The program demonstrates efficient and performant generation of unique random numbers, making use of `Java Collections` and `Streams` for optimized performance and simplicity.

## Features
- Generates n unique random numbers, in this case 10,000 since it was the requirement.
- Each number is within the range of 1 to 10,000.
- Randomizes the order of numbers each time it runs.
- Efficient, using `O(n)` time complexity for generating and shuffling.

## Getting Started

### Prerequisites
To compile and run this program, you need to install Java from Oracle’s website (https://www.oracle.com/java/technologies/javase-downloads.html) if not installed yet.

Make sure Java is installed by running:
```bash
java -version
javac -version
```

### Installation
1. Clone this repository or download the `RandomNumberGenerator.java` file.
2. Open a terminal or command prompt and navigate to the directory where the file is saved.

### Compiling the Program
Compile the Java file using the following command:
```bash
javac RandomNumberGenerator.java
```

### Running the Program
Once compiled, run the program with:
```bash
java RandomNumberGenerator
```

The output will display a list of 10,000 unique random numbers in random order.

## Code Explanation

The code is structured as follows:
- **`generateRandomNumbers(int n)`**: Generates a list of numbers from 1 to `n` (10,000 in this case), then shuffles the list to ensure a random order.
- **`main(String[] args)`**: Calls `generateRandomNumbers` and prints each number in the randomized list to the console.

## Author
David San Kim
