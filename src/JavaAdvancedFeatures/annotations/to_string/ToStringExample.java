package JavaAdvancedFeatures.annotations.to_string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ToStringExample {
    public static void main(String[] args) {


        Object1 object1 = new Object1();
        Object2 obejct2 = new Object2();

        System.out.println("object1 to string " + object1.toString());
        System.out.println("object2 to string " + obejct2.toString());
    }
}
