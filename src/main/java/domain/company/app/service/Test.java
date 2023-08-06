import java.time.Clock;

public class Test {
    public static void main(String[] args) {

     int i = 10;
     Integer boxedInt = i;
     int i2 = boxedInt ;

     byte b = 120;
     Byte boxedByte = b;
     byte b2 = boxedByte;

     float f = 1.55F;
     Float boxedFloat = f;
     float f2 = boxedFloat;

     double d = 1.2;
     Double boxedDouble = d;
     double d2 = boxedDouble;

     boolean myBoolean = false;
     Boolean boxedBool = myBoolean;
     boolean unboxedBool = boxedBool;

     char c = 'w';
     Character boxedChar = c;
     char c2 = boxedChar;

     short s = 123;
     Short boxedShort = s;
     short s2 = boxedShort;

     long l = 123456L;
     Long boxedLong = l;
     long l2 = boxedLong;

     System.out.println("Integer:"+i+" "+boxedInt+" "+i2);
     System.out.println("Byte:"+b+" "+boxedByte+" "+b2);
     System.out.println("Float:"+f+" "+boxedFloat+" "+f2);
     System.out.println("Double:"+d+" "+boxedDouble+" "+d2);
     System.out.println("Boolean:"+myBoolean+" "+boxedBool+" "+unboxedBool);
     System.out.println("Character:"+c+" "+boxedChar+" "+c2);
     System.out.println("Short:"+s+" "+boxedShort+" "+s2);
     System.out.println("Long:"+l+" "+boxedLong+" "+l2);







    }
}
