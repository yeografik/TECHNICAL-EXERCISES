function isDiagonalMatrix(array) {
    if (!isMatrix(array))
        throw new Error('Parameter is not an array');
        
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array[i].length; j++) {
            if (nonDiagonalPositionIsNotZero(array, i, j)) {
                return false;
            }
        }
    }

    return true;
}

function isMatrix(array) {
    if (!Array.isArray(array))
        return false;
    
    result = true;
    array.forEach(element => result = result && Array.isArray(element));

    return result;
}

function nonDiagonalPositionIsNotZero(array, i, j) {
    return i != j  && array[i][j] != 0;
}