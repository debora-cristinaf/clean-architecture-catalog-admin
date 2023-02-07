package org.example.domain;

import javax.xml.validation.ValidatorHandler;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID>{

    protected AggregateRoot(final ID id) {
        super(id);
    }
}
