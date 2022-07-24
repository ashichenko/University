package com.company.util;

import com.company.model.Address;
import com.company.model.Methodist;
import com.company.model.Teacher;

@FunctionalInterface
public interface Converter<T, N> {

    T convert(N value);

}



