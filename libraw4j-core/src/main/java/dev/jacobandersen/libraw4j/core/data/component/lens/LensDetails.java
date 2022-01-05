package dev.jacobandersen.libraw4j.core.data.component.lens;

import dev.jacobandersen.libraw4j.core.data.component.lens.subcomponents.AccessoryDetails;
import dev.jacobandersen.libraw4j.core.data.constants.CameraFormat;
import dev.jacobandersen.libraw4j.core.data.constants.FocalType;
import dev.jacobandersen.libraw4j.core.data.constants.LensMount;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;
import org.libraw.libraw_h;
import org.libraw.libraw_lensinfo_t;
import org.libraw.libraw_makernotes_lens_t;

import java.nio.charset.StandardCharsets;

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
     * @param libraw the libraw instance
     * @param scope the scope to use
     * @return the loaded lens details
     */
    public static LensDetails load(MemoryAddress libraw, ResourceScope scope) {
        MemorySegment data = libraw_lensinfo_t.ofAddress(libraw_h.libraw_get_lensinfo(libraw), scope);
        MemorySegment makerNotes = libraw_lensinfo_t.makernotes$slice(data);

        // LensDetails fields
        long lensId = libraw_makernotes_lens_t.LensID$get(makerNotes);
        String name = new String(libraw_makernotes_lens_t.Lens$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
        short formatId = libraw_makernotes_lens_t.LensFormat$get(makerNotes);
        CameraFormat format = CameraFormat.fromValue(formatId);
        short mountId = libraw_makernotes_lens_t.LensMount$get(makerNotes);
        LensMount mount = LensMount.fromValue(mountId);
        String body = new String(libraw_makernotes_lens_t.body$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
        short rawFocalType = libraw_makernotes_lens_t.FocalType$get(makerNotes);
        FocalType focalType = FocalType.fromValue(rawFocalType);
        String namePrefix = new String(libraw_makernotes_lens_t.LensFeatures_pre$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
        String nameSuffix = new String(libraw_makernotes_lens_t.LensFeatures_suf$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
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
        String teleconverterName = new String(libraw_makernotes_lens_t.Teleconverter$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
        long adapterId = libraw_makernotes_lens_t.AdapterID$get(makerNotes);
        String adapterName = new String(libraw_makernotes_lens_t.Adapter$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);
        long attachmentId = libraw_makernotes_lens_t.AttachmentID$get(makerNotes);
        String attachmentName = new String(libraw_makernotes_lens_t.Attachment$slice(makerNotes).toByteArray(), StandardCharsets.UTF_8);

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

    /**
     * The ID of the lens.
     * <p>The value here is compatible with exiftool. You may refer to exiftool for further details.</p>
     * @return the ID of the lens
     */
    @Override
    public long id() {
        return id;
    }

    /**
     * The name of the lens as presented in the maker notes.
     * @return the name of the lens
     */
    @Override
    public String name() {
        return name;
    }

    /**
     * The raw lens format ID. This is the index found in the {@link CameraFormat} enum. It is provided here in case
     * format resolution fails.
     * @return the raw lens format ID
     */
    @Override
    public short formatId() {
        return formatId;
    }

    /**
     * The lens format.
     * @return the lens format
     */
    @Override
    public CameraFormat format() {
        return format;
    }

    /**
     * The raw lens mount ID. This is the index found in the {@link LensMount} enum. It is provided here in case
     * mount resolution fails.
     * @return the raw lens mount ID
     */
    @Override
    public int mountId() {
        return mountId;
    }

    /**
     * The lens mount.
     * @return the lens mount
     */
    @Override
    public LensMount mount() {
        return mount;
    }

    /**
     * This field may be empty. In some cases the maker notes for a medium format (MF) camera contain a body ID or
     * body name. The name is copied here if it exists. If there is an ID, it is converted to a name and copied here.
     * Otherwise, the field is left empty.
     * @return the body field
     */
    @Override
    public String body() {
        return body;
    }

    /**
     * The raw focal type ID. This is the index found in the {@link FocalType} enum. It is provided here in case
     * focal type resolution fails.
     * @return the raw focal type ID
     */
    @Override
    public short rawFocalType() {
        return rawFocalType;
    }

    /**
     * The focal type.
     * @return the focal type
     */
    @Override
    public FocalType focalType() {
        return focalType;
    }

    /**
     * The data found before the lens name. May help with further lens identification.
     * @return the name prefix
     */
    @Override
    public String namePrefix() {
        return namePrefix;
    }

    /**
     * The data found after the lens name. May help with further lens identification.
     * @return the name suffix
     */
    @Override
    public String nameSuffix() {
        return nameSuffix;
    }

    /**
     * The minimum focal length.
     * @return the minimum focal length
     */
    @Override
    public float minimumFocalLength() {
        return minimumFocalLength;
    }

    /**
     * The maximum focal length.
     * @return the maximum focal length
     */
    @Override
    public float maximumFocalLength() {
        return maximumFocalLength;
    }

    /**
     * The minimum aperture at the minimum focal length.
     * @return the minimum aperture at the minimum focal length
     */
    @Override
    public float minApertureAtMinFocalLength() {
        return minApertureAtMinFocalLength;
    }

    /**
     * The minimum aperture at the maximum focal length.
     * @return the minimum aperture at the maximum focal length
     */
    @Override
    public float minApertureAtMaxFocalLength() {
        return minApertureAtMaxFocalLength;
    }

    /**
     * The maximum aperture at the minimum focal length.
     * @return the maximum aperture at the minimum focal length
     */
    @Override
    public float maxApertureAtMinFocalLength() {
        return maxApertureAtMinFocalLength;
    }

    /**
     * The maximum aperture at the maximum focal length.
     * @return the maximum aperture at the maximum focal length
     */
    @Override
    public float maxApertureAtMaxFocalLength() {
        return maxApertureAtMaxFocalLength;
    }

    /**
     * The minimum aperture.
     * @return the minimum aperture
     */
    @Override
    public float minimumAperture() {
        return minimumAperture;
    }

    /**
     * The maximum aperture.
     * @return the maximum aperture
     */
    @Override
    public float maximumAperture() {
        return maximumAperture;
    }

    /**
     * The minimum distance a subject must be from the lens for focusing to be effective.
     * @return the minimum focus distance
     */
    @Override
    public float minimumFocusDistance() {
        return minimumFocusDistance;
    }

    /**
     * The number of F-stops this lens can handle.
     * @return the number of F-stops
     */
    @Override
    public float numberOfFStops() {
        return numberOfFStops;
    }
}
