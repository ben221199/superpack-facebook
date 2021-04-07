package com.facebook.superpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main{

	public static void main(String... args) throws IOException{
		AssetDecompressor.decompress(new FileInputStream(new File("file.spk")),"export","./");
	}

}
