
#ifndef AVUTIL_VERSION_H
#define AVUTIL_VERSION_H

#define AV_VERSION_INT(a, b, c) (a<<16 | b<<8 | c)
#define AV_VERSION_DOT(a, b, c) a ##.## b ##.## c
#define AV_VERSION(a, b, c) AV_VERSION_DOT(a, b, c)

#define LIBAVUTIL_VERSION_MAJOR  52
#define LIBAVUTIL_VERSION_MINOR  66
#define LIBAVUTIL_VERSION_MICRO 100

#define LIBAVUTIL_VERSION_INT   AV_VERSION_INT(LIBAVUTIL_VERSION_MAJOR, \
                                               LIBAVUTIL_VERSION_MINOR, \
                                               LIBAVUTIL_VERSION_MICRO)
#define LIBAVUTIL_VERSION       AV_VERSION(LIBAVUTIL_VERSION_MAJOR,     \
                                           LIBAVUTIL_VERSION_MINOR,     \
                                           LIBAVUTIL_VERSION_MICRO)
#define LIBAVUTIL_BUILD         LIBAVUTIL_VERSION_INT

#define LIBAVUTIL_IDENT         "Lavu52.66.100"

#ifndef FF_API_GET_BITS_PER_SAMPLE_FMT
#define FF_API_GET_BITS_PER_SAMPLE_FMT (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_FIND_OPT
#define FF_API_FIND_OPT                 (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_OLD_AVOPTIONS
#define FF_API_OLD_AVOPTIONS            (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_PIX_FMT
#define FF_API_PIX_FMT                  (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_CONTEXT_SIZE
#define FF_API_CONTEXT_SIZE             (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_PIX_FMT_DESC
#define FF_API_PIX_FMT_DESC             (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_AV_REVERSE
#define FF_API_AV_REVERSE               (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_AUDIOCONVERT
#define FF_API_AUDIOCONVERT             (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_CPU_FLAG_MMX2
#define FF_API_CPU_FLAG_MMX2            (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_SAMPLES_UTILS_RETURN_ZERO
#define FF_API_SAMPLES_UTILS_RETURN_ZERO (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_LLS_PRIVATE
#define FF_API_LLS_PRIVATE              (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_LLS1
#define FF_API_LLS1                     (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_AVFRAME_LAVC
#define FF_API_AVFRAME_LAVC             (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_VDPAU
#define FF_API_VDPAU                    (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_GET_CHANNEL_LAYOUT_COMPAT
#define FF_API_GET_CHANNEL_LAYOUT_COMPAT (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_OLD_OPENCL
#define FF_API_OLD_OPENCL               (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_XVMC
#define FF_API_XVMC                     (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_INTFLOAT
#define FF_API_INTFLOAT                 (LIBAVUTIL_VERSION_MAJOR < 54)
#endif
#ifndef FF_API_OPT_TYPE_METADATA
#define FF_API_OPT_TYPE_METADATA        (LIBAVUTIL_VERSION_MAJOR < 54)
#endif

#endif /* AVUTIL_VERSION_H */

