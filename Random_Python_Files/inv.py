import numpy as np

# array
A = np.array([[-6,-5,5],
              [7, -2, -1],
              [9,8,7]])
# take the inverse of the array using numpy
# B = np.linalg.inv(A)
# print(B)




# take the inverse of the array using elementary row operations
n = A.shape[0]
augmented_matrix = np.hstack((A, np.eye(n)))

for i in range(n):
    factor = augmented_matrix[i, i]
    augmented_matrix[i] /= factor
    
    for j in range(n):
        if i != j:
            factor = augmented_matrix[j, i]
            augmented_matrix[j] -= factor * augmented_matrix[i]
    
print(augmented_matrix)

