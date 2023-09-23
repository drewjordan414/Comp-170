# print(augmented_matrix)
import numpy as np

# Given array
A = np.array([[-6,-5,5],
              [7, -2, -1],
              [9,8,7]])

n = A.shape[0]
augmented_matrix = np.hstack((A, np.eye(n)))

for i in range(n):
    # Check if the diagonal is zero, if yes, pivot
    if augmented_matrix[i, i] == 0:
        for k in range(i+1, n):
            if augmented_matrix[k, i] != 0:
                augmented_matrix[[i, k]] = augmented_matrix[[k, i]]  # Swap rows
                break
    
    factor = augmented_matrix[i, i]
    augmented_matrix[i] /= factor
    
    for j in range(n):
        if i != j:
            factor = augmented_matrix[j, i]
            augmented_matrix[j] -= factor * augmented_matrix[i]

# Extracting the inverse matrix from the augmented matrix
A_inverse_computed = augmented_matrix[:, n:]

# Multiply the original matrix with the computed inverse
product = np.dot(A, A_inverse_computed)

# Check if the product is close to an identity matrix
is_identity = np.allclose(product, np.eye(n))
print("Is the computed matrix the correct inverse?", is_identity)






