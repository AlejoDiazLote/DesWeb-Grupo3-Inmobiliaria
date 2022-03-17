package com.Group3.realState.shared.domain.agregate;

import java.util.Objects;

public class stringValueObject {
    protected String value;

    public stringValueObject(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stringValueObject that = (stringValueObject) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
