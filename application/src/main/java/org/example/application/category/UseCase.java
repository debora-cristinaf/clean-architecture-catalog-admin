package org.example.application.category;


public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN anIn);
}
