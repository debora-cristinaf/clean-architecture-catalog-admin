package org.example.domain.category;

import org.example.domain.pagination.Pagination;
import org.example.domain.pagination.SearchQuery;

import java.util.List;
import java.util.Optional;

public interface CategoryGateway {


    Category create(Category aCategory);

    void deleteById(CategoryId anId);

    Optional<Category> findById(CategoryId anId);

    Category update(Category aCategory);

    List<CategoryId> existsByIds(Iterable<CategoryId> ids);
}
