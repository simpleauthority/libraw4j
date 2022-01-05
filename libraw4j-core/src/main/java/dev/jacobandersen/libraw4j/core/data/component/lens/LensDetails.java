package dev.jacobandersen.libraw4j.core.data.component.lens;

import dev.jacobandersen.libraw4j.core.data.component.lens.subcomponents.AccessoryDetails;
import dev.jacobandersen.libraw4j.core.data.constants.CameraFormat;
import dev.jacobandersen.libraw4j.core.data.constants.FocalType;
import dev.jacobandersen.libraw4j.core.data.constants.LensMount;
import dev.jacobandersen.libraw4j.core.util.StringUtil;
import jdk.incubator.foreign.MemorySegment;
import org.libraw.libraw_data_t;
import org.libraw.libraw_lensinfo_t;
import org.libraw.libraw_makernotes_lens_t;

/**
 * @author Jacob Andersen
 * @since 1.0.0-SNAPSHOT
 */
public record LensDetails(long id, String name, short formatId, CameraFormat format, int mountId, LensMount mount,
                          String body, short rawFocalType, FocalType focalType, String namePrefix, String nameSuffix,
                          float minimumFocalLength, float maximumFocalLength, float minApertureAtMinFocalLength,
                          float minApertureAtMaxFocalLength, float maxApertureAtMinFocalLength,
                          float maxApertureAtMaxFocalLength, float minimumAperture, float maximumAperture,
                          float minimumFocusDistance, float numberOfFStops, AccessoryDetails accessoryDetails) {

    /**
     * Loads lens details from the given memory address.
     *
     * @param librawData The segment of memory containing the libraw data.
     * @return the loaded lens details
     */
    public static LensDetails load(MemorySegment librawData) {
        MemorySegment data = libraw_data_t.lens$slice(librawData);
        MemorySegment makerNotes = libraw_lensinfo_t.makernotes$slice(data);

        // LensDetails fields
        long lensId = libraw_makernotes_lens_t.LensID$get(makerNotes);
        String name = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.Lens$slice(makerNotes).toByteArray());
        short formatId = libraw_makernotes_lens_t.LensFormat$get(makerNotes);
        CameraFormat format = CameraFormat.fromValue(formatId);
        short mountId = libraw_makernotes_lens_t.LensMount$get(makerNotes);
        LensMount mount = LensMount.fromValue(mountId);
        String body = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.body$slice(makerNotes).toByteArray());
        short rawFocalType = libraw_makernotes_lens_t.FocalType$get(makerNotes);
        FocalType focalType = FocalType.fromValue(rawFocalType);
        String namePrefix = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.LensFeatures_pre$slice(makerNotes).toByteArray());
        String nameSuffix = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.LensFeatures_suf$slice(makerNotes).toByteArray());
        float minimumFocalLength = libraw_makernotes_lens_t.MinFocal$get(makerNotes);
        float maximumFocalLength = libraw_makernotes_lens_t.MaxFocal$get(makerNotes);
        float minApertureAtMinFocalLength = libraw_makernotes_lens_t.MinAp4MinFocal$get(makerNotes);
        float minApertureAtMaxFocalLength = libraw_makernotes_lens_t.MinAp4MaxFocal$get(makerNotes);
        float maxApertureAtMinFocalLength = libraw_makernotes_lens_t.MaxAp4MinFocal$get(makerNotes);
        float maxApertureAtMaxFocalLength = libraw_makernotes_lens_t.MaxAp4MaxFocal$get(makerNotes);
        float minimumAperture = libraw_makernotes_lens_t.MinAp$get(makerNotes);
        float maximumAperture = libraw_makernotes_lens_t.MaxAp$get(makerNotes);
        float minimumFocusDistance = libraw_makernotes_lens_t.MinFocusDistance$get(makerNotes);
        float numberOfFStops = libraw_makernotes_lens_t.LensFStops$get(makerNotes);

        // AccessoryDetails fields
        long teleconverterId = libraw_makernotes_lens_t.TeleconverterID$get(makerNotes);
        String teleconverterName = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.Teleconverter$slice(makerNotes).toByteArray());
        long adapterId = libraw_makernotes_lens_t.AdapterID$get(makerNotes);
        String adapterName = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.Adapter$slice(makerNotes).toByteArray());
        long attachmentId = libraw_makernotes_lens_t.AttachmentID$get(makerNotes);
        String attachmentName = StringUtil.readNullTerminatedString(libraw_makernotes_lens_t.Attachment$slice(makerNotes).toByteArray());

        return new LensDetails(
                lensId, name, formatId, format, mountId, mount, body, rawFocalType, focalType,
                namePrefix, nameSuffix, minimumFocalLength, maximumFocalLength, minApertureAtMinFocalLength,
                minApertureAtMaxFocalLength, maxApertureAtMinFocalLength, maxApertureAtMaxFocalLength,
                minimumAperture, maximumAperture, minimumFocusDistance, numberOfFStops,
                new AccessoryDetails(
                        teleconverterId, teleconverterName, adapterId, adapterName, attachmentId, attachmentName
                )
        );
    }
}
