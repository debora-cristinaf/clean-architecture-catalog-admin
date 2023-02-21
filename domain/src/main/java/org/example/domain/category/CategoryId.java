package org.example.domain.category;

import org.example.domain.Identifier;
import org.example.domain.utils.IdUtils;

import java.util.Objects;
import java.util.UUID;

public class CategoryId extends Identifier {

    private final String value;

    private CategoryId(final String value){
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static CategoryId unique() {
        return CategoryId.from(IdUtils.uuid());
    }
    public static CategoryId from(final String anId) {
        return new CategoryId(anId);
    }

    public static CategoryId from(final UUID anId) {
        return new CategoryId(anId.toString().toLowerCase());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryId that = (CategoryId) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}
