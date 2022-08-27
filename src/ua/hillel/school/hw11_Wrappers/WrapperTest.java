package ua.hillel.school.hw11_Wrappers;

public class WrapperTest {

    public static void main(String[] args) {

        //Завдання 2
        System.out.println("Завдання 2:");

        Character character1 = 1;
        Character character2 = Character.valueOf((char) 1);
        Character character3 = new Character((char)1);

        System.out.println(" " + character1 + " ; " + character2 + " ; " + character3 );

        Byte aByte1 = 127;
        Byte aByte2 = Byte.valueOf((byte)127);
        Byte aByte3 = new Byte((byte)127);
        Byte aByte4 = Byte.parseByte("127");

        System.out.println(" " + aByte1 + " ; " + aByte2 + " ; " + aByte3 + " ; " + aByte4);

        Short aShort1 = 12345;
        Short aShort2 = Short.valueOf((short)12345);
        Short aShort3 = new Short((short)12345);
        Short aShort4 = Short.parseShort("12345");

        System.out.println(" " + aShort1 + " ; " + aShort2 + " ; " + aShort3 + " ; " + aShort4);

        Integer aInt1 = 12345678;
        Integer aInt2 = Integer.valueOf(12345678);
        Integer aInt3 = new Integer(12345678);
        Integer aInt4 = Integer.parseInt("12345678");

        System.out.println(" " + aInt1 + " ; " + aInt2 + " ; " + aInt3 + " ; " + aInt4);

        Double aDouble1 = 123.456;
        Double aDouble2 = Double.valueOf(123.456);
        Double aDouble3 = new Double(123.456);
        Double aDouble4 = Double.parseDouble("123.456");

        System.out.println(" " + aDouble1 + " ; " + aDouble2 + " ; " + aDouble3 + " ; " + aDouble4);

        Float aFloat1 = 123456.78f;
        Float aFloat2 = Float.valueOf(123456.78f);
        Float aFloat3 = new Float(123456.78f);
        Float aFloat4 = Float.parseFloat("123456.78f");

        System.out.println(" " + aFloat1 + " ; " + aFloat2 + " ; " + aFloat3 + " ; " + aFloat4);

        Long aLong1 = 1234567890123L;
        Long aLong2 = Long.valueOf(1234567890123L);
        Long aLong3 = new Long(12345678901233L);
        Long aLong4 =Long.parseLong("1234567890123");

        System.out.println(" " + aLong1 + " ; " + aLong2 + " ; " + aLong3 + " ; " + aLong4);

        Boolean aBoolean1 = true;
        Boolean aBoolean2 = Boolean.TRUE;
        Boolean aBoolean3 = Boolean.valueOf(true);
        Boolean aBoolean4 = new Boolean (true);
        Boolean aBoolean5 = Boolean.parseBoolean("true");

        System.out.println(" " + aBoolean1 + " ; " + aBoolean2 + " ; " + aBoolean3 + " ; " + aBoolean4 + " ; "
                + aBoolean5);

        //Завдання 3
        System.out.println("Завдання 3:");

        Double aDouble6 = 123.456;

        byte aByte6 = aDouble6.byteValue();
        short aShort6 = aDouble6.shortValue();
        int aInt6 = aDouble6.intValue();
        long aLong6 = aDouble6.longValue();
        float aFloat6 = aDouble6.floatValue();

        System.out.println(" " + aDouble6 + " " + aByte6 + " " + aShort6 + " " + aInt6 + " " + aLong6 + " " + aFloat6);

        //Завдання 4
        System.out.println("Завдання 4:");

        Double aDouble7 = 0.0;
        Double aDouble8 = 456.789;
        Double nonValue = aDouble8 / aDouble7;
        Double infiniteValue = aDouble7 / aDouble7;
        System.out.println(" " + nonValue + " " + infiniteValue);

        if (nonValue.isInfinite()){
            System.out.println(" Змінна nonValue = Infinite");
        }
        if (nonValue.isNaN()){
            System.out.println(" Змінна nonValue = NaN");
        }
        if (infiniteValue.isInfinite()){
            System.out.println(" Змінна infiniteValue = Infinite");
        }
        if (infiniteValue.isNaN()){
            System.out.println(" Змінна infiniteValue = NaN");
        }

        //Завдання 5
        System.out.println("Завдання 5:");

        Long aLong7 = 120L;
        Long aLong8 = 120L;
        System.out.println(" " + (aLong7 == aLong8));

        aLong7 = 1200L;
        aLong8 = 1200L;
        System.out.println(" " + (aLong7 == aLong8));
    }
}
