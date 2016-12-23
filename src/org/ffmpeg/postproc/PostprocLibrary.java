package org.ffmpeg.postproc;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.bridj.util.DefaultParameterizedType;
/**
 * Wrapper for library <b>postproc</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("postproc") 
@Runtime(CRuntime.class) 
public class PostprocLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Conversion Error : a.num<br>
	 * SKIPPED:<br>
	 * <i>native declaration : libavutil/rational.h:0</i><br>
	 * const int64_t tmp = a.num * (int64_t)b.den - b.num * (int64_t)a.den;
	 */
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_CPU_CAPS_ALTIVEC = (int)0x10000000;
	/**
	 * define<br>
	 * Conversion Error : 54.1.<br>
	 * SKIPPED:<br>
	 * <i>native declaration : ./libpostproc/version.h:0</i><br>
	 * 54.1.
	 */
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final int LIBPOSTPROC_VERSION_MINOR = (int)1;
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final String LIBPOSTPROC_IDENT = (String)"postproc54.1.100";
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final int LIBPOSTPROC_BUILD = (int)((54) << 16 | (1) << 8 | (100));
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_CPU_CAPS_AUTO = (int)0x00080000;
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final int LIBPOSTPROC_VERSION_MAJOR = (int)54;
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT = (int)0x00000008;
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_CPU_CAPS_3DNOW = (int)0x40000000;
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final boolean FF_API_QP_TYPE = (boolean)(54 < 55);
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final int LIBPOSTPROC_VERSION_MICRO = (int)100;
	/** <i>native declaration : ./libpostproc/version.h</i> */
	public static final int LIBPOSTPROC_VERSION_INT = (int)((54) << 16 | (1) << 8 | (100));
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT_444 = (int)(0x00000000 | 0x00000008);
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT_440 = (int)(0x00000010 | 0x00000008);
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT_411 = (int)(0x00000002 | 0x00000008);
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT_422 = (int)(0x00000001 | 0x00000008);
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_FORMAT_420 = (int)(0x00000011 | 0x00000008);
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_CPU_CAPS_MMX = (int)0x80000000;
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_QUALITY_MAX = (int)6;
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_PICT_TYPE_QP2 = (int)0x00000010;
	/** <i>native declaration : libpostproc/postprocess.h</i> */
	public static final int PP_CPU_CAPS_MMX2 = (int)0x20000000;
	/**
	 * Return the LIBPOSTPROC_VERSION_INT constant.<br>
	 * Original signature : <code>int postproc_version()</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:4</i>
	 */
	public static native int postproc_version();
	/**
	 * Return the libpostproc build-time configuration.<br>
	 * Original signature : <code>char* postproc_configuration()</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:9</i>
	 */
	public static Pointer<Byte > postproc__configuration() {
		return Pointer.pointerToAddress(postproc_configuration(), Byte.class);
	}
	@Ptr 
	protected native static long postproc_configuration();
	/**
	 * Return the libpostproc license.<br>
	 * Original signature : <code>char* postproc_license()</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:14</i>
	 */
	public static Pointer<Byte > postproc__license() {
		return Pointer.pointerToAddress(postproc_license(), Byte.class);
	}
	@Ptr 
	protected native static long postproc_license();
	/**
	 * Original signature : <code>void pp_postprocess(const uint8_t*[3], const int[3], uint8_t*[3], const int[3], int, int, const int8_t*, int, pp_mode*, pp_context*, int)</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:5</i>
	 */
	public static void pp_postprocess(Pointer<Pointer<Byte > > src, Pointer<Integer > srcStride, Pointer<Pointer<Byte > > dst, Pointer<Integer > dstStride, int horizontalSize, int verticalSize, Pointer<Byte > QP_store, int QP_stride, Pointer<? > mode, Pointer<? > ppContext, int pict_type) {
		pp_postprocess(Pointer.getPeer(src), Pointer.getPeer(srcStride), Pointer.getPeer(dst), Pointer.getPeer(dstStride), horizontalSize, verticalSize, Pointer.getPeer(QP_store), QP_stride, Pointer.getPeer(mode), Pointer.getPeer(ppContext), pict_type);
	}
	protected native static void pp_postprocess(@Ptr long src, @Ptr long srcStride, @Ptr long dst, @Ptr long dstStride, int horizontalSize, int verticalSize, @Ptr long QP_store, int QP_stride, @Ptr long mode, @Ptr long ppContext, int pict_type);
	/**
	 * Return a pp_mode or NULL if an error occurred.<br>
	 * * @param name    the string after "-pp" on the command line<br>
	 * @param quality a number from 0 to PP_QUALITY_MAX<br>
	 * Original signature : <code>pp_mode* pp_get_mode_by_name_and_quality(const char*, int)</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:12</i>
	 */
	public static Pointer<? > pp_get_mode_by_name_and_quality(Pointer<Byte > name, int quality) {
		return Pointer.pointerToAddress(pp_get_mode_by_name_and_quality(Pointer.getPeer(name), quality));
	}
	@Ptr 
	protected native static long pp_get_mode_by_name_and_quality(@Ptr long name, int quality);
	/**
	 * Original signature : <code>void pp_free_mode(pp_mode*)</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:14</i>
	 */
	public static void pp_free_mode(Pointer<? > mode) {
		pp_free_mode(Pointer.getPeer(mode));
	}
	protected native static void pp_free_mode(@Ptr long mode);
	/**
	 * Original signature : <code>pp_context* pp_get_context(int, int, int)</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:16</i>
	 */
	public static Pointer<? > pp__get_context(int width, int height, int flags) {
		return Pointer.pointerToAddress(pp_get_context(width, height, flags));
	}
	@Ptr 
	protected native static long pp_get_context(int width, int height, int flags);
	/**
	 * Original signature : <code>void pp_free_context(pp_context*)</code><br>
	 * <i>native declaration : libpostproc/postprocess.h:18</i>
	 */
	public static void pp_free_context(Pointer<? > ppContext) {
		pp_free_context(Pointer.getPeer(ppContext));
	}
	protected native static void pp_free_context(@Ptr long ppContext);
	/**
	 * < a simple help text<br>
	 * C type : extern const char[]
	 */
	public Pointer<Byte > pp_help() {
		try {
			return (Pointer<Byte >)BridJ.getNativeLibrary("postproc").getSymbolPointer("pp_help").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).get();
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
	/**
	 * < a simple help text<br>
	 * C type : extern const char[]
	 */
	public PostprocLibrary pp_help(Pointer<Byte > pp_help) {
		try {
			{
				BridJ.getNativeLibrary("postproc").getSymbolPointer("pp_help").as(DefaultParameterizedType.paramType(Pointer.class, Byte.class)).set(pp_help);
				return this;
			}
		}catch (Throwable $ex$) {
			throw new RuntimeException($ex$);
		}
	}
}
