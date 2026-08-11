package com.vinicius.khcompletion.specifications;

import com.vinicius.khcompletion.entities.Enemy;
import org.springframework.data.jpa.domain.Specification;

public final class EnemySpecification {

    private EnemySpecification() {
    }

    public static Specification<Enemy> hasWorldId(Long worldId) {
        return (root, query, criteriaBuilder) -> {
            query.distinct(true);

            return criteriaBuilder.equal(
                    root.join("worlds").get("id"),
                    worldId
            );
        };
    }

    public static Specification<Enemy> hasDropItemId(Long itemId) {
        return (root, query, criteriaBuilder) -> {
            query.distinct(true);

            return criteriaBuilder.equal(
                    root.join("drops").get("id"),
                    itemId
            );
        };
    }
}