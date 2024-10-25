package org.example;

public interface BoxOperations<V> {
    V getLargestValue(V largestValue , V numToCompare);
    void setLargestValue(V largestValue , V numToCompare);
}
