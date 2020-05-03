OCP + Specification Pattern (Enterprise pattern)

Problem

1. ProductFilter open for modification.
2. Addition of single attribute on product needs extra method to be added in ProductFilter as well.

Solution

1. ProductFilter is closed for modification
2. ProductFilter is open for extension by giving different specifications to filter methods.