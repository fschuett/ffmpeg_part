package org.ffmpeg.swscale;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
/**
 * Wrapper for library <b>swscale</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("swscale") 
@Runtime(CRuntime.class) 
public class SwscaleLibrary {
	static {
		BridJ.register();
	}
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BITEXACT = (int)0x80000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_AREA = (int)0x20;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_MMX = (int)0x80000000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SINC = (int)0x100;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_GAUSS = (int)0x80;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_FCC = (int)4;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BICUBLIN = (int)0x40;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final String LIBSWSCALE_IDENT = (String)"SwS2.5.102";
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SPLINE = (int)0x400;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_DIRECT_BGR = (int)0x8000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU624 = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_ALTIVEC = (int)0x10000000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_PRINT_INFO = (int)0x1000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SRC_V_CHR_DROP_SHIFT = (int)16;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_MMXEXT = (int)0x20000000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_POINT = (int)0x10;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_SSE2 = (int)0x02000000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final double SWS_MAX_REDUCE_CUTOFF = (double)0.002;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_SMPTE240M = (int)7;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_X = (int)8;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU601 = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_DEFAULT = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_SMPTE170M = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FAST_BILINEAR = (int)1;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_ACCURATE_RND = (int)0x40000;
	/**
	 * define<br>
	 * Conversion Error : 2.5.<br>
	 * SKIPPED:<br>
	 * <i>native declaration : libswscale/version.h:0</i><br>
	 * 2.5.
	 */
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FULL_CHR_H_INP = (int)0x4000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FULL_CHR_H_INT = (int)0x2000;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final boolean FF_API_SWS_FORMAT_NAME = (boolean)(2 < 3);
	/** <i>native declaration : libswscale/version.h</i> */
	public static final boolean FF_API_SWS_CPU_CAPS = (boolean)(2 < 3);
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_LANCZOS = (int)0x200;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MAJOR = (int)2;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BICUBIC = (int)4;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SRC_V_CHR_DROP_MASK = (int)0x30000;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_BUILD = (int)(2 << 16 | 5 << 8 | 102);
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_ERROR_DIFFUSION = (int)0x800000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_3DNOW = (int)0x40000000;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final boolean FF_API_SWS_GETCONTEXT = (boolean)(2 < 3);
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_MMX2 = (int)0x20000000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU709 = (int)1;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_INT = (int)(2 << 16 | 5 << 8 | 102);
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MICRO = (int)102;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CPU_CAPS_BFIN = (int)0x01000000;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MINOR = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BILINEAR = (int)2;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_PARAM_DEFAULT = (int)123456;
	/**
	 * Original signature : <code>int swscale_version()</code><br>
	 * <i>native declaration : libswscale/swscale.h:1</i>
	 */
	public static native int swscale_version();
	/**
	 * Original signature : <code>char* swscale_configuration()</code><br>
	 * <i>native declaration : libswscale/swscale.h:3</i>
	 */
	public static Pointer<Byte > swscale__configuration() {
		return Pointer.pointerToAddress(swscale_configuration(), Byte.class);
	}
	@Ptr 
	protected native static long swscale_configuration();
	/**
	 * Original signature : <code>char* swscale_license()</code><br>
	 * <i>native declaration : libswscale/swscale.h:5</i>
	 */
	public static Pointer<Byte > swscale__license() {
		return Pointer.pointerToAddress(swscale_license(), Byte.class);
	}
	@Ptr 
	protected native static long swscale_license();
	/**
	 * Original signature : <code>void sws_freeContext(SwsContext*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:8</i>
	 */
	public static void sws_freeContext(Pointer<SwscaleLibrary.SwsContext > swsContext) {
		sws_freeContext(Pointer.getPeer(swsContext));
	}
	protected native static void sws_freeContext(@Ptr long swsContext);
	/**
	 * Original signature : <code>SwsContext* sws_getContext(int, int, AVPixelFormat, int, int, AVPixelFormat, int, SwsFilter*, SwsFilter*, const double*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:10</i>
	 */
	public static Pointer<SwscaleLibrary.SwsContext > sws_getContext(int srcW, int srcH, IntValuedEnum<AVPixelFormat > srcFormat, int dstW, int dstH, IntValuedEnum<AVPixelFormat > dstFormat, int flags, Pointer<SwscaleLibrary.SwsFilter > srcFilter, Pointer<SwscaleLibrary.SwsFilter > dstFilter, Pointer<Double > param) {
		return Pointer.pointerToAddress(sws_getContext(srcW, srcH, (int)srcFormat.value(), dstW, dstH, (int)dstFormat.value(), flags, Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter), Pointer.getPeer(param)), SwscaleLibrary.SwsContext.class);
	}
	@Ptr 
	protected native static long sws_getContext(int srcW, int srcH, int srcFormat, int dstW, int dstH, int dstFormat, int flags, @Ptr long srcFilter, @Ptr long dstFilter, @Ptr long param);
	/**
	 * Original signature : <code>int sws_scale(SwsContext*, const const uint8_t*[], const int[], int, int, const uint8_t*[], const int[])</code><br>
	 * <i>native declaration : libswscale/swscale.h:12</i>
	 */
	public static int sws_scale(Pointer<SwscaleLibrary.SwsContext > c, Pointer<Pointer<Byte > > srcSlice, Pointer<Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<Byte > > dst, Pointer<Integer > dstStride) {
		return sws_scale(Pointer.getPeer(c), Pointer.getPeer(srcSlice), Pointer.getPeer(srcStride), srcSliceY, srcSliceH, Pointer.getPeer(dst), Pointer.getPeer(dstStride));
	}
	protected native static int sws_scale(@Ptr long c, @Ptr long srcSlice, @Ptr long srcStride, int srcSliceY, int srcSliceH, @Ptr long dst, @Ptr long dstStride);
	/** Undefined type */
	public static interface SwsFilter {
		
	};
	/** Undefined type */
	public static interface SwsContext {
		
	};
}
