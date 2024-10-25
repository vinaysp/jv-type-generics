public class Box <T,V>{
    private T genericAttribute;
    private V largestValue;

    public T getGenericAttribute(){
        return genericAttribute;
    }
    public void setGenericAttribute(T genericAttribute){
        this.genericAttribute = genericAttribute;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public void setLargestValue(V largestValue) {
        this.largestValue = largestValue;
    }
}
