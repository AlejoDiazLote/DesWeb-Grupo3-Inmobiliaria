package com.Group3.realState.shared.domain.agregate;

import java.util.Objects;

public class doubleValueObject {
    protected Double value;

    public doubleValueObject(Double value) {

        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        doubleValueObject that = (doubleValueObject) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
