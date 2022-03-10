// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetVersioningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetVersioningConfigurationArgs Empty = new DatasetVersioningConfigurationArgs();

    @InputImport(name="maxVersions")
      private final @Nullable Input<Integer> maxVersions;

    public Input<Integer> getMaxVersions() {
        return this.maxVersions == null ? Input.empty() : this.maxVersions;
    }

    @InputImport(name="unlimited")
      private final @Nullable Input<Boolean> unlimited;

    public Input<Boolean> getUnlimited() {
        return this.unlimited == null ? Input.empty() : this.unlimited;
    }

    public DatasetVersioningConfigurationArgs(
        @Nullable Input<Integer> maxVersions,
        @Nullable Input<Boolean> unlimited) {
        this.maxVersions = maxVersions;
        this.unlimited = unlimited;
    }

    private DatasetVersioningConfigurationArgs() {
        this.maxVersions = Input.empty();
        this.unlimited = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetVersioningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxVersions;
        private @Nullable Input<Boolean> unlimited;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetVersioningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxVersions = defaults.maxVersions;
    	      this.unlimited = defaults.unlimited;
        }

        public Builder maxVersions(@Nullable Input<Integer> maxVersions) {
            this.maxVersions = maxVersions;
            return this;
        }

        public Builder maxVersions(@Nullable Integer maxVersions) {
            this.maxVersions = Input.ofNullable(maxVersions);
            return this;
        }

        public Builder unlimited(@Nullable Input<Boolean> unlimited) {
            this.unlimited = unlimited;
            return this;
        }

        public Builder unlimited(@Nullable Boolean unlimited) {
            this.unlimited = Input.ofNullable(unlimited);
            return this;
        }
        public DatasetVersioningConfigurationArgs build() {
            return new DatasetVersioningConfigurationArgs(maxVersions, unlimited);
        }
    }
}
