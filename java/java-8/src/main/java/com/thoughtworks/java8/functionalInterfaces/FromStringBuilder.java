package com.thoughtworks.java8.functionalInterfaces;

import com.thoughtworks.java8.MyClass;

public interface FromStringBuilder<$Class> {

    $Class create(String a);

    default <$Return extends MyClass> $Return returnIt($Return clazz) {
        return null;
    }
}
