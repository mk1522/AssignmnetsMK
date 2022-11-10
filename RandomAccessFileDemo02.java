package basic;

import java.io.RandomAccessFile;

public class RandomAccessFileDemo02 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile raf = null;
		
		raf = new RandomAccessFile("C:\\test\\tt.txt","rw");

		raf.write('#');
		raf.write("Mass Mutual\n".getBytes());
		raf.writeBoolean(true);
		raf.writeByte(35);
		raf.writeShort(257);
		raf.writeInt(345678);
		raf.writeLong(987654321);
		raf.writeFloat(3.14f);
		raf.writeDouble(456.789);
		raf.writeChar('#');
		
		raf.seek(0);
		
		byte barr[] = new byte[11];
		int readByte = raf.read();
		System.out.println((char)readByte);
		raf.read(barr);
		System.out.println(new String(barr));
		System.out.println( "Bool " + raf.readBoolean());
		readByte = raf.read();
		System.out.println((char)readByte);
		System.out.println( "Byte " + raf.readByte());
		System.out.println( "Short " + raf.readShort());
		System.out.println( "Int " + raf.readInt());
		System.out.println( "Long " + raf.readLong());
		System.out.println( "Float " + raf.readFloat());
		System.out.println( "Double " + raf.readDouble());
		System.out.println( "Char " + raf.readChar());
		
		System.out.println("Written Successfully ");
		raf.close();

	}

}

