package org.ffmpeg.avutil;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavutil/dict.h:3</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avutil") 
public class AVDictionaryEntry extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : char* */
	@Field(0) 
	public Pointer<Byte > key() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : char* */
	@Field(0) 
	public AVDictionaryEntry key(Pointer<Byte > key) {
		this.io.setPointerField(this, 0, key);
		return this;
	}
	/** C type : char* */
	@Field(1) 
	public Pointer<Byte > value() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : char* */
	@Field(1) 
	public AVDictionaryEntry value(Pointer<Byte > value) {
		this.io.setPointerField(this, 1, value);
		return this;
	}
	public AVDictionaryEntry() {
		super();
	}
	public AVDictionaryEntry(Pointer pointer) {
		super(pointer);
	}
}
