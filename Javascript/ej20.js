import { useState, useEffect } from 'react';

function useIncreaseCounter(increment) {
    const [value, setValue] = useState(0);

    useEffect(() => {
        setValue(value + increment);
    });

    return value;
}
