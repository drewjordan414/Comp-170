def parse_matrix(input_string):
    # Convert the input string to a matrix of integers
    try:
        return [[int(num) for num in row.split()] for row in input_string.split(';')]
    except ValueError:
        raise ValueError("Matrix should contain only numbers separated by spaces and semicolons.")

def multiply_matrices(matrix1, matrix2):
    # Check if multiplication is possible
    if len(matrix1[0]) != len(matrix2):
        raise ValueError("The number of columns in the first matrix must be equal to the number of rows in the second matrix.")

    # Initialize the result matrix with zeros
    result = [[0 for _ in range(len(matrix2[0]))] for _ in range(len(matrix1))]

    # Perform matrix multiplication
    for i in range(len(matrix1)):
        for j in range(len(matrix2[0])):
            for k in range(len(matrix2)):
                result[i][j] += matrix1[i][k] * matrix2[k][j]
    
    return result

# Get user input for the two matrices
input_a = input("Enter the contents of the first matrix (rows separated by semicolons, numbers by spaces): ")
input_b = input("Enter the contents of the second matrix (rows separated by semicolons, numbers by spaces): ")

try:
    # Parse the input strings into matrix format
    matrix_a = parse_matrix(input_a)
    matrix_b = parse_matrix(input_b)
    
    # Multiply the matrices
    result_matrix = multiply_matrices(matrix_a, matrix_b)

    # Print the result
    for row in result_matrix:
        print(' '.join(map(str, row)))
except ValueError as e:
    print(e)
