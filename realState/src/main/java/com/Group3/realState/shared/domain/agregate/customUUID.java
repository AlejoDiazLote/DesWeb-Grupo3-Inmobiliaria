package com.Group3.realState.shared.domain.agregate;

import java.util.Objects;
import java.util.UUID;

public class customUUID {

    private String value;

    public customUUID(String value) {
        validate(value);
        this.value = value;
    }

    public String value(){
        return value;
    }
    private void validate(String value){
        validateFormat(value);
    }

    private void validateFormat(String value){
        try {
            UUID.fromString(value);
        } catch (Exception ex){
            throw new RuntimeException("El UUID no tiene un formato valido");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        customUUID that = (customUUID) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
