package z2;

public class DataType {
	public static void main(String[]args) {
		int intValue=1234567892;
		long longValue=1234567890123456789L;
		float floatValue=intValue;
		double doubleValue=intValue;
		System.out.println("���ͱ���          intValue="+intValue);
		System.out.println("�����ͱ���        floatValue="+floatValue);
		System.out.println("˫���ȸ����ͱ���  doubleValue="+doubleValue);
		floatValue   =longValue;
		doubleValue  =longValue;
		System.out.println("�����ͱ���        longValue="+longValue);
		System.out.println("�����ͱ���        floatValue="+floatValue);
		System.out.println("˫���ȸ����ͱ���  doubleValue="+doubleValue);
		
	}

}