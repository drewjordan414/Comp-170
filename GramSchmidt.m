function Q = GramSchmidt(A)
    % Get the number of columns (vectors) in A
    [m, n] = size(A);

    % Initialize the orthogonal matrix Q
    Q = zeros(m, n);

    for j = 1:n
        % Start with the original vector
        v = A(:, j);

        % Subtract the projection of v onto the previous vectors
        for i = 1:j-1
            proj = (Q(:, i)' * v) / (Q(:, i)' * Q(:, i)) * Q(:, i);
            v = v - proj;
        end

        % Normalize the vector
        Q(:, j) = v / norm(v);
    end
end
