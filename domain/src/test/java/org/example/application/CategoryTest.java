package org.example.application;

import org.example.domain.category.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAValidParams_whenCallNewCategory_thenInstantiateACategory (){
        final var expectName = "Filmes";
        final var expectDescription = "A categoria mais assistida";
        final var expectIsActive = true;

        final var actualCategory = Category.newCategory(expectName, expectDescription, expectIsActive);

        Assertions.assertNotNull(actualCategory);
        Assertions.assertNotNull(actualCategory.getId());
        Assertions.assertEquals(expectName, actualCategory.getName());
        Assertions.assertEquals(expectDescription, actualCategory.getDescription());
        Assertions.assertEquals(expectIsActive, actualCategory.isActive()   g);
    }
}
