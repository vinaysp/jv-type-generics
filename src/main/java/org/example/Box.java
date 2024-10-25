package org.example;

public  class Box <T,V extends Number> implements BoxOperations<V>{
    private T genericAttribute;
    private V largestValue;

    private final String name;
    public Box(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public   boolean hasSameName(Box<T, V> box) {
        return this.name.equals(box.getName());
    }

    public T getGenericAttribute(){
        return genericAttribute;
    }
    public void setGenericAttribute(T genericAttribute){
        this.genericAttribute = genericAttribute;
    }

    public V getLargestValue() {
        return largestValue;
    }

    @Override
    public V getLargestValue(V largestValue, V numToCompare) {
        return null;
    }

    public void setLargestValue(V largestValue , V numToCompare) {
        this.largestValue =  (largestValue.doubleValue() > numToCompare.doubleValue()?largestValue: numToCompare);
//        this.largestValue = largestValue.intValue() > numToCompare.intValue()?largestValue: numToCompare;
//        this.largestValue = largestValue.floatValue() > numToCompare.floatValue()?largestValue: numToCompare;
        System.out.println(this.largestValue);


    }
}