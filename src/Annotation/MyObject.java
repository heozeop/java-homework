package Annotation;

public class MyObject {

    @MyDefaultValue(intValue=1)
    int value1;
    @MyDefaultValue(longValue=1l)
    long value2;
    @MyDefaultValue(floatValue=1f)
    float value3;
    @MyDefaultValue(doubleValue=1d)
    double value4;
    @MyDefaultValue(charValue='a')
    char value5;
    @MyDefaultValue(stringValue="hello annotation")
    String value6;

    @Override
    public String toString() {
        return "MyObject{" +
            "value1=" + value1 +
            ", value2=" + value2 +
            ", value3=" + value3 +
            ", value4=" + value4 +
            ", value5=" + value5 +
            ", value6='" + value6 + '\'' +
            '}';
    }
}
