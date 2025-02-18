package org.example;

public class App {

    /**
     * TODO: Return a multi-line string that lists each primitive data type,
     * its size in bits, and a note about its default value.
     *
     * Example output (one possible approach):
     * "byte: 8 bits, default = 0\nshort: 16 bits, default = 0\n..."
     *
     * @return A descriptive string for all primitive data types.
     */
    public String getDataTypesInfo() {
        // TODO
        return ""byte"+Byte.SIZE+"bits,default=0\n"
            +"short"+Byte.SIZE+"bits,default=0\n"
            +int"+Byte.SIZE+"bits,default=0\n"
            "long"+Byte.SIZE+"bits,default=0L\n"
            "float"+Byte.SIZE+"bits,default=0.0f\n"
            "double"+Byte.SIZE+"bits,default=0.0d\n"
            "char"+Byte.SIZE+"bits,default='\\u0000'\n"
            "boolean: 1 bit(stored as 1 byte in JVM for memory alignment), default=false"";
    }

    public static void main(String[] args) {
        App app = new App();
        // Print the data types info
        System.out.println(app.getDataTypesInfo());
    }
}

