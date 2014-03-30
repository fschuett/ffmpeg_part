package org.ffmpeg.avutil;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : libavutil/frame.h:43</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class AVFrameSideData extends Structure {
	/**
	 * @see AVFrameSideDataType<br>
	 * C type : AVFrameSideDataType
	 */
	public int type;
	/** C type : uint8_t* */
	public Pointer data;
	public int size;
	/** C type : AVDictionary* */
	public org.ffmpeg.avutil.AVDictionary.ByReference metadata;
	public AVFrameSideData() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("type", "data", "size", "metadata");
	}
	/**
	 * @param type @see AVFrameSideDataType<br>
	 * C type : AVFrameSideDataType<br>
	 * @param data C type : uint8_t*<br>
	 * @param metadata C type : AVDictionary*
	 */
	public AVFrameSideData(int type, Pointer data, int size, org.ffmpeg.avutil.AVDictionary.ByReference metadata) {
		super();
		this.type = type;
		this.data = data;
		this.size = size;
		this.metadata = metadata;
	}
	public AVFrameSideData(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends AVFrameSideData implements Structure.ByReference {
		
	};
	public static class ByValue extends AVFrameSideData implements Structure.ByValue {
		
	};
}
