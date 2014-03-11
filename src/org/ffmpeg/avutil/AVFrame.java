package org.ffmpeg.avutil;

import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AvutilLibrary.AVColorRange;
import org.ffmpeg.avutil.AvutilLibrary.AVColorSpace;
import org.ffmpeg.avutil.AvutilLibrary.AVPictureType;

/**
 * <i>native declaration : /home/fschuett/prog/java/eclipse/ffmpeg/csrc/libavutil/frame.h:84</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avutil") 
public class AVFrame extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : uint8_t*[8] */
	@Array({8}) 
	@Field(0) 
	public Pointer<Pointer<Byte > > data() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : int[8] */
	@Array({8}) 
	@Field(1) 
	public Pointer<Integer > linesize() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : uint8_t** */
	@Field(2) 
	public Pointer<Pointer<Byte > > extended_data() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : uint8_t** */
	@Field(2) 
	public AVFrame extended_data(Pointer<Pointer<Byte > > extended_data) {
		this.io.setPointerField(this, 2, extended_data);
		return this;
	}
	@Field(3) 
	public int width() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public AVFrame width(int width) {
		this.io.setIntField(this, 3, width);
		return this;
	}
	@Field(4) 
	public int height() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public AVFrame height(int height) {
		this.io.setIntField(this, 4, height);
		return this;
	}
	@Field(5) 
	public int nb_samples() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public AVFrame nb_samples(int nb_samples) {
		this.io.setIntField(this, 5, nb_samples);
		return this;
	}
	@Field(6) 
	public int format() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public AVFrame format(int format) {
		this.io.setIntField(this, 6, format);
		return this;
	}
	@Field(7) 
	public int key_frame() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public AVFrame key_frame(int key_frame) {
		this.io.setIntField(this, 7, key_frame);
		return this;
	}
	/** C type : AVPictureType */
	@Field(8) 
	public IntValuedEnum<AVPictureType > pict_type() {
		return this.io.getEnumField(this, 8);
	}
	/** C type : AVPictureType */
	@Field(8) 
	public AVFrame pict_type(IntValuedEnum<AVPictureType > pict_type) {
		this.io.setEnumField(this, 8, pict_type);
		return this;
	}
	/** C type : AVRational */
	@Field(9) 
	public AVRational sample_aspect_ratio() {
		return this.io.getNativeObjectField(this, 9);
	}
	/** C type : AVRational */
	@Field(9) 
	public AVFrame sample_aspect_ratio(AVRational sample_aspect_ratio) {
		this.io.setNativeObjectField(this, 9, sample_aspect_ratio);
		return this;
	}
	@Field(10) 
	public long pts() {
		return this.io.getLongField(this, 10);
	}
	@Field(10) 
	public AVFrame pts(long pts) {
		this.io.setLongField(this, 10, pts);
		return this;
	}
	@Field(11) 
	public long pkt_pts() {
		return this.io.getLongField(this, 11);
	}
	@Field(11) 
	public AVFrame pkt_pts(long pkt_pts) {
		this.io.setLongField(this, 11, pkt_pts);
		return this;
	}
	@Field(12) 
	public long pkt_dts() {
		return this.io.getLongField(this, 12);
	}
	@Field(12) 
	public AVFrame pkt_dts(long pkt_dts) {
		this.io.setLongField(this, 12, pkt_dts);
		return this;
	}
	@Field(13) 
	public int coded_picture_number() {
		return this.io.getIntField(this, 13);
	}
	@Field(13) 
	public AVFrame coded_picture_number(int coded_picture_number) {
		this.io.setIntField(this, 13, coded_picture_number);
		return this;
	}
	@Field(14) 
	public int display_picture_number() {
		return this.io.getIntField(this, 14);
	}
	@Field(14) 
	public AVFrame display_picture_number(int display_picture_number) {
		this.io.setIntField(this, 14, display_picture_number);
		return this;
	}
	@Field(15) 
	public int quality() {
		return this.io.getIntField(this, 15);
	}
	@Field(15) 
	public AVFrame quality(int quality) {
		this.io.setIntField(this, 15, quality);
		return this;
	}
	/** C type : void* */
	@Field(16) 
	public Pointer<? > opaque() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : void* */
	@Field(16) 
	public AVFrame opaque(Pointer<? > opaque) {
		this.io.setPointerField(this, 16, opaque);
		return this;
	}
	/** C type : uint64_t[8] */
	@Array({8}) 
	@Field(17) 
	public Pointer<Long > error() {
		return this.io.getPointerField(this, 17);
	}
	@Field(18) 
	public int repeat_pict() {
		return this.io.getIntField(this, 18);
	}
	@Field(18) 
	public AVFrame repeat_pict(int repeat_pict) {
		this.io.setIntField(this, 18, repeat_pict);
		return this;
	}
	@Field(19) 
	public int interlaced_frame() {
		return this.io.getIntField(this, 19);
	}
	@Field(19) 
	public AVFrame interlaced_frame(int interlaced_frame) {
		this.io.setIntField(this, 19, interlaced_frame);
		return this;
	}
	@Field(20) 
	public int top_field_first() {
		return this.io.getIntField(this, 20);
	}
	@Field(20) 
	public AVFrame top_field_first(int top_field_first) {
		this.io.setIntField(this, 20, top_field_first);
		return this;
	}
	@Field(21) 
	public int palette_has_changed() {
		return this.io.getIntField(this, 21);
	}
	@Field(21) 
	public AVFrame palette_has_changed(int palette_has_changed) {
		this.io.setIntField(this, 21, palette_has_changed);
		return this;
	}
	@Field(22) 
	public long reordered_opaque() {
		return this.io.getLongField(this, 22);
	}
	@Field(22) 
	public AVFrame reordered_opaque(long reordered_opaque) {
		this.io.setLongField(this, 22, reordered_opaque);
		return this;
	}
	@Field(23) 
	public int sample_rate() {
		return this.io.getIntField(this, 23);
	}
	@Field(23) 
	public AVFrame sample_rate(int sample_rate) {
		this.io.setIntField(this, 23, sample_rate);
		return this;
	}
	@Field(24) 
	public long channel_layout() {
		return this.io.getLongField(this, 24);
	}
	@Field(24) 
	public AVFrame channel_layout(long channel_layout) {
		this.io.setLongField(this, 24, channel_layout);
		return this;
	}
	/** C type : void*[8] */
	@Array({8}) 
	@Field(25) 
	public Pointer<Pointer<? > > buf() {
		return this.io.getPointerField(this, 25);
	}
	/** C type : void** */
	@Field(26) 
	public Pointer<Pointer<? > > extended_buf() {
		return this.io.getPointerField(this, 26);
	}
	/** C type : void** */
	@Field(26) 
	public AVFrame extended_buf(Pointer<Pointer<? > > extended_buf) {
		this.io.setPointerField(this, 26, extended_buf);
		return this;
	}
	@Field(27) 
	public int nb_extended_buf() {
		return this.io.getIntField(this, 27);
	}
	@Field(27) 
	public AVFrame nb_extended_buf(int nb_extended_buf) {
		this.io.setIntField(this, 27, nb_extended_buf);
		return this;
	}
	/** C type : AVFrameSideData** */
	@Field(28) 
	public Pointer<Pointer<AVFrameSideData > > side_data() {
		return this.io.getPointerField(this, 28);
	}
	/** C type : AVFrameSideData** */
	@Field(28) 
	public AVFrame side_data(Pointer<Pointer<AVFrameSideData > > side_data) {
		this.io.setPointerField(this, 28, side_data);
		return this;
	}
	@Field(29) 
	public int nb_side_data() {
		return this.io.getIntField(this, 29);
	}
	@Field(29) 
	public AVFrame nb_side_data(int nb_side_data) {
		this.io.setIntField(this, 29, nb_side_data);
		return this;
	}
	@Field(30) 
	public long best_effort_timestamp() {
		return this.io.getLongField(this, 30);
	}
	@Field(30) 
	public AVFrame best_effort_timestamp(long best_effort_timestamp) {
		this.io.setLongField(this, 30, best_effort_timestamp);
		return this;
	}
	@Field(31) 
	public long pkt_pos() {
		return this.io.getLongField(this, 31);
	}
	@Field(31) 
	public AVFrame pkt_pos(long pkt_pos) {
		this.io.setLongField(this, 31, pkt_pos);
		return this;
	}
	@Field(32) 
	public long pkt_duration() {
		return this.io.getLongField(this, 32);
	}
	@Field(32) 
	public AVFrame pkt_duration(long pkt_duration) {
		this.io.setLongField(this, 32, pkt_duration);
		return this;
	}
	/** C type : AVDictionary* */
	@Field(33) 
	public Pointer<AVDictionary > metadata() {
		return this.io.getPointerField(this, 33);
	}
	/** C type : AVDictionary* */
	@Field(33) 
	public AVFrame metadata(Pointer<AVDictionary > metadata) {
		this.io.setPointerField(this, 33, metadata);
		return this;
	}
	@Field(34) 
	public int decode_error_flags() {
		return this.io.getIntField(this, 34);
	}
	@Field(34) 
	public AVFrame decode_error_flags(int decode_error_flags) {
		this.io.setIntField(this, 34, decode_error_flags);
		return this;
	}
	@Field(35) 
	public int channels() {
		return this.io.getIntField(this, 35);
	}
	@Field(35) 
	public AVFrame channels(int channels) {
		this.io.setIntField(this, 35, channels);
		return this;
	}
	@Field(36) 
	public int pkt_size() {
		return this.io.getIntField(this, 36);
	}
	@Field(36) 
	public AVFrame pkt_size(int pkt_size) {
		this.io.setIntField(this, 36, pkt_size);
		return this;
	}
	/** C type : AVColorSpace */
	@Field(37) 
	public IntValuedEnum<AVColorSpace > colorspace() {
		return this.io.getEnumField(this, 37);
	}
	/** C type : AVColorSpace */
	@Field(37) 
	public AVFrame colorspace(IntValuedEnum<AVColorSpace > colorspace) {
		this.io.setEnumField(this, 37, colorspace);
		return this;
	}
	/** C type : AVColorRange */
	@Field(38) 
	public IntValuedEnum<AVColorRange > color_range() {
		return this.io.getEnumField(this, 38);
	}
	/** C type : AVColorRange */
	@Field(38) 
	public AVFrame color_range(IntValuedEnum<AVColorRange > color_range) {
		this.io.setEnumField(this, 38, color_range);
		return this;
	}
	/** C type : void* */
	@Field(39) 
	public Pointer<? > qp_table_buf() {
		return this.io.getPointerField(this, 39);
	}
	/** C type : void* */
	@Field(39) 
	public AVFrame qp_table_buf(Pointer<? > qp_table_buf) {
		this.io.setPointerField(this, 39, qp_table_buf);
		return this;
	}
	public AVFrame() {
		super();
	}
	public AVFrame(Pointer pointer) {
		super(pointer);
	}
}
