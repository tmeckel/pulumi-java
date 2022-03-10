// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSetGeoSpatialColumnGroup;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Groupings of columns that work together in certain Amazon QuickSight features. This is
 *             a variant type structure. For this structure to be valid, only one of the attributes can
 *             be non-null.</p>
 * 
 */
public final class DataSetColumnGroup extends io.pulumi.resources.InvokeArgs {

    public static final DataSetColumnGroup Empty = new DataSetColumnGroup();

    @InputImport(name="geoSpatialColumnGroup")
      private final @Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup;

    public Optional<DataSetGeoSpatialColumnGroup> getGeoSpatialColumnGroup() {
        return this.geoSpatialColumnGroup == null ? Optional.empty() : Optional.ofNullable(this.geoSpatialColumnGroup);
    }

    public DataSetColumnGroup(@Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup) {
        this.geoSpatialColumnGroup = geoSpatialColumnGroup;
    }

    private DataSetColumnGroup() {
        this.geoSpatialColumnGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetColumnGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetColumnGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.geoSpatialColumnGroup = defaults.geoSpatialColumnGroup;
        }

        public Builder geoSpatialColumnGroup(@Nullable DataSetGeoSpatialColumnGroup geoSpatialColumnGroup) {
            this.geoSpatialColumnGroup = geoSpatialColumnGroup;
            return this;
        }
        public DataSetColumnGroup build() {
            return new DataSetColumnGroup(geoSpatialColumnGroup);
        }
    }
}
