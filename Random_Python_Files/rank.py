import numpy as np

# Define the matrix
A = np.array([[1, 4, 1],
              [-1, 4, -1],
              [4, 1, 4]])

# Calculate the rank of the matrix
rank = np.linalg.matrix_rank(A)
print(rank)
