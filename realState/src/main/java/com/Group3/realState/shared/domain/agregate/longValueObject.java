package com.Group3.realState.shared.domain.agregate;

import java.util.Objects;

public class longValueObject {
    protected long value;

    public longValueObject(long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        longValueObject that = (longValueObject) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
