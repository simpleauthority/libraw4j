package dev.jacobandersen.libraw4j.core.data.component.image.subcomponents;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_gps_info_t;
import org.libraw.libraw_h;
import org.libraw.libraw_imgother_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record ImageGpsData(int[] raw, GpsComponents latitude, GpsComponents longitude, GpsComponents timestamp, float altitude) {
    public static ImageGpsData load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_imgother_t.ofAddress(libraw_h.libraw_get_imgother(libraw), scope);
        MemorySegment gpsData = libraw_imgother_t.parsed_gps$slice(data);

        int[] raw = libraw_imgother_t.gpsdata$slice(data).toIntArray();
        float[] latitude = libraw_gps_info_t.latitude$slice(gpsData).toFloatArray();
        float[] longitude = libraw_gps_info_t.longitude$slice(gpsData).toFloatArray();
        float[] gpsTime = libraw_gps_info_t.gpstimestamp$slice(gpsData).toFloatArray();
        float altitude = libraw_gps_info_t.altitude$get(gpsData);

        return new ImageGpsData(raw, GpsComponents.load(latitude), GpsComponents.load(longitude), GpsComponents.load(gpsTime), altitude);
    }

    public record GpsComponents(float degrees, float minutes, float seconds) {
        public static GpsComponents load(float[] data) {
            return new GpsComponents(data[0], data[1], data[2]);
        }
    }
}
