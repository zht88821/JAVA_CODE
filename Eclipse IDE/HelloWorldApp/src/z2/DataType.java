package z2;

public class DataType {
	public static void main(String[]args) {
		int intValue=1234567892;
		long longValue=1234567890123456789L;
		float floatValue=intValue;
		double doubleValue=intValue;
		System.out.println("整型变量          intValue="+intValue);
		System.out.println("浮点型变量        floatValue="+floatValue);
		System.out.println("双精度浮点型变量  doubleValue="+doubleValue);
		floatValue   =longValue;
		doubleValue  =longValue;
		System.out.println("长整型变量        longValue="+longValue);
		System.out.println("浮点型变量        floatValue="+floatValue);
		System.out.println("双精度浮点型变量  doubleValue="+doubleValue);
		
	}

}