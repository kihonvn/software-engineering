# Aspect Oriented Programming (AOP)

## Concepts

### Aspect

In AOP, an aspect is a concern cutting across multiple classes.

### Join point

In AOP, a join point is an execution point in a flow, often a method.

### Advice

In AOP, advice is an action defined by an aspect for a join point.

### Pointcut expression

In AOP, a pointcut expression is a conditional expression (pattern) to determine whether the system would apply declared advice of an aspect to a join point.

### Introduction

In AOP, an introduction is a way to add methods or fields to a class without changing the origin.

### Target object

In AOP, a target object is an object that is affected by at least one advice of defined aspects.

### AOP proxy

An AOP proxy is an object created by an AOP framework to execute advice at interested AOP pointcuts.

### Waving

In AOP, waving is an action to link defined aspects to interested targets. It can happen at compile time, load time, or runtime.