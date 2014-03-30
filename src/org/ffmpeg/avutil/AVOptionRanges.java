package org.ffmpeg.avutil;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : libavutil/opt.h:59</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class AVOptionRanges extends Structure {
	/** C type : AVOptionRange** */
	public org.ffmpeg.avutil.AVOptionRange.ByReference[] range;
	public int nb_ranges;
	public AVOptionRanges() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("range", "nb_ranges");
	}
	/** @param range C type : AVOptionRange** */
	public AVOptionRanges(org.ffmpeg.avutil.AVOptionRange.ByReference range[], int nb_ranges) {
		super();
		if ((range.length != this.range.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.range = range;
		this.nb_ranges = nb_ranges;
	}
	public AVOptionRanges(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends AVOptionRanges implements Structure.ByReference {
		
	};
	public static class ByValue extends AVOptionRanges implements Structure.ByValue {
		
	};
}
